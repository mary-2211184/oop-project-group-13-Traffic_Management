package com.group13.oopprojectgroup13traffic_management;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CommonLogInController {

    @FXML
    private PasswordField passwordfield;
    @FXML
    private TextField useridtf;

    @FXML
    public void loginButton(ActionEvent actionEvent) throws IOException {
        String username = useridtf.getText();
        String password = passwordfield.getText();

        if (username.equals("1") && password.equals("1")) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MaryChowdhury/IncidentOfficerDashboard.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) useridtf.getScene().getWindow();
            stage.setTitle("Incident Report Dashboard");
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
        else if (username.equals("2") && password.equals("2")) {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MaryChowdhury/TrafficEnforcementOfficerDashboard.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) useridtf.getScene().getWindow();
            stage.setTitle(" k");
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }


    }


}