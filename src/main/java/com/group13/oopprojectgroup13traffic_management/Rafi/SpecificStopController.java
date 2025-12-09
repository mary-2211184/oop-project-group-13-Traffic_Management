package com.group13.oopprojectgroup13traffic_management.Rafi;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SpecificStopController
{
    @javafx.fxml.FXML
    private DatePicker date;
    @javafx.fxml.FXML
    private TextField stp_num;
    @javafx.fxml.FXML
    private TextField arrival_time;
    @javafx.fxml.FXML
    private TextField occupit_sit;
    @javafx.fxml.FXML
    private TextField stp_fee;
    @javafx.fxml.FXML
    private ComboBox<String> pay_option;
    @javafx.fxml.FXML
    private CheckBox terms;
    @javafx.fxml.FXML
    private TextField empt_sit;
    @javafx.fxml.FXML
    private TextField go_time;
    @javafx.fxml.FXML
    private TextField root_num;
    @javafx.fxml.FXML
    private TextField bus_num;

    // File name for saving data
    private static final String STOP_RECORDS_FILE = "stop_records.bin";

    @javafx.fxml.FXML
    public void initialize() {
        // This runs when the page loads
        // Add payment options to the ComboBox
        pay_option.getItems().addAll("hand on cash", "online", "Due");
        pay_option.setPromptText("Select Payment Option");

        // Set today's date in the date picker
        date.setValue(LocalDate.now());
    }

    @javafx.fxml.FXML
    public void record(ActionEvent actionEvent) {
        // Step 1: Check if all fields are filled
        if (!checkAllFieldsFilled()) {
            // Show error pop-up
            showErrorPopup("Please fill in all the fields!");
            return;
        }

        // Step 2: Check if terms are accepted
        if (!terms.isSelected()) {
            showErrorPopup("Please accept the terms and conditions!");
            return;
        }

        // Step 3: Save the data
        if (saveStopRecord()) {
            // Step 4: Show success message
            showSuccessPopup("Record saved successfully!");

            // Step 5: Clear all fields
            clearAllFields();
        } else {
            showErrorPopup("Failed to save record. Please try again.");
        }
    }

    // Method to check if all fields are filled
    private boolean checkAllFieldsFilled() {
        // Check each field one by one
        if (date.getValue() == null) {
            return false;
        }
        if (stp_num.getText().trim().isEmpty()) {
            return false;
        }
        if (arrival_time.getText().trim().isEmpty()) {
            return false;
        }
        if (occupit_sit.getText().trim().isEmpty()) {
            return false;
        }
        if (stp_fee.getText().trim().isEmpty()) {
            return false;
        }
        if (pay_option.getValue() == null || pay_option.getValue().isEmpty()) {
            return false;
        }
        if (empt_sit.getText().trim().isEmpty()) {
            return false;
        }
        if (go_time.getText().trim().isEmpty()) {
            return false;
        }
        if (root_num.getText().trim().isEmpty()) {
            return false;
        }
        if (bus_num.getText().trim().isEmpty()) {
            return false;
        }

        // If we reach here, all fields are filled
        return true;
    }

    // Method to save the stop record to a binary file
    private boolean saveStopRecord() {
        try {
            // Step 1: Get data from form
            LocalDate stopDate = date.getValue();
            String stopNumber = stp_num.getText();
            String arrivalTime = arrival_time.getText();
            String occupiedSeats = occupit_sit.getText();
            String stopFee = stp_fee.getText();
            String paymentOption = pay_option.getValue();
            boolean termsAccepted = terms.isSelected();
            String emptySeats = empt_sit.getText();
            String departureTime = go_time.getText();
            String routeNumber = root_num.getText();
            String busNumber = bus_num.getText();

            // Step 2: Create a model object with all data
            SpecificStopModel newRecord = new SpecificStopModel(
                    stopDate, stopNumber, arrivalTime, occupiedSeats, stopFee,
                    paymentOption, termsAccepted, emptySeats, departureTime,
                    routeNumber, busNumber
            );

            // Step 3: Read existing records from file (if any)
            List<SpecificStopModel> allRecords = readExistingRecords();

            // Step 4: Add the new record to the list
            allRecords.add(newRecord);

            // Step 5: Save all records back to the file
            saveAllRecords(allRecords);

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Method to read existing records from binary file
    private List<SpecificStopModel> readExistingRecords() {
        File file = new File(STOP_RECORDS_FILE);
        List<SpecificStopModel> records = new ArrayList<>();

        // Check if file exists
        if (!file.exists()) {
            return records; // Return empty list if no file
        }

        try {
            // Open file for reading
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            // Read the list of records
            records = (List<SpecificStopModel>) objectIn.readObject();

            // Close files
            objectIn.close();
            fileIn.close();

        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        return records;
    }

    // Method to save all records to binary file
    private void saveAllRecords(List<SpecificStopModel> records) throws IOException {
        // Open file for writing
        FileOutputStream fileOut = new FileOutputStream(STOP_RECORDS_FILE);
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

        // Write the list to file
        objectOut.writeObject(records);

        // Close files
        objectOut.close();
        fileOut.close();
    }

    // Method to show error pop-up
    private void showErrorPopup(String message) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Method to show success pop-up
    private void showSuccessPopup(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Success");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // Method to clear all fields
    private void clearAllFields() {
        date.setValue(LocalDate.now()); // Reset to today
        stp_num.clear();
        arrival_time.clear();
        occupit_sit.clear();
        stp_fee.clear();
        pay_option.getSelectionModel().clearSelection();
        terms.setSelected(false);
        empt_sit.clear();
        go_time.clear();
        root_num.clear();
        bus_num.clear();
    }

    @FXML
    public void u2_dashboard(ActionEvent actionEvent) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("user2_dashboard.fxml"));
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}