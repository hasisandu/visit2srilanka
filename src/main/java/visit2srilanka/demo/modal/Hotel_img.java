package visit2srilanka.demo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel_img {
    @Id
    private int hotel_id;
    private String original;
    private String squre;
    private String max;

    public Hotel_img(int hotel_id, String original, String squre, String max) {
        this.hotel_id = hotel_id;
        this.original = original;
        this.squre = squre;
        this.max = max;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getSqure() {
        return squre;
    }

    public void setSqure(String squre) {
        this.squre = squre;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "Hotel_img{" +
                "hotel_id=" + hotel_id +
                ", original='" + original + '\'' +
                ", squre='" + squre + '\'' +
                ", max='" + max + '\'' +
                '}';
    }
}
