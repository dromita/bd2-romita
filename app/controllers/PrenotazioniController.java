package controllers;

import model.PrenotazioniEntity;
import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by Nomak on 15/07/2015.
 */
public class PrenotazioniController extends Controller {

    @Transactional
    public static Result aggiungiPrenotazione(){
        Form<PrenotazioniEntity> form = Form.form(PrenotazioniEntity.class).bindFromRequest();

        PrenotazioniEntity prenotazione = form.get();

        // if (prenotazione.isNull()) return badRequest(views.html.prenotazione.render(form));

        return ok("prenotazione inserito");
    }

    @Transactional
    public static Result show() {
        Form<PrenotazioniEntity> prenotazioneForm = Form.form(model.PrenotazioniEntity.class);

        return ok("Mi devi ancora implementare in show prenotazioni");
        //return ok(views.html.prenotazioni.render(prenotazioneForm));
    }

}
