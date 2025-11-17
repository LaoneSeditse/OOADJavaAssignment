package com.example.java_assignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

public class InterestController {

    @FXML
    private Label balance;
    @FXML
    private TextField withdrawal;
    @FXML
    private TextField deposit;
    private Investment account;

    @FXML
    public void initialize() {
        balance.setText("Balance: $" + account.getBalance());
    }

    @FXML
    public void depositButtonAction(ActionEvent event) {
        double amount = Double.parseDouble(deposit.getText());
        account.deposit(amount);
    }

    @FXML
    private void withdrawalButtonAction(ActionEvent event) {
        double amount = Double.parseDouble(withdrawal.getText());
        account.withdrawal(amount);
    }
}