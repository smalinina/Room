package talks.room.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "date_start")
    @Temporal(TemporalType.TIME)
    private Date dataStart;
    @Column(name = "date_end")
    //@Column(name = "end_date", columnDefinition = "DATE")
    @Temporal(TemporalType.TIME)
    private Date dataEnd;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDataStart() {
        return dataStart;
    }

    public void setDataStart(Date dataStart) {
        this.dataStart = dataStart;
    }

    public Date getDataEnd() {
        return dataEnd;
    }

    public void setDataEnd(Date dataEnd) {
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
