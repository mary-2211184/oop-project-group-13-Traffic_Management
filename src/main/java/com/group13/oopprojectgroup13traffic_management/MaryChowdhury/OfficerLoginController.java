package com.group13.oopprojectgroup13traffic_management.MaryChowdhury;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class OfficerLoginController
{
    @FXML public TextField usernameField;
    @FXML public PasswordField passwordField;
    @FXML public Label loginStatus;

    public TextField getUsernameField() {
        return usernameField;
    }

    public void setUsernameField(TextField usernameField) {
        this.usernameField = usernameField;
    }

    public PasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(PasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public Label getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Label loginStatus) {
        this.loginStatus = loginStatus;
    }

    @Override
    public String toString() {
        return STR."OfficerLoginController{usernameField=\{usernameField}, passwordField=\{passwordField}, loginStatus=\{loginStatus}}";
    }

    public OfficerLoginController(TextField usernameField, PasswordField passwordField, Label loginStatus) {
        this.usernameField = usernameField;
        this.passwordField = passwordField;
        this.loginStatus = loginStatus;


    }

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void oaLogin(ActionEvent actionEvent) {
        String user = usernameField.getText();
        String pass = passwordField.getText();
        if (user==null || user.isBlank() || pass==null || pass.isBlank()) {
            loginStatus.setText("Enter credentials.");
            return;
        }

        // TODO: authenticate with backend and verify officer role
        boolean ok = "officer".equals(user) && "password".equals(pass); // placeholder
        if (ok) {
            loginStatus.setText("Login successful. Loading dashboard...");
            // TODO: open officer dashboard scene
        } else {
            loginStatus.setText("Invalid credentials or insufficient role.");
        }
    }
    }