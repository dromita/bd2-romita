package dao;

import model.PromozioniEntity;

import javax.persistence.EntityManager;
import javax.persistence.Query;
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
}
