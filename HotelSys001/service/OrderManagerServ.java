package service;

import bean.Customer;
import bean.HotelRoom;
import bean.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderManagerServ {

    public OrderManagerServ(){
        orderList.add(new Order(new Customer("001","C001"),new HotelRoom(),"2023-12-29","2023-12-31"));
    }

    List<Order> orderList = new ArrayList<>();

    public List<Order> addOrderToList(Order order){
        orderList.add(order);
        return orderList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public List<Order> changeOrderStateFromList(Order order){
        for(int i=0; i<orderList.size(); i++){
            Customer customer = order.getCustomer();
            String strOrderID = order.getStrOrderSNID();
            if(customer.getStrName().contains(orderList.get(i).getCustomer().getStrName())){
                orderList.get(i).setnOrderState(2);
            }
        }
        return  orderList;
    }

    public void showOrderList(){
        for(Order order : orderList){
            System.out.println(order.toString());
        }
    }

    public void doOrderManager(){

    }
}
