package dao;

import model.PromoServiziEntity;
import model.PromozioniEntity;
import model.ServiziEntity;
import model.service.PromoListaServizi;
import play.mvc.Result;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nomak on 15/07/2015.
 */
public class PromozioniDao extends DaoService<PromozioniEntity, Integer> {
    EntityManager em = super.getEntityManager();

    public PromozioniEntity getTopPromo(){
        Query q = em.createQuery("SELECT get_top_promo()");

        Integer idPromo = (Integer)q.getSingleResult();

        q = em.createQuery("FROM promozioni WHERE id = :idPromo").setParameter("idPromo", idPromo);

        return (PromozioniEntity)q.getSingleResult();
    }

    public List<PromozioniEntity> getAllPromos(){
        return em.createQuery("FROM promozioni").getResultList();
    }

    public String getElencoServizi(int idPromo){
        StringBuilder elenco = new StringBuilder();
        List<ServiziEntity> listaServizi = getServizi(idPromo);

        for (ServiziEntity servizio : listaServizi){
            elenco.append(servizio.getNome() + ", ");
        }

        return elenco.substring(0, elenco.length() - 2);
    }

    public List<ServiziEntity> getServizi(int idPromo){
        List<Object[]> listaRifServizi = em.createQuery("SELECT * FROM promo_servizi WHERE promo = :idPromo").setParameter("idPromo", idPromo).getResultList();
        List<ServiziEntity> listaServizi = new LinkedList<>();

        for (Object[] o : listaRifServizi){
            ServiziEntity servizio =
                    (ServiziEntity) em.createNativeQuery("SELECT * FROM servizi WHERE nome = :nomeServ ")
                            .setParameter("nomeServ", (String) o[2])
                            .getSingleResult();

            listaServizi.add(servizio);
        }

        return listaServizi;
    }

    public List<PromoListaServizi> getDetailedPromosAll(){
        List<PromozioniEntity> listPromo = getAllPromos();
        List<PromoListaServizi> result = new LinkedList<>();

        for (PromozioniEntity promo : listPromo) {
            String sDetailPromo = "SELECT promo_servizi FROM promo_servizi WHERE id = :promoId";
            //List<PromoServiziEntity> listPromoServizi = em.createNativeQuery(sDetailPromo).getResultList();
            // uso direttamente il vettore di oggetti perchè immagino che non sappia fare il mapping diretto, essendo il controller di un'altra classe
            List<Object[]> listPromoServizi = em.createNativeQuery(sDetailPromo).setParameter("promoId", promo.getId()).getResultList();

            String elencoServizi = "Servizi: " + getElencoServizi(promo.getId());

//            for (Object[] o : listPromoServizi){
//
//                ServiziEntity servizio =
//                        (ServiziEntity) em.createNativeQuery("SELECT * FROM servizi WHERE nome = :nomeServ ")
//                                .setParameter("nomeServ", (String) o[2])
//                                .getSingleResult();
//
//                elencoServizi.append(servizio.getNome() + ", ");
//            }

            PromoListaServizi promoServ = new PromoListaServizi(promo.getNome(), promo.getCosto(), elencoServizi);
            result.add(promoServ);
        }

        return result;
    }



}
