package com.example.java_assignment.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;

public class DashboardController {
    @FXML private ListView<String> customersListView;
    @FXML private ListView<String> accountsListView;
    @FXML private TextArea transactionArea;
    @FXML private Button addCustomerButton;
    @FXML private Button openAccountButton;
    @FXML private Button depositButton;
    @FXML private Button withdrawButton;

    @FXML
    private void handleAddCustomer() {
        transactionArea.setText("Add Customer button clicked");
    }

    @FXML
    private void handleOpenAccount() {
        transactionArea.setText("Open Account button clicked");
    }

    @FXML
    private void handleDeposit() {
        transactionArea.setText("Deposit button clicked");
    }

    @FXML
    private void handleWithdraw() {
        transactionArea.setText("Withdraw button clicked");
    }
}