package com.group13.oopprojectgroup13traffic_management.Rafi;

import javafx.event.ActionEvent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

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
    @FXML
    private ComboBox<String> acc_type;

    // File name for storing user data
    private static final String USER_DATA_FILE = "user_data.bin";

    @javafx.fxml.FXML
    public void initialize() {
        // Add account type options to ComboBox
        acc_type.getItems().addAll("General commuter", "Public transport coordinator");
        acc_type.setPromptText("Select Account Type");
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

        // Check if account type is selected
        if (acc_type.getValue() == null) {
            showErrorAlert("Please select an account type.");
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

        // Check if user ID already exists
        if (isUserIdExists(user_id.getText())) {
            showErrorAlert("User ID already exists. Please choose a different User ID.");
            return;
        }

        // Create and save user object
        if (saveUserData()) {
            // All validations passed - show success message and go to login page
            Alert successAlert = new Alert(AlertType.INFORMATION);
            successAlert.setTitle("Success");
            successAlert.setHeaderText("Congratulations!");
            successAlert.setContentText("Your account has been created successfully!");
            successAlert.showAndWait();

            // After showing success message, go to login page
            goToLoginPage(actionEvent);
        } else {
            showErrorAlert("Error saving user data. Please try again.");
        }
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

    // Check if user ID already exists
    private boolean isUserIdExists(String userId) {
        File file = new File(USER_DATA_FILE);
        if (!file.exists()) {
            return false;
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            @SuppressWarnings("unchecked")
            List<user_main_model> users = (List<user_main_model>) ois.readObject();
            for (user_main_model user : users) {
                if (user.getUserID().equals(userId)) {
                    return true;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            // If file is empty or corrupted, return false
        }
        return false;
    }

    // Save user data to binary file
    private boolean saveUserData() {
        List<user_main_model> users = new ArrayList<>();

        // Read existing users
        File file = new File(USER_DATA_FILE);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                @SuppressWarnings("unchecked")
                List<user_main_model> existingUsers = (List<user_main_model>) ois.readObject();
                users.addAll(existingUsers);
            } catch (IOException | ClassNotFoundException e) {
                // If can't read existing file, start with empty list
            }
        }

        // Create appropriate user object based on account type
        user_main_model newUser;
        String accountType = acc_type.getValue();

        if (accountType.equals("General commuter")) {
            newUser = new GeneralCommuterModel(
                    user_id.getText(),
                    user_name.getText(),
                    pass.getText(),
                    nid.getText(),
                    lic_num.getText(),
                    phn.getText()
            );
        } else {
            newUser = new PublicTransportCoordinatorModel(
                    user_id.getText(),
                    user_name.getText(),
                    pass.getText(),
                    nid.getText(),
                    lic_num.getText(),
                    phn.getText()
            );
        }

        // Add new user to the list
        users.add(newUser);

        // Save all users to file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(USER_DATA_FILE))) {
            oos.writeObject(users);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}