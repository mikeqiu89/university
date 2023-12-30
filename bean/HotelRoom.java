package bean;

public class HotelRoom {
    String strHotelRoomID;
    Integer nHotelRoomType;
    Integer nHotelRoomSize;
    Double dSingleRoomPrice;

    public HotelRoom(){}

    @Override
    public String toString() {
        return "HotelRoom{" +
                "strHotelRoomID='" + strHotelRoomID + '\'' +
                ", nHotelRoomType=" + nHotelRoomType +
                ", nHotelRoomSize=" + nHotelRoomSize +
                ", dSingleRoomPrice=" + dSingleRoomPrice +
                '}';
    }

    public String getStrHotelRoomID() {
        return strHotelRoomID;
    }

    public void setStrHotelRoomID(String strHotelRoomID) {
        this.strHotelRoomID = strHotelRoomID;
    }

    public Integer getnHotelRoomType() {
        return nHotelRoomType;
    }

    public void setnHotelRoomType(Integer nHotelRoomType) {
        this.nHotelRoomType = nHotelRoomType;
    }

    public Integer getnHotelRoomSize() {
        return nHotelRoomSize;
    }

    public void setnHotelRoomSize(Integer nHotelRoomSize) {
        this.nHotelRoomSize = nHotelRoomSize;
    }

    public Double getdSingleRoomPrice() {
        return dSingleRoomPrice;
    }

    public void setdSingleRoomPrice(Double dSingleRoomPrice) {
        this.dSingleRoomPrice = dSingleRoomPrice;
    }
}
