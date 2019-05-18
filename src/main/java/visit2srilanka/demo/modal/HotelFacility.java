package visit2srilanka.demo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HotelFacility {
    @Id
    private int hotel_id;
    private String name;
    private int hotel_facility_id;


    public HotelFacility(int hotel_id, String name, int hotel_facility_id) {
        this.hotel_id = hotel_id;
        this.name = name;
        this.hotel_facility_id = hotel_facility_id;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHotel_facility_id() {
        return hotel_facility_id;
    }

    public void setHotel_facility_id(int hotel_facility_id) {
        this.hotel_facility_id = hotel_facility_id;
    }

    @Override
    public String toString() {
        return "HotelFacility{" +
                "hotel_id=" + hotel_id +
                ", name='" + name + '\'' +
                ", hotel_facility_id=" + hotel_facility_id +
                '}';
    }
}
