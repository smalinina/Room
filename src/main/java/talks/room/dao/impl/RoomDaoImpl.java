package talks.room.dao.impl;

import talks.room.dao.RoomDao;
import talks.room.entity.Room;

public class RoomDaoImpl extends BasicDaoImpl<Room> implements RoomDao {

    public RoomDaoImpl(Class<Room> entityClass) {
        super(entityClass);
    }

}
