package talks.room.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

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
    @Column(name = "count_room")
    private int countRoom;
    private String author;

    @ManyToOne
    Room room;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm")
    public LocalTime getDataStart() {
        return dataStart;
    }

    public void setDataStart(LocalTime dataStart) {
        this.dataStart = dataStart;
    }

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="HH:mm")
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

    public int getCountRoom() {
        return countRoom;
    }

    public void setCountRoom(int countRoom) {
        this.countRoom = countRoom;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
