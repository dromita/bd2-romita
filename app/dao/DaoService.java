package dao;

import play.db.jpa.JPA;
import play.db.jpa.Transactional;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * Author: alexander
 * Project: tempserver-playframework
 */
public class DaoService<T, PK extends Serializable> {

    protected EntityManager entityManager = JPA.em();
    private Class<T> entityClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];

    @Transactional
    public void persist(T e) {
        getEntityManager().persist(e);
    }

    @Transactional
    public void remove(PK id) throws Exception {
        getEntityManager().remove((T) getEntityManager().find(getEntityClass(), id));

    }

    public T findById(PK id) throws Exception {
        return (T) getEntityManager().find(getEntityClass(), id);
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }


    public void setEntityManager(EntityManager entityManager) throws Exception {
        this.entityManager = entityManager;
    }

    public Class<T> getEntityClass() throws Exception {
        if (entityClass == null) {
            Type type = getClass().getGenericSuperclass();
            if (type instanceof ParameterizedType) {
                ParameterizedType paramType = (ParameterizedType) type;
                if (paramType.getActualTypeArguments().length == 2) {
                    if (paramType.getActualTypeArguments()[1] instanceof TypeVariable) {
                        throw new IllegalArgumentException(
                                "Can't find class using reflection");
                    } else {
                        entityClass = (Class<T>) paramType.getActualTypeArguments()[1];
                    }
                } else {
                    entityClass = (Class<T>) paramType.getActualTypeArguments()[0];
                }
            } else {
                throw new Exception("Can't find class using reflection");
            }
        }
        return entityClass;
    }
}
