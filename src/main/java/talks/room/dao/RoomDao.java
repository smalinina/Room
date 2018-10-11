package talks.room.dao;

import talks.room.entity.Room;

import java.util.List;

public interface RoomDao extends BasicDao<Room> {

    List<Room> getListByCount(int count);
}
