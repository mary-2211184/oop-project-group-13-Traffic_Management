package com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.TCA;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SignalOptimizationController
{
    @javafx.fxml.FXML
    private TableColumn svttTc;
    @javafx.fxml.FXML
    private TableColumn svtclTC;
    @javafx.fxml.FXML
    private TableColumn svtrTC;
    @javafx.fxml.FXML
    private TextField yssTF;
    @javafx.fxml.FXML
    private TableColumn svtyTC;
    @javafx.fxml.FXML
    private TableColumn svtgTC;
    @javafx.fxml.FXML
    private TableView svtTV;
    @javafx.fxml.FXML
    private TextField rssTF;
    @javafx.fxml.FXML
    private TextField gssTF;
    @javafx.fxml.FXML
    private ComboBox aaisCM;
    @javafx.fxml.FXML
    private TableColumn svtvcTc;

    @javafx.fxml.FXML
    public void initialize() {
        // This method runs automatically when the FXML loads
        // You can put initialization code here
        System.out.println("Signal Optimization Controller Initialized!");
    }

    @Deprecated
    public void bOA2(ActionEvent actionEvent) {
    }

    @Deprecated
    public void rbOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void btmOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sobOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void antOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void Back(ActionEvent actionEvent) {
        try {
            // IMPORTANT: Change "SignalOptimization.fxml" to the actual FXML file
            // you want to go back to (e.g., "TrafficMonitor.fxml")
            FXMLLoader loader = new FXMLLoader(getClass().getResource("TrafficMonitor.fxml"));
            Parent root = loader.load();

            // Get the current stage from the action event
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

            // Create new scene and set it on the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Traffic Monitor"); // Change title accordingly
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately (show error message, etc.)
            System.out.println("Error loading FXML file: " + e.getMessage());
        }
    }
}
// END OF CLASS - Do not write any methods after this closing brace