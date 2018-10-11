package talks.room.dao.impl;

import talks.room.dao.RoomDao;
import talks.room.entity.Room;

import java.util.List;

public class RoomDaoImpl extends BasicDaoImpl<Room> implements RoomDao {

    public RoomDaoImpl(Class<Room> entityClass) {
        super(entityClass);
    }

    @Override
    public List<Room> findRoomByCount() {
        return (List<Room>) sessionFactory.getCurrentSession()
                .createQuery("FROM Room where count = ?")
                .setParameter(0, count)
                .list();
    }

}
