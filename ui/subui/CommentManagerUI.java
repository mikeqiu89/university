package ui.subui;

import java.util.Scanner;

public class CommentManagerUI {

    public void showCommentManagerUI(Scanner scanner){
        System.out.println("Welcome Hotel Sys Home UI");
        System.out.println("1: Hotel Manager UI");
        System.out.println("2: Hotel Customer UI");
        System.out.println("3: Exit Sys");

        while (true){
            System.out.printf("Input ( 1(Manager) : 2(Customer) : 3(Exit)) : ");
            switch (scanner.nextInt()){
                case 1:
//                    showHotelManagerUI(scanner);
                    break;
                case 2:
//                    showHotelCustomerUI(scanner);
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
}
