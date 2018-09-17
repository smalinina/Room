package talks.room.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import talks.room.dao.ReservationDao;
import talks.room.entity.Reservation;
import talks.room.service.ReservationService;

import java.util.List;

@Service
public class ReservationServiceImpl implements ReservationService {

    @Autowired
    private ReservationDao reservationDao;

    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationDao.create(reservation);
    }

    @Override
    public Reservation getReservationById(long id) {
        return reservationDao.getById(id);
    }

    @Override
    public List<Reservation> getAllReservation() {
        return reservationDao.getList();
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        reservationDao.update(reservation);
        return reservation;
    }

    @Override
    public Reservation deleteReservationById(long id) {
        return reservationDao.delete(getReservationById(id));
    }
}
