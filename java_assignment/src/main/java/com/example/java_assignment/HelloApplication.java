package com.example.java_assignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        // Load FXML
        Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));

        // Create and set up scene
        Scene scene = new Scene(root);
        primaryStage.setTitle("My JavaFX Bank App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}