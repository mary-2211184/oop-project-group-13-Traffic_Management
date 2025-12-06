package com.group13.oopprojectgroup13traffic_management.Rafi;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TollController
{
    @javafx.fxml.FXML
    private TextField card_num;
    @javafx.fxml.FXML
    private TextField gate_num;
    @javafx.fxml.FXML
    private TextField cvc;
    @javafx.fxml.FXML
    private TextField nam_on_card;
    @javafx.fxml.FXML
    private TextField car_num;
    @javafx.fxml.FXML
    private TextField time;
    @javafx.fxml.FXML
    private CheckBox check;
    @javafx.fxml.FXML
    private TextField exp;
    @javafx.fxml.FXML
    private DatePicker date_p;
    @javafx.fxml.FXML
    private ComboBox<String> vh_type;
    @javafx.fxml.FXML
    private TextField amount;

    // File name for storing toll payments
    private static final String TOLL_PAYMENTS_FILE = "toll_payments.bin";

    @javafx.fxml.FXML
    public void initialize() {
        // Initialize ComboBox with vehicle types
        vh_type.getItems().addAll("Car", "Motorcycle", "Truck", "Bus", "Van");
        vh_type.setPromptText("Select Vehicle Type");

        // Set today's date as default in date picker
        date_p.setValue(LocalDate.now());
    }

    @javafx.fxml.FXML
    public void signout(ActionEvent actionEvent) {
        try {
            // Load the log-in.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("log-in.fxml"));
            Parent root = loader.load();

            // Get the current stage from the action event
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

            // Create new scene and set it on the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately (show error message, etc.)
        }
    }

    @javafx.fxml.FXML
    public void back(ActionEvent actionEvent) {
        try {
            // Load the pay_passes.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("pay_passes.fxml"));
            Parent root = loader.load();

            // Get the current stage from the action event
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

            // Create new scene and set it on the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately (show error message, etc.)
        }
    }

    @javafx.fxml.FXML
    public void dashboard(ActionEvent actionEvent) {
        try {
            // Load the gen_commuter.fxml file
            FXMLLoader loader = new FXMLLoader(getClass().getResource("gen_commuter.fxml"));
            Parent root = loader.load();

            // Get the current stage from the action event
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

            // Create new scene and set it on the stage
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
            // Handle the exception appropriately (show error message, etc.)
        }
    }

    @javafx.fxml.FXML
    public void checkout_action(ActionEvent actionEvent) {
        // Validate all required fields
        if (!validateFields()) {
            return;
        }

        // Save the toll payment data
        if (savePaymentData()) {
            // Show success message
            Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
            successAlert.setTitle("Success");
            successAlert.setHeaderText("Payment Successful!");
            successAlert.setContentText("Your toll payment has been processed successfully.");
            successAlert.showAndWait();

            // Clear the form after successful payment
            clearForm();
        } else {
            // Show error message
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setTitle("Error");
            errorAlert.setHeaderText("Payment Failed");
            errorAlert.setContentText("Failed to process payment. Please try again.");
            errorAlert.showAndWait();
        }
    }

    // Helper method to validate all fields
    private boolean validateFields() {
        StringBuilder errorMessage = new StringBuilder();

        // Check if all required fields are filled
        if (date_p.getValue() == null) {
            errorMessage.append("• Please select a date.\n");
        }

        if (vh_type.getValue() == null || vh_type.getValue().isEmpty()) {
            errorMessage.append("• Please select vehicle type.\n");
        }

        if (gate_num.getText().trim().isEmpty()) {
            errorMessage.append("• Please enter gate number.\n");
        }

        if (car_num.getText().trim().isEmpty()) {
            errorMessage.append("• Please enter car number.\n");
        }

        if (time.getText().trim().isEmpty()) {
            errorMessage.append("• Please enter time.\n");
        }

        if (amount.getText().trim().isEmpty()) {
            errorMessage.append("• Please enter amount.\n");
        }

        if (nam_on_card.getText().trim().isEmpty()) {
            errorMessage.append("• Please enter name on card.\n");
        }

        if (card_num.getText().trim().isEmpty()) {
            errorMessage.append("• Please enter card number.\n");
        }

        if (exp.getText().trim().isEmpty()) {
            errorMessage.append("• Please enter expiry date.\n");
        }

        if (cvc.getText().trim().isEmpty()) {
            errorMessage.append("• Please enter CVC.\n");
        }

        // Check if terms and conditions are accepted
        if (!check.isSelected()) {
            errorMessage.append("• Please accept the terms and conditions.\n");
        }

        // Validate amount is a number
        try {
            Double.parseDouble(amount.getText());
        } catch (NumberFormatException e) {
            errorMessage.append("• Please enter a valid amount (numbers only).\n");
        }

        // Validate card number (basic check)
        String cardNum = card_num.getText().replaceAll("\\s+", "");
        if (!cardNum.matches("\\d+")) {
            errorMessage.append("• Please enter a valid card number (numbers only).\n");
        }

        // Validate CVC (3-4 digits)
        if (!cvc.getText().matches("\\d{3,4}")) {
            errorMessage.append("• Please enter a valid CVC (3-4 digits).\n");
        }

        // If there are errors, show them
        if (errorMessage.length() > 0) {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setTitle("Validation Error");
            errorAlert.setHeaderText("Please correct the following:");
            errorAlert.setContentText(errorMessage.toString());
            errorAlert.showAndWait();
            return false;
        }

        return true;
    }

    // Helper method to save payment data to binary file
    private boolean savePaymentData() {
        try {
            // Create TollPaymentModel object
            TollPaymentModel payment = new TollPaymentModel(
                    card_num.getText(),
                    gate_num.getText(),
                    cvc.getText(),
                    nam_on_card.getText(),
                    car_num.getText(),
                    time.getText(),
                    check.isSelected(),
                    exp.getText(),
                    date_p.getValue(),
                    vh_type.getValue(),
                    amount.getText()
            );

            // Read existing payments
            List<TollPaymentModel> payments = readPaymentsFromFile();

            // Add new payment
            payments.add(payment);

            // Save all payments back to file
            return savePaymentsToFile(payments);

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Helper method to read payments from binary file
    private List<TollPaymentModel> readPaymentsFromFile() {
        File file = new File(TOLL_PAYMENTS_FILE);
        List<TollPaymentModel> payments = new ArrayList<>();

        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                @SuppressWarnings("unchecked")
                List<TollPaymentModel> existingPayments = (List<TollPaymentModel>) ois.readObject();
                payments.addAll(existingPayments);
            } catch (IOException | ClassNotFoundException e) {
                // If file is empty or corrupted, return empty list
                System.err.println("Error reading payments file: " + e.getMessage());
            }
        }

        return payments;
    }

    // Helper method to save payments to binary file
    private boolean savePaymentsToFile(List<TollPaymentModel> payments) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(TOLL_PAYMENTS_FILE))) {
            oos.writeObject(payments);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Helper method to clear the form
    private void clearForm() {
        card_num.clear();
        gate_num.clear();
        cvc.clear();
        nam_on_card.clear();
        car_num.clear();
        time.clear();
        check.setSelected(false);
        exp.clear();
        date_p.setValue(LocalDate.now()); // Reset to today
        vh_type.getSelectionModel().clearSelection();
        amount.clear();
    }
}