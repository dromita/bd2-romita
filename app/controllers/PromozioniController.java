package controllers;

import dao.PromozioniDao;
import model.PromozioniEntity;
import model.service.PromoElencoServizi;
import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * Created by Nomak on 15/07/2015.
 */
public class PromozioniController extends Controller {

    @Transactional
    public static Result aggiungiPromozione(){
        Form<PromozioniEntity> form = Form.form(PromozioniEntity.class).bindFromRequest();

        PromozioniEntity promozione = form.get();

        // if (promozione.isNull()) return badRequest(views.html.promozione.render(form));

        PromozioniDao promoDao = new PromozioniDao();
        promoDao.persist(promozione);

        //TODO
        // FAI COMPARIRE ELENCO di TUTTI i servizi
        // oppure permetti di inserire i nomi dei servizi testualmente
        // AGGIUNGI le n tuple PromoServizi

        return ok("promozione inserito");
    }

    @Transactional
    public static Result showTopPromo(){
        // if (promozione.isNull()) return badRequest(views.html.promozione.render(form));

        PromozioniDao promoDao = new PromozioniDao();
        PromozioniEntity top = promoDao.getTopPromo();

        return ok(String.format("Promozione migliore: %s per %s euro, codice %s", top.getNome(), top.getCosto(), top.getId()));
    }

    @Transactional
    public static Result showAllPromos(){
        PromozioniDao promoDao = new PromozioniDao();
        List<PromozioniEntity> promozioni = promoDao.getAllPromos();

        return ok("mi devi ancora implementare bene in showAllPromos");
        // return ok(views.html.promozioni.render(promozioni));
    }

    @Transactional
    public static Result show() {
        Form<PromozioniEntity> promozioneForm = Form.form(model.PromozioniEntity.class);

        return ok("mi devi ancora implementare bene in show di promozioni");
        //return ok(views.html.promozioni.render(promozioneForm));
    }

    @Transactional
    public static Result getPromo(int idPromo){
        PromozioniDao dao = new PromozioniDao();
        PromoElencoServizi promo = dao.getDetailedPromo(idPromo);

        return ok(promo.toString());
    }

}
