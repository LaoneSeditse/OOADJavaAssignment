package com.example.java_assignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javax.print.DocFlavor;
import java.io.IOException;

public class CreaterCustomerController {

    @FXML private TextField name;
    @FXML private TextField address;
    @FXML private TextField cell;
    @FXML private TextField password;
    @FXML private Label message;

    @FXML
    public void createCustomer(ActionEvent event) throws IOException {
        String enteredName = name.getText();
        String enteredAddress = address.getText();
        String enteredCell = cell.getText();
        String enteredPassword = password.getText();

        Customer customer = new Customer(enteredName, enteredAddress, Integer.parseInt(enteredCell),  enteredPassword);
        message.setText("Customer Created");

    }

}
