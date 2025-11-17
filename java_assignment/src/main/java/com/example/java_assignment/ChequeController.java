package com.example.java_assignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ChequeController {

    @FXML private Label withdrawMessage;
    @FXML private Label depositMessage;
    @FXML private TextField withdrawalAmount;
    @FXML private TextField depositAmount;
    @FXML private Label chequeBalance;
    private Cheque account;

    @FXML
    public void initialize() {
        chequeBalance.setText("Balance: $" + account.getBalance());
    }

    @FXML
    private void depositButtonAction(ActionEvent event) {
        double amount = Double.parseDouble(depositAmount.getText());
        account.deposit(amount);
        depositMessage.setText("Deposited $" + amount);

    }
    @FXML
    private void withdrawalButtonAction(ActionEvent event) {
        double amount = Double.parseDouble(withdrawalAmount.getText());
        account.withdrawal(amount);
        withdrawMessage.setText("Withdrawal $" + amount);
    }
}
