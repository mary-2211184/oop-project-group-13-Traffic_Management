package com.group13.oopprojectgroup13traffic_management.Rafi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.IOException;

public class PayPassesController {

    @FXML
    public void initialize() {
        // Initialization code if needed
    }

    @FXML
    public void toll_action(ActionEvent actionEvent) {
        try {
            // Load the toll.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("toll.fxml"));
            Parent root = loader.load();

            // Get the current stage from the action event
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

            // Create new scene and set it on the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately (show error message, etc.)
        }
    }

    @FXML
    public void metro_action(ActionEvent actionEvent) {
        try {
            // Load the metro.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("metro.fxml"));
            Parent root = loader.load();

            // Get the current stage from the action event
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

            // Create new scene and set it on the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately (show error message, etc.)
        }
    }
}