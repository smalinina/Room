package talks.room.dao.impl;

import talks.room.dao.ReservationDao;
import talks.room.entity.Reservation;

public class ReservationDaoImpl extends BasicDaoImpl<Reservation> implements ReservationDao {

    public ReservationDaoImpl(Class<Reservation> entityClass) {
        super(entityClass);
    }
}
