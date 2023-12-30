package ui;

import service.CommentManagerServ;
import service.CustomerManagerServ;
import service.OrderManagerServ;
import service.RoomManagerServ;
import ui.subui.CommentManagerUI;
import ui.subui.CustomerManagerUI;
import ui.subui.OrderManagerUI;

import java.util.Scanner;

public class MainUI {

    public void showMainUI(){

        System.out.println("Welcome Hotel Sys Home UI");
        System.out.println("1: Hotel Manager UI");
        System.out.println("2: Hotel Customer UI");
        System.out.println("3: Exit Sys");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.printf("Input ( 1(Manager) : 2(Customer) : 3(Exit)) : ");
            switch (scanner.nextInt()){
                case 1:
                    showHotelManagerUI(scanner);
                    break;
                case 2:
                    showHotelCustomerUI(scanner);
                    break;
                case 3:
                    System.out.println("Exit Hotel Sys");
                    return;
                default:
                    System.out.println("------");
                    break;
            }
        }

    }

    CustomerManagerServ customerManagerServ = new CustomerManagerServ();
    OrderManagerServ orderManagerServ = new OrderManagerServ();
    RoomManagerServ roomManagerServ = new RoomManagerServ();
    CommentManagerServ commentManagerServ = new CommentManagerServ();
    CustomerManagerUI customerManagerUI = new CustomerManagerUI();
    OrderManagerUI orderManagerUI = new OrderManagerUI();
    CommentManagerUI commentManagerUI = new CommentManagerUI();
    public void showHotelManagerUI(Scanner scanner){
        System.out.println("Enter Hotel Manager UI");
        System.out.println("1: Customer Manager UI");
        System.out.println("2: Order Manager UI");
        System.out.println("3: Room Manager UI");
        System.out.println("4: Comment Manager UI");
        System.out.println("5: Return Main UI");
        scanner = new Scanner(System.in);
        while (true){
            System.out.printf("Input 1(Customer) : 2(Order) : 3(Room) 4(Comment) : 5(Return) : ");
            switch (scanner.nextInt()){
                case 1:
                    customerManagerUI.showCustomerManagerUI(scanner);
                    break;
                case 2:
                    orderManagerUI.showOrderManagerUI(scanner);
                    break;
                case 3:
//                    roomManagerServ.doRoomManager();
                    break;
                case 4:
                    commentManagerUI.showCommentManagerUI(scanner);
                    break;
                case 5:
                    System.out.println("Return Main UI");;
                    return;
                default:
                    System.out.println("----");
                    break;
            }
        }

    }

    public void showHotelCustomerUI(Scanner scanner){
        System.out.println("Enter Customer Manager UI");
        System.out.println("1: Customer Manager UI");
        System.out.println("2: Order Manager UI");
        System.out.println("3: Room Manager UI");
        System.out.println("4: Comment Manager UI");
        System.out.println("5: Return Main UI");
    }


}
