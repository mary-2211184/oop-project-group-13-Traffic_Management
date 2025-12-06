package com.group13.oopprojectgroup13traffic_management.MaryChowdhury;

import com.group13.oopprojectgroup13traffic_management.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class IncidentOfficerDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void oaNewIncident(ActionEvent actionEvent) throws IOException {
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Mary/IncidentOfficerDashboard.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("hello");
        stage.show();
    }

    @javafx.fxml.FXML
    public void oaTrackReport(ActionEvent actionEvent) throws IOException{
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MaryChowdhury/TrackStatus.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("hello");
        stage.show();
    }

    @javafx.fxml.FXML
    public void oaFeedback(ActionEvent actionEvent) throws IOException{
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MaryChowdhury/Feedback.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("hello");
        stage.show();
    }

    @javafx.fxml.FXML
    public void oaEditReport(ActionEvent actionEvent) throws IOException{
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MaryChowdhury/EditReport.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("hello");
        stage.show();
    }

    @javafx.fxml.FXML
    public void oaNotifications(ActionEvent actionEvent) throws IOException{
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MaryChowdhury/Notifications.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("hello");
        stage.show();
    }

    @javafx.fxml.FXML
    public void oaDeleteReport(ActionEvent actionEvent) throws IOException{
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MaryChowdhury/DeleteReport.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("hello");
        stage.show();
    }

    @javafx.fxml.FXML
    public void oaMyReports(ActionEvent actionEvent) throws IOException{
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MaryChowdhury/MyReports.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("hello");
        stage.show();
    }

    @javafx.fxml.FXML
    public void oaUploadEvidence(ActionEvent actionEvent) throws IOException{
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MaryChowdhury/UploadEvidence.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("hello");
        stage.show();
    }
}