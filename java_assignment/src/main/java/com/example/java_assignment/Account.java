package com.example.java_assignment;

public class Account {
    private double balance;
    private int AccountNumber;
    private String CustomerName;

    public Account(int AccountNumber, String CustomerName, double balance) {
        this.AccountNumber = AccountNumber;
        this.CustomerName = CustomerName;
        this.balance = balance;
    }

    //Methods
    public void deposit(double amount) {
        this.balance += amount;
    }
    public void setBalance(double balance) {this.balance = balance;}

    public double getBalance() {return balance;}
    public int getAccountNumber() {return AccountNumber;}
    public String getCustomerName() {return CustomerName;}


}
