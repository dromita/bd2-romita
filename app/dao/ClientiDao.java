package dao;

import model.ClientiEntity;
import model.ServiziEntity;
import model.service.ClienteElencoServizi;
import model.service.ServizioConData;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.math.BigInteger;
import java.sql.Date;
import java.util.LinkedList;
import java.util.List;


/**
 * Created by Nomak on 15/07/2015.
 */
public class ClientiDao extends DaoService<ClientiEntity, Integer> {
    EntityManager em = super.getEntityManager();

    public BigInteger getNumNoleggi(){
//        Query q = em.createQuery("SELECT count(id) FROM clienti WHERE noloAccessori = 'true'");
        Query q = em.createNativeQuery("SELECT count(id) FROM fruizione_servizi_clienti WHERE nolo_accessori = 'true'");
        return (BigInteger)q.getSingleResult();
    }

    public List<ClientiEntity> getAllClienti(){
        Query q = em.createQuery("from clienti");

        return q.getResultList();
    }

    public ClientiEntity getCliente(int idCliente){
        return (ClientiEntity) em.createQuery("FROM clienti WHERE id = :idCliente").setParameter("idCliente", idCliente).getSingleResult();
    }

    public ClienteElencoServizi getDetailedCliente(int idCliente){
        ClientiEntity cliente = getCliente(idCliente);
//
//        String sDetailPromo = "SELECT promo_servizi FROM promo_servizi WHERE id = :promoId";
//        //List<PromoServiziEntity> listPromoServizi = em.createNativeQuery(sDetailPromo).getResultList();
//        // uso direttamente il vettore di oggetti perch immagino che non sappia fare il mapping diretto, essendo il controller di un'altra classe
//        List<Object[]> listPromoServizi = em.createNativeQuery(sDetailPromo).setParameter("promoId", promo.getId()).getResultList();

        String elencoServizi = "Servizi: " + getElencoServizi(cliente.getId());
        ClienteElencoServizi promoServ = new ClienteElencoServizi(cliente.getNome() + cliente.getCognome(), cliente.getId(), elencoServizi);

        return promoServ;
    }

    public String getElencoServizi(int idCliente){
        StringBuilder elenco = new StringBuilder();
        List<ServizioConData> listaServizi = getServiziFruiti(idCliente);

        for (ServizioConData servizio : listaServizi){
            elenco.append("\n\t" + servizio + ", ");
        }

        return (elenco.substring(0, elenco.length() - 2) + "\n\n");
    }

    public List<ServizioConData> getServiziFruiti(int idCliente){
        List<Object[]> listaRifServizi = em.createNativeQuery("SELECT * FROM fruizione_servizi_clienti WHERE cliente = :idCliente").setParameter("idCliente", idCliente).getResultList();
        List<ServizioConData> listaServizi = new LinkedList<>();

        for (Object[] o : listaRifServizi){
            ServiziEntity servizio =
                    (ServiziEntity) em.createNativeQuery("SELECT * FROM servizi WHERE nome = :nomeServ ")
                            .setParameter("nomeServ", (String) o[1])
                            .getSingleResult();
            Date dataFruizione = (Date) o[3];
            listaServizi.add(new ServizioConData(servizio, dataFruizione.toString()));
        }

        return listaServizi;
    }

}
