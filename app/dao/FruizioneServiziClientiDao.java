package dao;

import model.FruizioneServiziClientiEntity;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * Created by Nomak on 15/07/2015.
 */
public class FruizioneServiziClientiDao extends DaoService<FruizioneServiziClientiEntity, Integer> {
    EntityManager em = super.getEntityManager();


}
