package com.example.java_assignment;

import com.almasb.fxgl.entity.action.Action;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HomeController {

    @FXML
    public void openCheque(ActionEvent event) throws IOException{
        Parent aboutRoot = FXMLLoader.load(getClass().getResource("Cheque.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(aboutRoot));
        stage.show();
    }
    @FXML
    public void openInvestment(ActionEvent event) throws IOException{
        Parent aboutRoot = FXMLLoader.load(getClass().getResource("Investment.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(aboutRoot));
        stage.show();
    }

    @FXML
    public void openSavings(ActionEvent event) throws IOException{
        Parent aboutRoot = FXMLLoader.load(getClass().getResource("Savings.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(aboutRoot));
        stage.show();
    }

}
