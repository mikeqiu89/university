package service;

import bean.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerManagerServ {
    List<Customer> customerList = new ArrayList<>();

    public CustomerManagerServ(){
        this.customerList.add(new Customer("001","C001"));
        this.customerList.add(new Customer("002","C002"));
        this.customerList.add(new Customer("003","C003"));
        this.customerList.add(new Customer("004","C004"));

    }

    public CustomerManagerServ(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public List<Customer> addCustomerToList(Customer customer){
        Boolean bCustomerExist = false;
        for(int i=0; i<customerList.size(); i++){
            if(true == customer.getStrName().contains(customerList.get(i).getStrName()) ){
                bCustomerExist = true;
                return customerList;
            }
        }
        if(false == bCustomerExist){
            customerList.add(customer);
        }
        return customerList;
    }

    public List<Customer> deleteCustomerFromList(Customer customer){
        for(int i=0; i<customerList.size(); i++){
            if(true == customer.getStrName().contains(customerList.get(i).getStrName()) ){
                Customer customerRemove = customerList.remove(i);
            }
        }
        return customerList;
    }

    public List<Customer> queryCustomerFromList(){
        for (Customer customer : customerList){
            System.out.println(customer.toString());
        }
        return customerList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void doCustomerManager(){

    }
}
