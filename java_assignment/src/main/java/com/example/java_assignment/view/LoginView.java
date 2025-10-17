package com.example.java_assignment.view;

import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginView {
    private Stage primaryStage;
    
    public LoginView(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
    
    public void showLoginScreen() {
        System.out.println("Showing login screen");
    }
    
    public void showError(String message) {
        System.out.println("Login Error: " + message);
    }
}