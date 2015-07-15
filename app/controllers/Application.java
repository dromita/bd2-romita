package controllers;

import dao.CamereDao;
import dao.ClientiDao;
import play.*;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.*;


import views.html.*;

public class Application extends Controller {
    @Transactional
    public static Result index() {

        ClientiDao dao = new ClientiDao();
        return ok(Json.toJson(dao.getAllClienti()));
    }

}
