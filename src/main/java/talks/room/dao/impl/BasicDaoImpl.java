package talks.room.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import talks.room.dao.BasicDao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

@Transactional
public class BasicDaoImpl<T> implements BasicDao<T> {
    private final Class<T> entityClass;

    @Autowired
    protected SessionFactory sessionFactory;

    public BasicDaoImpl(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    @Override
    public T create(T entity) {
        getSessionFactory().save(entity);
        return entity;
    }

    @Override
    public List<T> getList() {
        CriteriaBuilder builder = sessionFactory.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = builder.createQuery(entityClass);
        Root<T> root = criteriaQuery.from(entityClass);

        criteriaQuery.select(root);

        return getSessionFactory().createQuery(criteriaQuery).list();
    }

    @Override
    public T update(T entity) {
        getSessionFactory().update(entity);
        return entity;
    }

    @Override
    public T delete(T entity) {
        getSessionFactory().delete(entity);
        return entity;
    }

    @Override
    public T getById(long id) {
        return getSessionFactory().get(entityClass, id);
    }

    @Override
    public T getByName(String name) {
        return getSessionFactory().get(entityClass, name);
    }

    private Session getSessionFactory() {
        return sessionFactory.getCurrentSession();
    }
}
