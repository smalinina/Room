package talks.room.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private LocalDate date;
    @Column(name = "date_start")
    private LocalTime dataStart;
    @Column(name = "date_end")
    private LocalTime dataEnd;

    @ManyToOne
    Room room;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getDataStart() {
        return dataStart;
    }

    public void setDataStart(LocalTime dataStart) {
        this.dataStart = dataStart;
    }

    public LocalTime getDataEnd() {
        return dataEnd;
    }

    public void setDataEnd(LocalTime dataEnd) {
        this.dataEnd = dataEnd;
    }

    public Room getRoom() {
        return room;
    }
    public void setEvent(Room room) {
        this.room = room;
    }
}
