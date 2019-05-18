package visit2srilanka.demo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RoomType {
    @Id
    private int room_type_id;
    private String name;

    public RoomType(int room_type_id, String name) {
        this.room_type_id = room_type_id;
        this.name = name;
    }

    public int getRoom_type_id() {
        return room_type_id;
    }

    public void setRoom_type_id(int room_type_id) {
        this.room_type_id = room_type_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "room_type_id=" + room_type_id +
                ", name='" + name + '\'' +
                '}';
    }
}
