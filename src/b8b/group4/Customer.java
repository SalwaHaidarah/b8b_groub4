/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b8b.group4;

import java.util.ArrayList;

public class Customer {

    private String userName=null;
    private String password=null;
    private String customerFirstName;
    private String customerLastName;
    private String address;
    private Order newOrder=null;
    public static ArrayList<Customer> customers = new ArrayList<>();

//CONSTRUCTOR
    public Customer(String userName, String password, String customerFirstName, String customerLastName, String address) {
        this.userName = userName;
        this.password = password;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.address = address;
    }
//SETTERS AND GETTERS

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Order getNewOrder() {
        return newOrder;
    }

    public void setNewOrder(Order newOrder) {
        this.newOrder = newOrder;
    }

//METHODS: search to the customer by user name and password and chick if the customer regestir or not

    public static Customer searchCustomer(String username, String password) {
        for (int i = 0; i < customers.size(); i++) {
            if (username.equals(customers.get(i).getUserName()) && password.equals(customers.get(i).getPassword())) {
                return customers.get(i);
            }
        }
        return null;

    }

}
