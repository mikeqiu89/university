package ui.subui;

import bean.Customer;
import bean.HotelRoom;
import bean.Order;
import service.OrderManagerServ;

import java.util.Scanner;

public class OrderManagerUI {

    OrderManagerServ orderManagerServ = new OrderManagerServ();

    public void showOrderManagerUI(Scanner scanner){
        System.out.println("Enter Customer Manager UI");
        System.out.println("1: Add Order");
        System.out.println("2: Change Order");
        System.out.println("3: Query Order");
        System.out.println("4: Return Next UI");
        while (true){
            System.out.println("Input ( 1(Add) : 2(Change) : 3(Query) : 4(Exit)) : ");
            switch (scanner.nextInt()){
                case 1:
                    System.out.printf("Input Customer Name : ");
                    System.out.printf("Input Customer ID : ");
//                    String strCustomerName = scanner.next();
                    orderManagerServ.addOrderToList(new Order(new Customer("001","C001"),new HotelRoom(),"2023-12-29","2023-12-31"));
                    orderManagerServ.showOrderList();
                    break;
                case 2:
                    orderManagerServ.changeOrderStateFromList(new Order());
                    break;
                case 3:
                    orderManagerServ.getOrderList();
                    break;
                case 4:
                    System.out.println("Return Next UI");
                    return;
                default:
                    System.out.println("------");
                    break;
            }
        }
    }
}
