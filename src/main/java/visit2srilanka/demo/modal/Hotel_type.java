package visit2srilanka.demo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel_type {
    @Id
    private int type_id;
    private String name;

    public Hotel_type(int type_id, String name) {
        this.type_id = type_id;
        this.name = name;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hotel_type{" +
                "type_id=" + type_id +
                ", name='" + name + '\'' +
                '}';
    }
}
