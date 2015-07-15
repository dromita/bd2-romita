package dao;

import model.ServiziEntity;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Nomak on 15/07/2015.
 */
public class ServiziDao extends DaoService<ServiziEntity, String> {
    EntityManager em = super.getEntityManager();

    public List<ServiziEntity> getAllServizi(){
        return em.createQuery("FROM servizi").getResultList();
    }
}
