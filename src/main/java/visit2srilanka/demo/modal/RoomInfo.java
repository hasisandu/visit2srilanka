package visit2srilanka.demo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RoomInfo {
    @Id
    private long room_id;
    private int bathroom_count;
    private int room_type_id;
    private int person;
    private String room_type;

    public RoomInfo(long room_id, int bathroom_count, int room_type_id, int person, String room_type) {
        this.room_id = room_id;
        this.bathroom_count = bathroom_count;
        this.room_type_id = room_type_id;
        this.person = person;
        this.room_type = room_type;
    }

    public long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(long room_id) {
        this.room_id = room_id;
    }

    public int getBathroom_count() {
        return bathroom_count;
    }

    public void setBathroom_count(int bathroom_count) {
        this.bathroom_count = bathroom_count;
    }

    public int getRoom_type_id() {
        return room_type_id;
    }

    public void setRoom_type_id(int room_type_id) {
        this.room_type_id = room_type_id;
    }

    public int getPerson() {
        return person;
    }

    public void setPerson(int person) {
        this.person = person;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    @Override
    public String toString() {
        return "RoomInfo{" +
                "room_id=" + room_id +
                ", bathroom_count=" + bathroom_count +
                ", room_type_id=" + room_type_id +
                ", person=" + person +
                ", room_type='" + room_type + '\'' +
                '}';
    }
}