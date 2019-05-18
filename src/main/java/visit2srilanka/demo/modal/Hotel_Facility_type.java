package visit2srilanka.demo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel_Facility_type {
    @Id
    private int hotel_facility_type_id;
    private int facility_type_id;
    private String name;

    public Hotel_Facility_type(int hotel_facility_type_id, int facility_type_id, String name) {
        this.hotel_facility_type_id = hotel_facility_type_id;
        this.facility_type_id = facility_type_id;
        this.name = name;
    }

    public int getHotel_facility_type_id() {
        return hotel_facility_type_id;
    }

    public void setHotel_facility_type_id(int hotel_facility_type_id) {
        this.hotel_facility_type_id = hotel_facility_type_id;
    }

    public int getFacility_type_id() {
        return facility_type_id;
    }

    public void setFacility_type_id(int facility_type_id) {
        this.facility_type_id = facility_type_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hotel_Facility_type{" +
                "hotel_facility_type_id=" + hotel_facility_type_id +
                ", facility_type_id=" + facility_type_id +
                ", name='" + name + '\'' +
                '}';
    }
}
