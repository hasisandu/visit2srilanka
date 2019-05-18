package visit2srilanka.demo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RoomData {
    @Id
    private int hotel_id;
    private String room_name;
    private long room_id;
    private String room_discribe;

    public RoomData(int hotel_id, String room_name, long room_id, String room_discribe) {
        this.hotel_id = hotel_id;
        this.room_name = room_name;
        this.room_id = room_id;
        this.room_discribe = room_discribe;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(long room_id) {
        this.room_id = room_id;
    }

    public String getRoom_discribe() {
        return room_discribe;
    }

    public void setRoom_discribe(String room_discribe) {
        this.room_discribe = room_discribe;
    }

    @Override
    public String toString() {
        return "RoomData{" +
                "hotel_id=" + hotel_id +
                ", room_name='" + room_name + '\'' +
                ", room_id=" + room_id +
                ", room_discribe='" + room_discribe + '\'' +
                '}';
    }
}
