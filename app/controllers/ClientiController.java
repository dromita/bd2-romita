package controllers;

import dao.ClientiDao;
import model.ClientiEntity;
import model.forms.ClienteForm;
import model.service.ClienteElencoServizi;
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

        ClientiDao clienteDao = new ClientiDao();
        clienteDao.persist(cliente);

        return ok("Cliente inserito");
    }

    @Transactional
    public static Result getNumNoleggi(){

        ClientiDao dao = new ClientiDao();

        Integer quantita = dao.getNumNoleggi();

        return ok("Numero clienti che hanno effettuato il noleggio " + quantita);
    }

    @Transactional
    public static Result show() {
        Form<ClienteForm> clienteForm = Form.form(model.forms.ClienteForm.class);

        return ok("mi devi ancora definire bene in show di cliente");
        //return ok(views.html.clienti.render(clienteForm));
    }

    @Transactional
    public static Result getServiziCliente(Integer idCliente){
        ClientiDao dao = new ClientiDao();
        ClienteElencoServizi cliente = dao.getDetailedCliente(idCliente);

        return ok(cliente.toString());
    }

}
