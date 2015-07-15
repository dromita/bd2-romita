package controllers;

import dao.PromozioniDao;
import model.PromozioniEntity;
import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

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

        // FAI COMPARIRE ELENCO di TUTTI i servizi
        // oppure permetti di inserire i nomi dei servizi testualmente
        // AGGIUNGI le n tuple PromoServizi

        return ok("promozione inserito");
    }
//
//    @Transactional
//    public static Result show() {
//        Form<PromozioniEntity> promozioneForm = Form.form(model.PromozioniEntity.class);
//
//        return ok(views.html.promozioni.render(promozioneForm));
//    }

}
