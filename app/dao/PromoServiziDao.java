package dao;

import model.PromoServiziEntity;

import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * Created by Nomak on 15/07/2015.
 */
public class PromoServiziDao extends DaoService<PromoServiziEntity, Integer> {
    EntityManager em = super.getEntityManager();


}
