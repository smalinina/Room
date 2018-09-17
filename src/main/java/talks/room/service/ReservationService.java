package talks.room.service;

import talks.room.entity.Reservation;

import java.util.List;

public interface ReservationService {

    /**
     * method for add room
     *
     * @param reservation -  new room for creation
     * @return created room
     */
    Reservation addReservation(Reservation reservation);

    /**
     * method for getting room by specific id
     *
     * @param id - room's id
     * @return room by id
     */
    Reservation getReservationById(long id);

    /**
     * method for getting all room
     *
     * @return room's list
     */
    List<Reservation> getAllReservation();

    /**
     * method for update room
     *
     * @return room's list
     */
    Reservation updateReservation(Reservation reservation);

    /**
     * method for delete room by specific id
     *
     * @param id for deleting room
     */
    Reservation deleteReservationById(long id);
}
