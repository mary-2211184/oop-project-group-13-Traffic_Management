package com.group13.oopprojectgroup13traffic_management.MaryChowdhury;

import com.group13.oopprojectgroup13traffic_management.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TrafficEnforcementOfficerDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void oaGenerateSummary(ActionEvent actionEvent) throws IOException {
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MaryChowdhury/GenerateSummary.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("hello");
        stage.show();
    }

    @javafx.fxml.FXML
    public void oaCloseReport(ActionEvent actionEvent) throws IOException{
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MaryChowdhury/Closereport.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("hello");
        stage.show();
    }

    @javafx.fxml.FXML
    public void oaUpdateStatus(ActionEvent actionEvent)throws IOException {
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MaryChowdhury/UpdateStatus.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("hello");
        stage.show();
    }

    @javafx.fxml.FXML
    public void oaVerifyReport(ActionEvent actionEvent) throws IOException{
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MaryChowdhury/VerifyReport.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("hello");
        stage.show();
    }

    @javafx.fxml.FXML
    public void oaAccessEvidence(ActionEvent actionEvent) throws IOException{
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MaryChowdhury/AccessEvidence.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("hello");
        stage.show();

    }

    @javafx.fxml.FXML
    public void oaAssignReport(ActionEvent actionEvent) throws IOException{
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MaryChowdhury/AssignReport.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("hello");
        stage.show();
    }

    @javafx.fxml.FXML
    public void oaCommunicationPanel(ActionEvent actionEvent) throws IOException{
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MaryChowdhury/CommunicationPanel.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("hello");
        stage.show();
    }

    @javafx.fxml.FXML
    public void oaOfficerLogin(ActionEvent actionEvent) throws IOException{
        Parent root = null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MaryChowdhury/OfficerLogin.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("hello");
        stage.show();
    }
}