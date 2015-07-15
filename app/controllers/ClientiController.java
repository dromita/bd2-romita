package controllers;

import dao.ClientiDao;
import dao.FruizioneServiziClientiDao;
import model.ClientiEntity;
import model.FruizioneServiziClientiEntity;
import model.forms.ClienteForm;
import model.forms.ServiziClientiForm;
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

        Form<ServiziClientiForm> servizi_form = Form.form(model.forms.ServiziClientiForm.class);
        return ok(views.html.clienteServizi.render(cliente, servizi_form));
    }


    @Transactional
    public static Result aggiungiServiziCliente(Integer codiceCliente){
        Form<ServiziClientiForm> form = Form.form(ServiziClientiForm.class).bindFromRequest();

        ServiziClientiForm serviziClienti = form.get();

        serviziClienti.codiceCliente = codiceCliente;

        List<FruizioneServiziClientiEntity> fsc = serviziClienti.toEntity();

        for (FruizioneServiziClientiEntity entita : fsc){
            new FruizioneServiziClientiDao().persist(entita);
        }

        return ok("Servizi aggiunti");
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
