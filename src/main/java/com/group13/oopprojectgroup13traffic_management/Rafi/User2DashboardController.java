package com.group13.oopprojectgroup13traffic_management.Rafi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class User2DashboardController
{
    @FXML
    public void initialize() {
    }

    @FXML
    public void bus_depot(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("bus_depot.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void broadcast(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("road_close_broadcast.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void specific_stop(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("specific_stop.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void rerooute(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("reroute.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void work_shift(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("custom_work.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void vh_inspection(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("inspection_req_veh.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
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

    @FXML
    public void req_veh(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("em_veh_suplly.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void incident_report(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("update_realtime_incident.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}