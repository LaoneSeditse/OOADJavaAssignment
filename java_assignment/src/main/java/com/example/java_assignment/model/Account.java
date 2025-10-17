package com.example.java_assignment.model;

public abstract class Account {
    protected String accountNumber;
    protected double balance;
    protected String branch;
    protected Customer customer;

    public Account(String accountNumber, double balance, String branch, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.branch = branch;
        this.customer = customer;
    }

    public abstract void deposit(double amount);
    public abstract boolean withdraw(double amount);
    public abstract void payInterest();
    public abstract String getAccountType();

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getBranch() {
        return branch;
    }

    public Customer getCustomer() {
        return customer;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}