package talks.room.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import talks.room.dao.RoomDao;
import talks.room.entity.Room;
import talks.room.service.RoomService;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    private RoomDao roomDao;

    @Override
    public Room addRoom(Room room) {
        return roomDao.create(room);
    }
}
