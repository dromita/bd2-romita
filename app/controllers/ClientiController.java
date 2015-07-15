package controllers;

import dao.ClientiDao;
import model.ClientiEntity;
import model.forms.ClienteForm;
import model.service.ClienteElencoServizi;
import play.data.Form;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.List;

/**
 * Created by Nomak on 15/07/2015.
 */
public class ClientiController extends Controller {

    @Transactional
    public static Result aggiungiCliente(){
        Form<ClienteForm> form = Form.form(ClienteForm.class).bindFromRequest();

        ClienteForm f_cliente = form.get();
        ClientiEntity cliente = f_cliente.toEntity();

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

        return ok(views.html.clienti.render(clienteForm));
        //return ok(views.html.clienti.render(clienteForm));
    }

    @Transactional
    public static Result getServiziCliente(Integer idCliente){
        ClientiDao dao = new ClientiDao();
        ClienteElencoServizi cliente = dao.getDetailedCliente(idCliente);

        return ok(cliente.toString());
    }

    @Transactional
    public static Result show_all_clients(){

        ClientiDao dao = new ClientiDao();
        List<ClientiEntity> clients = dao.getAllClienti();

        return ok(views.html.clientiView.render(clients));
    }
}
