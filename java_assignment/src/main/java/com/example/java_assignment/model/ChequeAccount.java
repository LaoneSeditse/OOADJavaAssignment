package com.example.java_assignment.model;

public class ChequeAccount extends Account {
    private String employer;
    private String companyAddress;

    public ChequeAccount(String accountNumber, double balance, String branch, Customer customer, 
                        String employer, String companyAddress) {
        super(accountNumber, balance, branch, customer);
        this.employer = employer;
        this.companyAddress = companyAddress;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " to Cheque Account: " + accountNumber);
        }
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " from Cheque Account: " + accountNumber);
            return true;
        }
        System.out.println("Insufficient funds or invalid amount for withdrawal");
        return false;
    }

    @Override
    public void payInterest() {
        System.out.println("No interest paid on Cheque Account: " + accountNumber);
    }

    @Override
    public String getAccountType() {
        return "Cheque";
    }

    public String getEmployer() { return employer; }
    public String getCompanyAddress() { return companyAddress; }
}