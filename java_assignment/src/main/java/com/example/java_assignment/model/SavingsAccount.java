package com.example.java_assignment.model;

public class SavingsAccount extends Account {
    private static final double MONTHLY_INTEREST_RATE = 0.0005;

    public SavingsAccount(String accountNumber, double balance, String branch, Customer customer) {
        super(accountNumber, balance, branch, customer);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " to Savings Account: " + accountNumber);
        }
    }

    @Override
    public boolean withdraw(double amount) {
        System.out.println("Withdrawals not allowed from Savings Account");
        return false;
    }

    @Override
    public void payInterest() {
        double interest = balance * MONTHLY_INTEREST_RATE;
        balance += interest;
        System.out.println("Interest paid: " + interest + " to Savings Account: " + accountNumber);
    }

    @Override
    public String getAccountType() {
        return "Savings";
    }
}