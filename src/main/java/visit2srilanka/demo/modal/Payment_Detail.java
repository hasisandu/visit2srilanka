package visit2srilanka.demo.modal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment_Detail {
    @Id
    private int hotel_id;
    private int pay_id;
    private boolean c_v_c_req;
    private boolean bookable;
    private boolean payble;

    public Payment_Detail(int hotel_id, int pay_id, boolean c_v_c_req, boolean bookable, boolean payble) {
        this.hotel_id = hotel_id;
        this.pay_id = pay_id;
        this.c_v_c_req = c_v_c_req;
        this.bookable = bookable;
        this.payble = payble;
    }

    public int getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(int hotel_id) {
        this.hotel_id = hotel_id;
    }

    public int getPay_id() {
        return pay_id;
    }

    public void setPay_id(int pay_id) {
        this.pay_id = pay_id;
    }

    public boolean isC_v_c_req() {
        return c_v_c_req;
    }

    public void setC_v_c_req(boolean c_v_c_req) {
        this.c_v_c_req = c_v_c_req;
    }

    public boolean isBookable() {
        return bookable;
    }

    public void setBookable(boolean bookable) {
        this.bookable = bookable;
    }

    public boolean isPayble() {
        return payble;
    }

    public void setPayble(boolean payble) {
        this.payble = payble;
    }

    @Override
    public String toString() {
        return "Payment_Detail{" +
                "hotel_id=" + hotel_id +
                ", pay_id=" + pay_id +
                ", c_v_c_req=" + c_v_c_req +
                ", bookable=" + bookable +
                ", payble=" + payble +
                '}';
    }
}
