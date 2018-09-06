package talks.room.service;

import talks.room.entity.Room;

public interface RoomService {

    /**
     * method for add room
     *
     * @param room -  new room for creation
     * @return created room
     */
    Room addRoom(Room room);
}
