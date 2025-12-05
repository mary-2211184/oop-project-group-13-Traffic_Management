package com.group13.oopprojectgroup13traffic_management.Rafi;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.IOException;

public class LogInController
{
    @javafx.fxml.FXML
    private ComboBox category;

    @javafx.fxml.FXML
    private TextField UserID;

    @javafx.fxml.FXML
    private PasswordField Password;

    @javafx.fxml.FXML
    public void initialize() {
        // Add items to the ComboBox
        category.getItems().add("General commuter");
        category.getItems().add("Public transport coordinator");
        category.setPromptText("Select Category");
    }

    @javafx.fxml.FXML
    public void signIN(ActionEvent actionEvent) {
        // Check if category is selected
        if (category.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please select a category.");
            alert.showAndWait();
            return;
        }

        // Check if UserID is entered
        if (UserID.getText().trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please enter your User ID.");
            alert.showAndWait();
            return;
        }

        // Get password text
        String password = Password.getText();

        // Check password length (at least 6 characters)
        if (password.length() < 6) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please rewrite the password atleast 6 charecter with an number and a spacial charecter.");
            alert.showAndWait();
            return;
        }

        // Check if password contains a number
        boolean hasNumber = false;
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasNumber = true;
                break;
            }
        }

        // Check if password contains a special character
        boolean hasSpecialChar = false;
        String specialChars = "!@#$%^&*()_+-=[]{}|;:,.<>?`~";
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (specialChars.contains(String.valueOf(c))) {
                hasSpecialChar = true;
                break;
            }
        }

        // If password doesn't have number or special character, show error
        if (!hasNumber || !hasSpecialChar) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please rewrite the password atleast 6 charecter with an number and a spacial charecter.");
            alert.showAndWait();
            return;
        }

        // All validations passed, now navigate to correct scene
        String selectedCategory = (String) category.getValue();
        String fxmlFile = "";

        if (selectedCategory.equals("General commuter")) {
            fxmlFile = "gen_commuter.fxml";
        } else if (selectedCategory.equals("Public transport coordinator")) {
            fxmlFile = "checker.fxml";
        }

        try {
            // Load the FXML file
            Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));

            // Get the current window (stage)
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

            // Set the new scene
            stage.setScene(new Scene(root));
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
            // Show error if file not found
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Cannot load the next page. Please check if the file exists.");
            alert.showAndWait();
        }
    }

    @FXML
    public void new_acc(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("new_account.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setTitle("Create a New Account");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}