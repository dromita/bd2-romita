package dao;

import model.ClientiEntity;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


/**
 * Created by Nomak on 15/07/2015.
 */
public class ClientiDao extends DaoService<ClientiEntity, Integer> {
    EntityManager em = super.getEntityManager();

    public int getNumNoleggi(){
        Query q = em.createQuery("SELECT count(id) FROM clienti WHERE noloAccessori = 'true'");

        return (Integer)q.getSingleResult();
    }

    public List<ClientiEntity> getAllClienti(){
        Query q = em.createQuery("from clienti");

        return q.getResultList();
    }
}
