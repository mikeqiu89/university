package bean;

public class Customer {
    String strID;
    String strName;

    public Customer(){

    }

    public Customer(String strID, String strName) {
        this.strID = strID;
        this.strName = strName;
    }

    public String getStrID() {
        return strID;
    }

    public void setStrID(String strID) {
        this.strID = strID;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "strID='" + strID + '\'' +
                ", strName='" + strName + '\'' +
                '}';
    }
}
