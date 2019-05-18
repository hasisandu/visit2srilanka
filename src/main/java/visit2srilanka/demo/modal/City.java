package visit2srilanka.demo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class City {
    @Id
    private long city_id;
    private String cityname;
    private int nr_hotels;
    private double longtute;
    private double latitute;
    private String time_Zone;

    public City(long city_id, String cityname, int nr_hotels, double longtute, double latitute, String time_Zone) {
        this.city_id = city_id;
        this.cityname = cityname;
        this.nr_hotels = nr_hotels;
        this.longtute = longtute;
        this.latitute = latitute;
        this.time_Zone = time_Zone;
    }

    public long getCity_id() {
        return city_id;
    }

    public void setCity_id(long city_id) {
        this.city_id = city_id;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
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

    public String getTime_Zone() {
        return time_Zone;
    }

    public void setTime_Zone(String time_Zone) {
        this.time_Zone = time_Zone;
    }

    @Override
    public String toString() {
        return "City{" +
                "city_id=" + city_id +
                ", cityname='" + cityname + '\'' +
                ", nr_hotels=" + nr_hotels +
                ", longtute=" + longtute +
                ", latitute=" + latitute +
                ", time_Zone='" + time_Zone + '\'' +
                '}';
    }
}
