package com.group13.oopprojectgroup13traffic_management.Rafi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.IOException;

public class GenCommuterController {

    @FXML
    public void initialize() {
        // Initialization code if needed
    }

    @Deprecated
    public void driv_lic_app(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("licenses_aplication.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setTitle("Driving Licenses Application");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public void raod_cond(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("hazardous_roads.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public void fine_pay(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("pay_fine.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public void payment(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("pay_passes.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public void fare_list(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("fare_list.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public void vh_complain(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("vehicle_complain.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public void ride(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("share_trip.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public void TandC(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("policies_regulations.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public void signout(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("log-in.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}