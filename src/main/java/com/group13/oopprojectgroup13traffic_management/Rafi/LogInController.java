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
import java.io.*;
import java.util.List;

public class LogInController
{
    @javafx.fxml.FXML
    private ComboBox<String> catagory;
    @javafx.fxml.FXML
    private TextField UserID;
    @javafx.fxml.FXML
    private PasswordField Password;

    // File name for storing user data
    private static final String USER_DATA_FILE = "user_data.bin";

    @javafx.fxml.FXML
    public void initialize() {
        // Add items to the ComboBox
        catagory.getItems().add("General commuter");
        catagory.getItems().add("Public transport coordinator");
        catagory.setPromptText("Select Category");
    }

    @javafx.fxml.FXML
    public void signIN(ActionEvent actionEvent) {
        // Check if category is selected
        if (catagory.getValue() == null) {
            showError("Please select a category.");
            return;
        }

        // Check if User ID is entered
        if (UserID.getText().trim().isEmpty()) {
            showError("Please enter your User ID.");
            return;
        }

        // Check if Password is entered
        if (Password.getText().trim().isEmpty()) {
            showError("Please enter your password.");
            return;
        }

        // Verify user credentials
        String userId = UserID.getText();
        String password = Password.getText();
        String selectedCategory = catagory.getValue();

        if (verifyUser(userId, password, selectedCategory)) {
            // Login successful - navigate to correct scene
            navigateToDashboard(actionEvent, selectedCategory);
        } else {
            showError("Invalid User ID, Password, or Account Type.");
        }
    }

    // Add this method to handle the "Create New Account" button
    @javafx.fxml.FXML
    public void new_acc(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("new_account.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            showError("Cannot load new account page.");
        }
    }

    // Verify user from binary file
    private boolean verifyUser(String userId, String password, String category) {
        File file = new File(USER_DATA_FILE);
        if (!file.exists()) {
            return false;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            @SuppressWarnings("unchecked")
            List<user_main_model> users = (List<user_main_model>) ois.readObject();

            for (user_main_model user : users) {
                if (user.getUserID().equals(userId) &&
                        user.getUser_password().equals(password)) {

                    // Check if user type matches selected category
                    if (user instanceof GeneralCommuterModel && category.equals("General commuter")) {
                        return true;
                    } else if (user instanceof PublicTransportCoordinatorModel &&
                            category.equals("Public transport coordinator")) {
                        return true;
                    }
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return false;
    }

    // Navigate to dashboard based on user type
    private void navigateToDashboard(ActionEvent actionEvent, String category) {
        try {
            String fxmlFile = "";

            if (category.equals("General commuter")) {
                fxmlFile = "gen_commuter.fxml";
            } else if (category.equals("Public transport coordinator")) {
                fxmlFile = "user2_dashboard.fxml"; // CHANGED FROM "checker.fxml" TO "user2_dashboard.fxml"
            }

            Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
            showError("Cannot load dashboard.");
        }
    }

    // Show error messages
    private void showError(String message) {
        Alert errorBox = new Alert(Alert.AlertType.ERROR);
        errorBox.setTitle("Error");
        errorBox.setHeaderText(null);
        errorBox.setContentText(message);
        errorBox.showAndWait();
    }
}