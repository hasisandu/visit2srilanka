package visit2srilanka.demo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class District {
    @Id
    private int district_id;
    private String district_name;
    private long city_id;
    private int nr_hotels;
    private double longtute;
    private double latitute;

    public District(int district_id, String district_name, long city_id, int nr_hotels, double longtute, double latitute) {
        this.district_id = district_id;
        this.district_name = district_name;
        this.city_id = city_id;
        this.nr_hotels = nr_hotels;
        this.longtute = longtute;
        this.latitute = latitute;
    }

    public int getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(int district_id) {
        this.district_id = district_id;
    }

    public String getDistrict_name() {
        return district_name;
    }

    public void setDistrict_name(String district_name) {
        this.district_name = district_name;
    }

    public long getCity_id() {
        return city_id;
    }

    public void setCity_id(long city_id) {
        this.city_id = city_id;
    }

    public int getNr_hotels() {
        return nr_hotels;
    }

    public void setNr_hotels(int nr_hotels) {
        this.nr_hotels = nr_hotels;
    }

    public double getLongtute() {
        return longtute;
    }

    public void setLongtute(double longtute) {
        this.longtute = longtute;
    }

    public double getLatitute() {
        return latitute;
    }

    public void setLatitute(double latitute) {
        this.latitute = latitute;
    }

    @Override
    public String toString() {
        return "District{" +
                "district_id=" + district_id +
                ", district_name='" + district_name + '\'' +
                ", city_id=" + city_id +
                ", nr_hotels=" + nr_hotels +
                ", longtute=" + longtute +
                ", latitute=" + latitute +
                '}';
    }
}
