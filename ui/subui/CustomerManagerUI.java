package ui.subui;

import bean.Customer;
import service.CustomerManagerServ;

import java.util.Scanner;

public class CustomerManagerUI {

    CustomerManagerServ customerManagerServ = new CustomerManagerServ();
    public void showCustomerManagerUI(Scanner scanner){
        System.out.println("Enter Customer Manager UI");
        System.out.println("1: Add Customer");
        System.out.println("2: delete Customer");
        System.out.println("3: Query Customer");
        System.out.println("4: Return Next UI");
        while (true){
            System.out.printf("Input ( 1(Add) : 2(Delete) : 3(Query) : 4(Exit)) : ");
            switch (scanner.nextInt()){
                case 1:
                    customerManagerServ.addCustomerToList(new Customer("001","C001"));
                    break;
                case 2:
                    customerManagerServ.deleteCustomerFromList(new Customer("001","C001"));
                    break;
                case 3:
                    customerManagerServ.queryCustomerFromList();
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
