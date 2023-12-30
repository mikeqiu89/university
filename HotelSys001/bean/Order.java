package bean;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Order {

    Customer customer;
    HotelRoom hotelRoom;
    Double dHotelRoomPrice;
    String strCreateOrderTime;
    String strOrderStartTime;
    String strOrderEndTime;
    Integer nOrderState;
    String strOrderSNID;  //Create 0 : login 1 : Exit 2;

    public Order(){
        //----------------------------------------------
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar now = Calendar.getInstance();
        this.setStrCreateOrderTime(simpleDateFormat.format(now.getTime()));

        Random random = new Random(System.currentTimeMillis());
        Long lOrderSNID = random.nextLong();
        lOrderSNID = Math.abs(lOrderSNID);
        this.setStrOrderSNID(lOrderSNID.toString());

        this.setnOrderState(0);

        if(this.hotelRoom == null){
            this.setdHotelRoomPrice(this.hotelRoom.dSingleRoomPrice * this.hotelRoom.getnHotelRoomSize());
        }

    }
    public Order(Customer customer, HotelRoom hotelRoom,String strOrderStartTime, String strOrderEndTime) {
        this.customer = customer;
        this.hotelRoom = hotelRoom;
        this.dHotelRoomPrice = dHotelRoomPrice;
        this.strOrderStartTime = strOrderStartTime;
        this.strOrderEndTime = strOrderEndTime;
        //----------------------------------------------
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar now = Calendar.getInstance();
        this.setStrCreateOrderTime(simpleDateFormat.format(now.getTime()));

        Random random = new Random(System.currentTimeMillis());
        Long lOrderSNID = random.nextLong();
        lOrderSNID = Math.abs(lOrderSNID);
        this.setStrOrderSNID(lOrderSNID.toString());

        this.setnOrderState(0);

        if(this.hotelRoom == null){
            this.setdHotelRoomPrice(this.hotelRoom.dSingleRoomPrice * this.hotelRoom.getnHotelRoomSize());
        }

    }

    public Order(Customer customer, HotelRoom hotelRoom, String strOrderStartTime, String strOrderEndTime, Integer nOrderState) {
        this.customer = customer;
        this.hotelRoom = hotelRoom;
        this.dHotelRoomPrice = dHotelRoomPrice;
        this.strOrderStartTime = strOrderStartTime;
        this.strOrderEndTime = strOrderEndTime;
        this.nOrderState = nOrderState;

        //----------------------------------------------
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar now = Calendar.getInstance();
        this.setStrCreateOrderTime(simpleDateFormat.format(now.getTime()));

        Random random = new Random(System.currentTimeMillis());
        Long lOrderSNID = random.nextLong();
        lOrderSNID = Math.abs(lOrderSNID);
        this.setStrOrderSNID(lOrderSNID.toString());

        this.setnOrderState(0);

        if(this.hotelRoom == null){
            this.setdHotelRoomPrice(this.hotelRoom.dSingleRoomPrice * this.hotelRoom.getnHotelRoomSize());
        }
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public HotelRoom getHotelRoom() {
        return hotelRoom;
    }

    public void setHotelRoom(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
    }

    public Double getdHotelRoomPrice() {
        return dHotelRoomPrice;
    }

    public void setdHotelRoomPrice(Double dHotelRoomPrice) {
        this.dHotelRoomPrice = dHotelRoomPrice;
    }

    public String getStrCreateOrderTime() {
        return strCreateOrderTime;
    }

    public void setStrCreateOrderTime(String strCreateOrderTime) {
        this.strCreateOrderTime = strCreateOrderTime;
    }

    public String getStrOrderStartTime() {
        return strOrderStartTime;
    }

    public void setStrOrderStartTime(String strOrderStartTime) {
        this.strOrderStartTime = strOrderStartTime;
    }

    public String getStrOrderEndTime() {
        return strOrderEndTime;
    }

    public void setStrOrderEndTime(String strOrderEndTime) {
        this.strOrderEndTime = strOrderEndTime;
    }

    public Integer getnOrderState() {
        return nOrderState;
    }

    public void setnOrderState(Integer nOrderState) {
        this.nOrderState = nOrderState;
    }

    public String getStrOrderSNID() {
        return strOrderSNID;
    }

    public void setStrOrderSNID(String strOrderSNID) {
        this.strOrderSNID = strOrderSNID;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", hotelRoom=" + hotelRoom +
                ", dHotelRoomPrice=" + dHotelRoomPrice +
                ", strCreateOrderTime='" + strCreateOrderTime + '\'' +
                ", strOrderStartTime='" + strOrderStartTime + '\'' +
                ", strOrderEndTime='" + strOrderEndTime + '\'' +
                ", nOrderState=" + nOrderState +
                ", strOrderSNID='" + strOrderSNID + '\'' +
                '}';
    }
}
