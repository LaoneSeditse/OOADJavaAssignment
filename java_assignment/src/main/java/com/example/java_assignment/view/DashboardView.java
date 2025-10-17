package com.example.java_assignment.view;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class DashboardView {
    private Stage primaryStage;
    
    public DashboardView(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    
    public void showDashboard() {
        System.out.println("Showing dashboard");
    }
    
    public void updateCustomerList(String[] customers) {
        System.out.println("Updating customer list with " + customers.length + " customers");
    }
    
    public void updateAccountList(String[] accounts) {
        System.out.println("Updating account list with " + accounts.length + " accounts");
    }
    
    public void displayTransactionResult(String result) {
        System.out.println("Transaction Result: " + result);
    }
}