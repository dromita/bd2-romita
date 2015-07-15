package controllers;

import model.ServiziEntity;
import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by Nomak on 15/07/2015.
 */
public class ServiziController extends Controller {

    @Transactional
    public static Result aggiungiServizio(){
        Form<ServiziEntity> form = Form.form(ServiziEntity.class).bindFromRequest();

        ServiziEntity servizio = form.get();

        // if (servizio.isNull()) return badRequest(views.html.servizio.render(form));

        return ok("servizio inserito");
    }
//
//    @Transactional
//    public static Result show() {
//        Form<ServiziEntity> servizioForm = Form.form(model.ServiziEntity.class);
//
//        return ok(views.html.servizi.render(servizioForm));
//    }

}
