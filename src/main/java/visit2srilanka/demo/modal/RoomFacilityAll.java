package visit2srilanka.demo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RoomFacilityAll {
    @Id
    private int room_fac_type_id;
    private int facilityid;
    private String name;
    private String type;

    public RoomFacilityAll(int room_fac_type_id, int facilityid, String name, String type) {
        this.room_fac_type_id = room_fac_type_id;
        this.facilityid = facilityid;
        this.name = name;
        this.type = type;
    }

    public int getRoom_fac_type_id() {
        return room_fac_type_id;
    }

    public void setRoom_fac_type_id(int room_fac_type_id) {
        this.room_fac_type_id = room_fac_type_id;
    }

    public int getFacilityid() {
        return facilityid;
    }

    public void setFacilityid(int facilityid) {
        this.facilityid = facilityid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "RoomFacilityAll{" +
                "room_fac_type_id=" + room_fac_type_id +
                ", facilityid=" + facilityid +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
