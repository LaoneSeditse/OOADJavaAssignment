package com.example.java_assignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SavingsController {

    @FXML
    private TextField savingsDeposit;
    @FXML private Label savingsBalance;
    private Savings account;

    @FXML
    public void initialize() {
        savingsBalance.setText("Balance: $" + account.getBalance());
    }
        @FXML
    private void depositButtonAction(ActionEvent event) {
        double amount = Double.parseDouble(savingsDeposit.getText());
        account.deposit(amount);
    }
}