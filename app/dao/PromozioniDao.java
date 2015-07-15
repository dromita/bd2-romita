package dao;

import model.PromoServiziEntity;
import model.PromozioniEntity;
import model.service.PromoListaServizi;
import play.mvc.Result;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
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

    public List<PromoListaServizi> getDetailedPromos(){
        List<PromozioniEntity> listPromo = getAllPromos();
        List<PromoListaServizi> result = new ArrayList<>();

        for (PromozioniEntity promo : listPromo) {
            String sDetailPromo = "SELECT promo_servizi FROM promo_servizi WHERE id = :promoId";
            //List<PromoServiziEntity> listPromoServizi = em.createNativeQuery(sDetailPromo).getResultList();
            // uso direttamente il vettore di oggetti perchè immagino che non sappia fare il mapping diretto, essendo il controller di un'altra classe
            List<Object[]> listPromoServizi = em.createNativeQuery(sDetailPromo).setParameter("promoId", promo.getId()).getResultList();

            PromoListaServizi promoServ = new PromoListaServizi();
            StringBuilder elencoServizi = new StringBuilder();

            for (Object[] o : listPromoServizi){

                // SELECT Servizio
                // concatena nome servizio in elencoServizi
            }

            // genera oggetto PromoListaServizi
            //aggiungilo a result
        }
    }

}
