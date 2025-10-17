package com.example.java_assignment.model;

public class InvestmentAccount extends Account {
    private static final double MONTHLY_INTEREST_RATE = 0.05;
    private static final double MIN_OPENING_BALANCE = 500.00;

    public InvestmentAccount(String accountNumber, double balance, String branch, Customer customer) {
        super(accountNumber, balance, branch, customer);
        if (balance < MIN_OPENING_BALANCE) {
            throw new IllegalArgumentException("Investment account requires minimum opening balance of " + MIN_OPENING_BALANCE);
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " to Investment Account: " + accountNumber);
        }
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " from Investment Account: " + accountNumber);
            return true;
        }
        System.out.println("Insufficient funds or invalid amount for withdrawal");
        return false;
    }

    @Override
    public void payInterest() {
        double interest = balance * MONTHLY_INTEREST_RATE;
        balance += interest;
        System.out.println("Interest paid: " + interest + " to Investment Account: " + accountNumber);
    }

    @Override
    public String getAccountType() {
        return "Investment";
    }
}