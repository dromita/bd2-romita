package dao;

import model.CamereEntity;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import java.util.List;

/**
 * Created by Nomak on 14/07/2015.
 */
public class CamereDao extends DaoService<CamereEntity, Short> {
    EntityManager em = super.getEntityManager();

    public List<CamereEntity> getAllCamere(){
        Query q = em.createQuery("from camere");

        return q.getResultList();
    }
}
