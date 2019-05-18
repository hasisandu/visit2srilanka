package visit2srilanka.demo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel_Policy {
    @Id
    private int int_hotel_id;
    private String type;
    private String content;
    private String name;

    public Hotel_Policy(int int_hotel_id, String type, String content, String name) {
        this.int_hotel_id = int_hotel_id;
        this.type = type;
        this.content = content;
        this.name = name;
    }

    public int getInt_hotel_id() {
        return int_hotel_id;
    }

    public void setInt_hotel_id(int int_hotel_id) {
        this.int_hotel_id = int_hotel_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hotel_Policy{" +
                "int_hotel_id=" + int_hotel_id +
                ", type='" + type + '\'' +
                ", content='" + content + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
