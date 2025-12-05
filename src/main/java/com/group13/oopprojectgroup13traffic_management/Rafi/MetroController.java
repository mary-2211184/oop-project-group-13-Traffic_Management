package com.group13.oopprojectgroup13traffic_management.Rafi;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class MetroController
{
    @javafx.fxml.FXML
    private DatePicker date;
    @javafx.fxml.FXML
    private TextField cvc;
    @javafx.fxml.FXML
    private TextField card_number;
    @javafx.fxml.FXML
    private CheckBox female_rsv;
    @javafx.fxml.FXML
    private CheckBox terms;
    @javafx.fxml.FXML
    private TextField nam_on_card;
    @javafx.fxml.FXML
    private TextField from;
    @javafx.fxml.FXML
    private TextField exp_date;
    @javafx.fxml.FXML
    private TextField time;
    @javafx.fxml.FXML
    private TextField to;
    @javafx.fxml.FXML
    private TextField pay_ammount;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) {
        try {
            // Load the pay_passes.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("pay_passes.fxml"));
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

    @javafx.fxml.FXML
    public void dashboard(ActionEvent actionEvent) {
        try {
            // Load the gen_commuter.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("gen_commuter.fxml"));
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

    @javafx.fxml.FXML
    public void sign_out(ActionEvent actionEvent) {
        try {
            // Load the log-in.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("log-in.fxml"));
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

    @javafx.fxml.FXML
    public void checkout(ActionEvent actionEvent) {
    }
}