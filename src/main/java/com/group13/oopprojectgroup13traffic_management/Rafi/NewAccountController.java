package com.group13.oopprojectgroup13traffic_management.Rafi;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.IOException;

public class NewAccountController
{
    @javafx.fxml.FXML
    private TextField lic_num;
    @javafx.fxml.FXML
    private TextField re_pass;
    @javafx.fxml.FXML
    private TextField user_id;
    @javafx.fxml.FXML
    private TextField pass;
    @javafx.fxml.FXML
    private TextField user_name;
    @javafx.fxml.FXML
    private TextField phn;
    @javafx.fxml.FXML
    private TextField nid;
    @javafx.fxml.FXML
    private CheckBox check;

    @javafx.fxml.FXML
    public void initialize() {
        // Initialization code if needed
    }

    @javafx.fxml.FXML
    public void submit(ActionEvent actionEvent) {
        // Check if any field is empty
        if (user_name.getText().trim().isEmpty() ||
                user_id.getText().trim().isEmpty() ||
                nid.getText().trim().isEmpty() ||
                lic_num.getText().trim().isEmpty() ||
                phn.getText().trim().isEmpty() ||
                pass.getText().trim().isEmpty() ||
                re_pass.getText().trim().isEmpty()) {

            showErrorAlert("Please fill all the fields.");
            return;
        }

        // Check if password and rewrite password match
        if (!pass.getText().equals(re_pass.getText())) {
            showErrorAlert("Password and rewrite password do not match.");
            return;
        }

        // Check password requirements
        String password = pass.getText();
        boolean hasNumber = false;
        boolean hasSpecialChar = false;
        String specialChars = "!@#$%^&*()_+-=[]{}|;:,.<>?`~";

        // Check for number and special character
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasNumber = true;
            }
            if (specialChars.contains(String.valueOf(c))) {
                hasSpecialChar = true;
            }
        }

        // Check if password has at least 6 characters, a number and a special character
        if (password.length() < 6 || !hasNumber || !hasSpecialChar) {
            showErrorAlert("Password must contain at least a number and a Special character (!@#$...) and be at least 6 characters long.");
            return;
        }

        // Check if checkbox is checked
        if (!check.isSelected()) {
            showErrorAlert("Please accept our terms and conditions.");
            return;
        }

        // All validations passed - show success message and go to login page
        Alert successAlert = new Alert(AlertType.INFORMATION);
        successAlert.setTitle("Success");
        successAlert.setHeaderText("Congratulations!");
        successAlert.setContentText("Your account has been created successfully!");
        successAlert.showAndWait();

        // After showing success message, go to login page
        goToLoginPage(actionEvent);
    }

    @javafx.fxml.FXML
    public void cancle(ActionEvent actionEvent) {
        // Go directly to login page without validation
        goToLoginPage(actionEvent);
    }

    // Helper method to show error alerts
    private void showErrorAlert(String message) {
        Alert errorAlert = new Alert(AlertType.ERROR);
        errorAlert.setTitle("Error");
        errorAlert.setHeaderText(null);
        errorAlert.setContentText(message);
        errorAlert.showAndWait();
    }

    // Helper method to go to login page
    private void goToLoginPage(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("log-in.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            showErrorAlert("Cannot load login page.");
        }
    }
}