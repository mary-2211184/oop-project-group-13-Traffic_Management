package com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.TCA;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class TrafficForecastingController
{
    @javafx.fxml.FXML
    private ComboBox fzCB;
    @javafx.fxml.FXML
    private TableColumn fttvptTC;
    @javafx.fxml.FXML
    private TableColumn fttvtlTC;
    @javafx.fxml.FXML
    private ComboBox frCB;
    @javafx.fxml.FXML
    private TableColumn fttvzonerouteTC;
    @javafx.fxml.FXML
    private DatePicker sftLD;
    @javafx.fxml.FXML
    private TableView forecastTableTV;
    @javafx.fxml.FXML
    private TableColumn fttvzvcTC;


    @javafx.fxml.FXML
    public void gfOA (ActionEvent actionEvent) {
}

    @Deprecated
    public void bOA3(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void btfOA(ActionEvent actionEvent) {
    }


    @javafx.fxml.FXML
    public void initialize() {
    }
    @javafx.fxml.FXML

    public void Back(ActionEvent actionEvent) {
        try {
            // Load the Traffic_Monitor.fxml file
            FXMLLoader loader = new FXMLLoader(TrafficMonitorController.class.getResource("TrafficForecasting.fxml"));
            Parent root = loader.load();

            // Get the current stage from the action event
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

            // Create new scene and set it on the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("Traffic_Monitor");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately (show error message, etc.)
            //}


        }
    }
}