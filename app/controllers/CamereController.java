package controllers;

import model.CamereEntity;
import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by Nomak on 15/07/2015.
 */
public class CamereController extends Controller {

    @Transactional
    public static Result aggiungiCamera(){
        Form<CamereEntity> form = Form.form(CamereEntity.class).bindFromRequest();

        CamereEntity camera = form.get();

        // if (camera.isNull()) return badRequest(views.html.camera.render(form));

        return ok("Camera inserita");
    }
//
//    @Transactional
//    public static Result show() {
//        Form<CamereEntity> cameraForm = Form.form(model.CamereEntity.class);
//
//        return ok(views.html.camere.render(cameraForm));
//    }

}
