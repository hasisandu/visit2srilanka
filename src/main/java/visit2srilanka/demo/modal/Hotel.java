package visit2srilanka.demo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hotel {
    @Id
    private int hotelid;
    private String deep_url_link;
    private int extract_class;
    private String hotel_discribe;
    private String zip;
    private int number_of_rewiew;
    private String welcome_message;
    private String hotel_name;
    private int hotel_type;
    private long long_city_id;
    private boolean credit_card_requred;
    private int district_id;
    private String hotel_inported_info;
    private long rank;
    private double longtute;
    private double latitute;
    private int h_class;
    private String address;
    private int review_score;
    private int number_of_rooms;
    private String city_name;

    public Hotel(int hotelid, String deep_url_link, int extract_class, String hotel_discribe, String zip, int number_of_rewiew, String welcome_message, String hotel_name, int hotel_type, long long_city_id, boolean credit_card_requred, int district_id, String hotel_inported_info, long rank, double longtute, double latitute, int h_class, String address, int review_score, int number_of_rooms, String city_name) {
        this.hotelid = hotelid;
        this.deep_url_link = deep_url_link;
        this.extract_class = extract_class;
        this.hotel_discribe = hotel_discribe;
        this.zip = zip;
        this.number_of_rewiew = number_of_rewiew;
        this.welcome_message = welcome_message;
        this.hotel_name = hotel_name;
        this.hotel_type = hotel_type;
        this.long_city_id = long_city_id;
        this.credit_card_requred = credit_card_requred;
        this.district_id = district_id;
        this.hotel_inported_info = hotel_inported_info;
        this.rank = rank;
        this.longtute = longtute;
        this.latitute = latitute;
        this.h_class = h_class;
        this.address = address;
        this.review_score = review_score;
        this.number_of_rooms = number_of_rooms;
        this.city_name = city_name;
    }

    public int getHotelid() {
        return hotelid;
    }

    public void setHotelid(int hotelid) {
        this.hotelid = hotelid;
    }

    public String getDeep_url_link() {
        return deep_url_link;
    }

    public void setDeep_url_link(String deep_url_link) {
        this.deep_url_link = deep_url_link;
    }

    public int getExtract_class() {
        return extract_class;
    }

    public void setExtract_class(int extract_class) {
        this.extract_class = extract_class;
    }

    public String getHotel_discribe() {
        return hotel_discribe;
    }

    public void setHotel_discribe(String hotel_discribe) {
        this.hotel_discribe = hotel_discribe;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public int getNumber_of_rewiew() {
        return number_of_rewiew;
    }

    public void setNumber_of_rewiew(int number_of_rewiew) {
        this.number_of_rewiew = number_of_rewiew;
    }

    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message(String welcome_message) {
        this.welcome_message = welcome_message;
    }

    public String getHotel_name() {
        return hotel_name;
    }

    public void setHotel_name(String hotel_name) {
        this.hotel_name = hotel_name;
    }

    public int getHotel_type() {
        return hotel_type;
    }

    public void setHotel_type(int hotel_type) {
        this.hotel_type = hotel_type;
    }

    public long getLong_city_id() {
        return long_city_id;
    }

    public void setLong_city_id(long long_city_id) {
        this.long_city_id = long_city_id;
    }

    public boolean isCredit_card_requred() {
        return credit_card_requred;
    }

    public void setCredit_card_requred(boolean credit_card_requred) {
        this.credit_card_requred = credit_card_requred;
    }

    public int getDistrict_id() {
        return district_id;
    }

    public void setDistrict_id(int district_id) {
        this.district_id = district_id;
    }

    public String getHotel_inported_info() {
        return hotel_inported_info;
    }

    public void setHotel_inported_info(String hotel_inported_info) {
        this.hotel_inported_info = hotel_inported_info;
    }

    public long getRank() {
        return rank;
    }

    public void setRank(long rank) {
        this.rank = rank;
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

    public int getH_class() {
        return h_class;
    }

    public void setH_class(int h_class) {
        this.h_class = h_class;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getReview_score() {
        return review_score;
    }

    public void setReview_score(int review_score) {
        this.review_score = review_score;
    }

    public int getNumber_of_rooms() {
        return number_of_rooms;
    }

    public void setNumber_of_rooms(int number_of_rooms) {
        this.number_of_rooms = number_of_rooms;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelid=" + hotelid +
                ", deep_url_link='" + deep_url_link + '\'' +
                ", extract_class=" + extract_class +
                ", hotel_discribe='" + hotel_discribe + '\'' +
                ", zip='" + zip + '\'' +
                ", number_of_rewiew=" + number_of_rewiew +
                ", welcome_message='" + welcome_message + '\'' +
                ", hotel_name='" + hotel_name + '\'' +
                ", hotel_type=" + hotel_type +
                ", long_city_id=" + long_city_id +
                ", credit_card_requred=" + credit_card_requred +
                ", district_id=" + district_id +
                ", hotel_inported_info='" + hotel_inported_info + '\'' +
                ", rank=" + rank +
                ", longtute=" + longtute +
                ", latitute=" + latitute +
                ", h_class=" + h_class +
                ", address='" + address + '\'' +
                ", review_score=" + review_score +
                ", number_of_rooms=" + number_of_rooms +
                ", city_name='" + city_name + '\'' +
                '}';
    }
}
