package dao;

import model.PromoVenditeEntity;

import javax.persistence.EntityManager;

/**
 * Created by Nomak on 15/07/2015.
 */
public class PromoVenditeDao extends DaoService<PromoVenditeEntity, Integer> {
    EntityManager em = super.getEntityManager();
}
