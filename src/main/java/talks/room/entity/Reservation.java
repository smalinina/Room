package talks.room.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    //private LocalDate date;
    @Column(name = "date_start")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm")
    //@Temporal(TemporalType.TIMESTAMP)
    //@Convert(converter = LocalDateTimeConverter.class)
    //DateTimeFormatter dataStart = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    private LocalDateTime dataStart;
    @Column(name = "date_end")
    private LocalDateTime dataEnd;
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

   /* @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    } */

    //@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm")
   // @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-ddTHH:mm")
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
    public LocalDateTime getDataStart() {
        return dataStart;
    }

    public void setDataStart(LocalDateTime dataStart) {
        this.dataStart = dataStart;
    }

    //@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm")
    //@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-ddTHH:mm")
    public LocalDateTime getDataEnd() {
        return dataEnd;
    }

    public void setDataEnd(LocalDateTime dataEnd) {
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
