package talks.room.dao.impl;

import org.hibernate.Session;
import talks.room.dao.RoomDao;
import talks.room.entity.Room;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class RoomDaoImpl extends BasicDaoImpl<Room> implements RoomDao {

    public RoomDaoImpl(Class<Room> entityClass) {
        super(entityClass);
    }

    /*
    @Override
    public List<Room> getListByCount(int count) {
        List<Room> counts = (List<Room>) sessionFactory.getCurrentSession()
                .createQuery("from Room as r where r.count = ?")
                .setParameter(0, count).list();
        return counts;
    }

*/

    @Override
    public List<Room> getListByCount(int count) {
        Session session = sessionFactory.getCurrentSession();

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Room> criteriaQuery = builder.createQuery(Room.class);
        Root<Room> root = criteriaQuery.from(Room.class);

        criteriaQuery.select(root);
        criteriaQuery.where(builder.equal(root.get("count"), count));

        TypedQuery<Room> typedQuery = session.createQuery(criteriaQuery);
        return typedQuery.getResultList();
    }


}
