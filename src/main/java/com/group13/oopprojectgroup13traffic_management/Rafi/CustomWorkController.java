package com.group13.oopprojectgroup13traffic_management.Rafi;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomWorkController
{
    @javafx.fxml.FXML
    private ComboBox<String> shift_type;
    @javafx.fxml.FXML
    private TextField current_stop;
    @javafx.fxml.FXML
    private DatePicker req_date;
    @javafx.fxml.FXML
    private TextArea reason_txtarea;
    @javafx.fxml.FXML
    private TextField req_stop;
    @javafx.fxml.FXML
    private TextField shift_time;
    @javafx.fxml.FXML
    private DatePicker local_date;

    // File name for saving work shift requests
    private static final String WORK_SHIFT_FILE = "work_shifts.bin";

    @javafx.fxml.FXML
    public void initialize() {
        // This runs when the page loads

        // Step 1: Add shift type options to ComboBox
        shift_type.getItems().addAll("mornig", "evening", "afternoon");
        shift_type.setPromptText("Select Shift Type");

        // Step 2: Set today's date in local_date
        local_date.setValue(LocalDate.now());
    }

    @javafx.fxml.FXML
    public void submit(ActionEvent actionEvent) {
        // Step 1: Check if all fields are filled
        if (!areAllFieldsFilled()) {
            showErrorPopup("Please fill in all fields!");
            return;
        }

        // Step 2: Save the data
        if (saveWorkShift()) {
            // Step 3: Show success message
            showSuccessPopup("Work shift request submitted successfully!");

            // Step 4: Clear the form
            clearForm();
        } else {
            showErrorPopup("Failed to save. Please try again.");
        }
    }

    @javafx.fxml.FXML
    public void dashboard(ActionEvent actionEvent) {
        try {
            // Load the log-in.fxml file
            Parent root = FXMLLoader.load(getClass().getResource("user2_dashboard.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            showErrorPopup("Cannot load dashboard.");
        }
    }

    // Helper method to check if all fields are filled
    private boolean areAllFieldsFilled() {
        // Check each field one by one

        // Check shift_type (ComboBox)
        if (shift_type.getValue() == null || shift_type.getValue().isEmpty()) {
            return false;
        }

        // Check current_stop (TextField)
        if (current_stop.getText().trim().isEmpty()) {
            return false;
        }

        // Check req_date (DatePicker)
        if (req_date.getValue() == null) {
            return false;
        }

        // Check reason_txtarea (TextArea)
        if (reason_txtarea.getText().trim().isEmpty()) {
            return false;
        }

        // Check req_stop (TextField)
        if (req_stop.getText().trim().isEmpty()) {
            return false;
        }

        // Check shift_time (TextField)
        if (shift_time.getText().trim().isEmpty()) {
            return false;
        }

        // Check local_date (DatePicker) - already set to today, but check anyway
        if (local_date.getValue() == null) {
            return false;
        }

        // If all checks pass, return true
        return true;
    }

    // Helper method to save work shift data
    private boolean saveWorkShift() {
        try {
            // Step 1: Get data from each field
            String shiftType = shift_type.getValue();
            String currentStop = current_stop.getText();
            LocalDate requestedDate = req_date.getValue();
            String reason = reason_txtarea.getText();
            String requestedStop = req_stop.getText();
            String shiftTime = shift_time.getText();
            LocalDate localDateValue = local_date.getValue();

            // Step 2: Create a CustomWorkModel object with the data
            CustomWorkModel workShift = new CustomWorkModel(
                    shiftType, currentStop, requestedDate, reason,
                    requestedStop, shiftTime, localDateValue
            );

            // Step 3: Read existing work shifts from file
            List<CustomWorkModel> workShifts = readWorkShiftsFromFile();

            // Step 4: Add the new work shift to the list
            workShifts.add(workShift);

            // Step 5: Save all work shifts back to the file
            saveWorkShiftsToFile(workShifts);

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Helper method to read work shifts from binary file
    private List<CustomWorkModel> readWorkShiftsFromFile() {
        File file = new File(WORK_SHIFT_FILE);
        List<CustomWorkModel> workShifts = new ArrayList<>();

        // If file doesn't exist, return empty list
        if (!file.exists()) {
            return workShifts;
        }

        try {
            // Open the file for reading
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            // Read the list from file
            workShifts = (List<CustomWorkModel>) objectIn.readObject();

            // Close the files
            objectIn.close();
            fileIn.close();

        } catch (Exception e) {
            System.out.println("Error reading work shifts: " + e.getMessage());
        }

        return workShifts;
    }

    // Helper method to save work shifts to binary file
    private void saveWorkShiftsToFile(List<CustomWorkModel> workShifts) throws IOException {
        // Open the file for writing
        FileOutputStream fileOut = new FileOutputStream(WORK_SHIFT_FILE);
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

        // Write the list to file
        objectOut.writeObject(workShifts);

        // Close the files
        objectOut.close();
        fileOut.close();
    }

    // Helper method to show error popup
    private void showErrorPopup(String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Helper method to show success popup
    private void showSuccessPopup(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Helper method to clear the form
    private void clearForm() {
        shift_type.getSelectionModel().clearSelection();
        current_stop.clear();
        req_date.setValue(null);
        reason_txtarea.clear();
        req_stop.clear();
        shift_time.clear();
        local_date.setValue(LocalDate.now()); // Reset to today
    }
}