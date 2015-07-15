package controllers;

import model.ClientiEntity;
import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by Nomak on 15/07/2015.
 */
public class ClientiController extends Controller {

    @Transactional
    public static Result aggiungiCliente(){
        Form<ClientiEntity> form = Form.form(ClientiEntity.class).bindFromRequest();

        ClientiEntity cliente = form.get();

        // if (cliente.isNull()) return badRequest(views.html.cliente.render(form));

        return ok("Cliente inserito");
    }

//    @Transactional
//    public static Result show() {
//        Form<ClientiEntity> clienteForm = Form.form(model.ClientiEntity.class);
//
//        return ok(views.html.clienti.render(clienteForm));
//    }

}