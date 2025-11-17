package com.example.java_assignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML private TextField username;
    @FXML private TextField password;
    private Account account;

    @FXML
    public void openCreateCustomer(ActionEvent event) throws IOException {
        Parent aboutRoot = FXMLLoader.load(getClass().getResource("CreateCustomer.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(aboutRoot));
        stage.show();
    }

    @FXML
    public void login(ActionEvent event) throws IOException {
        String enteredUsername = username.getText();
        String enteredPassword = password.getText();

        int cusid = Customer.findCustomer(enteredUsername, enteredPassword);

        if (cusid != 0) {
            Parent aboutRoot = FXMLLoader.load(getClass().getResource("Home.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(aboutRoot));
            stage.show();
        }
    }
}
