package controllers;

import dao.PromoServiziDao;
import dao.PromozioniDao;
import model.PromoServiziEntity;
import model.PromozioniEntity;
import model.ServiziEntity;
import model.forms.PromoServiziForm;
import model.service.PromoElencoServizi;
import model.singleton.TopPromo;
import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Nomak on 15/07/2015.
 */
public class PromozioniController extends Controller {


    @Transactional
    public static Result showTopPromo() {
        // if (promozione.isNull()) return badRequest(views.html.promozione.render(form));

        PromozioniDao promoDao = new PromozioniDao();
        PromozioniEntity top = promoDao.getTopPromo();
        TopPromo topPromo = new TopPromo();
        topPromo.nome = top.getNome();
        topPromo.costo = String.valueOf(top.getCosto());
        topPromo.numNotti = String.valueOf(top.getNumNotti());
        topPromo.tipoCamera = String.valueOf(top.getTipoCamera());

        List<ServiziEntity> listaServizi = new PromozioniDao().getServizi(top.getId());
        topPromo.servizi = listaServizi.stream()
                .map(s -> s.getNome())
                .collect(Collectors.toList());

        return ok(views.html.promovendite.render(topPromo));
    }

    @Transactional
    public static Result showAllPromos() {
        PromozioniDao promoDao = new PromozioniDao();
        List<PromozioniEntity> promozioni = promoDao.getAllPromos();

        return ok("mi devi ancora implementare bene in showAllPromos");
        // return ok(views.html.promozioni.render(promozioni));
    }


    public static Result show() {
        Form<PromoServiziForm> form = Form.form(model.forms.PromoServiziForm.class);

        return ok(views.html.promoNuova.render(form));
        //return ok(views.html.promozioni.render(promozioneForm));
    }

    @Transactional
    public static Result aggiungiPromoServizi() {
        Form<PromoServiziForm> form = Form.form(model.forms.PromoServiziForm.class).bindFromRequest();

        PromoServiziForm promoServizi = form.get();

        PromozioniEntity promo = promoServizi.getPromoEntity();
        new PromozioniDao().persist(promo);

        List<PromoServiziEntity> listaPromoServ = promoServizi.getPromoServiziEntity(promo.getId());

        for (PromoServiziEntity pse : listaPromoServ)
            new PromoServiziDao().persist(pse);

        return ok("Promozione salvata");

    }


    @Transactional
    public static Result getPromo(int idPromo) {
        PromozioniDao dao = new PromozioniDao();
        PromoElencoServizi promo = dao.getDetailedPromo(idPromo);

        return ok(promo.toString());
    }


}
