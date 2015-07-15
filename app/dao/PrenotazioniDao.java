package dao;

import model.PrenotazioniEntity;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Nomak on 15/07/2015.
 */
public class PrenotazioniDao extends DaoService<PrenotazioniEntity, Integer> {
    EntityManager em = super.getEntityManager();

    public float getPermanenzaMedia(){
        Query q = em.createQuery("SELECT AVG(numGiorni) FROM prenotazioni");

        return (Float)q.getSingleResult();
    }

    public List<PrenotazioniEntity> getAllPrenotazioni(){
        Query q = em.createQuery("from prenotazioni");

        return q.getResultList();
    }
}
