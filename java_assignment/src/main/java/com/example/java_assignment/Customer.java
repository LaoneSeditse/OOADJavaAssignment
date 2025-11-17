package com.example.java_assignment;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String CustomerName;
    private int CustomerID;
    private String Address;
    private int cell;
    private String Password;
    private static List<Customer> allCustomers = new ArrayList<>();

    public Customer(String CustomerName, String Address, int cell,  String Password) {
        this.CustomerName = CustomerName;
        this.CustomerID = CustomerID +1;
        this.Address = Address;
        this.cell = cell;
        this.Password = Password;
    }

    public String getCustomerName() {
        return CustomerName;
    }
    public int getCustomerID() {
        return CustomerID;
    }
    public String getAddress() { return  Address; }
    public int getCell() { return cell; }
    public String getPassword() { return Password; }

    public static int findCustomer(String name, String password) {
        for (Customer c : allCustomers) {
            if (c.getCustomerName().equals(name) && c.getPassword().equals(password)) {
                return c.getCustomerID(); // match found
            }
        }
        return 0; // no match
    }
}
