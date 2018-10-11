package talks.room.service;

import talks.room.entity.Room;

import java.util.List;

public interface RoomService {

    /**
     * method for add room
     *
     * @param room -  new room for creation
     * @return created room
     */
    Room addRoom(Room room);

    /**
     * method for getting room by specific id
     *
     * @param id - room's id
     * @return room by id
     */
    Room getRoomById(long id);

    /**
     * method for getting all room
     *
     * @return room's list
     */
    List<Room> getAllRoom();

    /**
     * method for update room
     *
     * @return room's list
     */
    Room updateRoom(Room room);

    /**
     * method for delete room by specific id
     *
     * @param id for deleting room
     */
    Room deleteRoomById(long id);

    List<Room> getListRoomByCount(int count);

}
