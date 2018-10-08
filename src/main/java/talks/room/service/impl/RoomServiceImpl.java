package talks.room.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import talks.room.dao.RoomDao;
import talks.room.entity.Room;
import talks.room.service.RoomService;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomDao roomDao;

    @Override
    public Room addRoom(Room room) {
        return roomDao.create(room);
    }

    @Override
    public Room getRoomById(long id) {
        return roomDao.getById(id);
    }

    @Override
    public List<Room> getAllRoom() {
        return roomDao.getList();
    }

    @Override
    public Room updateRoom(Room room) {
        roomDao.update(room);
        return room;
    }

    @Override
    public Room deleteRoomById(long id) {
        return roomDao.delete(getRoomById(id));
    }

    @Override
    public Room getRoomByName(String room) {
        return roomDao.getByName(room);
    }
}
