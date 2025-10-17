package com.example.java_assignment.view;

public class AccountView {
    
    public void displayAccountDetails(String accountNumber, String accountType, double balance) {
        System.out.println("Account: " + accountNumber);
        System.out.println("Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
    
    public void showAccountCreationForm() {
        System.out.println("Showing account creation form");
    }
    
    public void showTransactionForm(String transactionType) {
        System.out.println("Showing " + transactionType + " form");
    }
}