package visit2srilanka.demo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RoomFacility {
    @Id
    private long room_id;
    private int facility_type;
    private String name;

    public RoomFacility(long room_id, int facility_type, String name) {
        this.room_id = room_id;
        this.facility_type = facility_type;
        this.name = name;
    }

    public long getRoom_id() {
        return room_id;
    }

    public void setRoom_id(long room_id) {
        this.room_id = room_id;
    }

    public int getFacility_type() {
        return facility_type;
    }

    public void setFacility_type(int facility_type) {
        this.facility_type = facility_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RoomFacility{" +
                "room_id=" + room_id +
                ", facility_type=" + facility_type +
                ", name='" + name + '\'' +
                '}';
    }
}
