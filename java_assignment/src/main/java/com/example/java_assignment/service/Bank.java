package com.example.java_assignment.service;

import com.example.java_assignment.model.*;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customers;
    private int accountCounter;

    public Bank() {
        this.customers = new ArrayList<>();
        this.accountCounter = 1000;
    }

    public Customer registerCustomer(String firstName, String surname, String address) {
        String customerId = "CUST" + (customers.size() + 1);
        Customer customer = new Customer(customerId, firstName, surname, address);
        customers.add(customer);
        return customer;
    }

    public Account openSavingsAccount(Customer customer, double initialDeposit, String branch) {
        String accountNumber = "SAV" + (++accountCounter);
        Account account = new SavingsAccount(accountNumber, initialDeposit, branch, customer);
        customer.addAccount(account);
        return account;
    }

    public Account openInvestmentAccount(Customer customer, double initialDeposit, String branch) {
        if (initialDeposit < 500.00) {
            throw new IllegalArgumentException("Investment account requires minimum BWP 500.00");
        }
        String accountNumber = "INV" + (++accountCounter);
        Account account = new InvestmentAccount(accountNumber, initialDeposit, branch, customer);
        customer.addAccount(account);
        return account;
    }

    public Account openChequeAccount(Customer customer, double initialDeposit, String branch, 
                                   String employer, String companyAddress) {
        String accountNumber = "CHQ" + (++accountCounter);
        customer.setEmploymentInfo(employer);
        Account account = new ChequeAccount(accountNumber, initialDeposit, branch, customer, 
                                          employer, companyAddress);
        customer.addAccount(account);
        return account;
    }

    public boolean deposit(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null && amount > 0) {
            account.deposit(amount);
            return true;
        }
        return false;
    }

    public boolean withdraw(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        if (account != null && amount > 0) {
            return account.withdraw(amount);
        }
        return false;
    }

    public void payMonthlyInterest() {
        for (Customer customer : customers) {
            for (Account account : customer.getAccounts()) {
                account.payInterest();
            }
        }
    }

    private Account findAccount(String accountNumber) {
        for (Customer customer : customers) {
            Account account = customer.findAccount(accountNumber);
            if (account != null) {
                return account;
            }
        }
        return null;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}