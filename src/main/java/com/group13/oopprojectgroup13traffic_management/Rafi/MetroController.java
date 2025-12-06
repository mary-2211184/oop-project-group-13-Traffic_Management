package com.group13.oopprojectgroup13traffic_management.Rafi;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MetroController
{
    @javafx.fxml.FXML
    private DatePicker date;
    @javafx.fxml.FXML
    private TextField cvc;
    @javafx.fxml.FXML
    private TextField card_number;
    @javafx.fxml.FXML
    private CheckBox female_rsv;
    @javafx.fxml.FXML
    private CheckBox terms;
    @javafx.fxml.FXML
    private TextField nam_on_card;
    @javafx.fxml.FXML
    private TextField from;
    @javafx.fxml.FXML
    private TextField exp_date;
    @javafx.fxml.FXML
    private TextField time;
    @javafx.fxml.FXML
    private TextField to;
    @javafx.fxml.FXML
    private TextField pay_ammount;

    // File name for storing metro tickets
    private static final String METRO_TICKETS_FILE = "metro_tickets.bin";

    @javafx.fxml.FXML
    public void initialize() {
        // Set today's date as default in date picker
        date.setValue(LocalDate.now());
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
    public void sign_out(ActionEvent actionEvent) {
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
    public void checkout(ActionEvent actionEvent) {
        // Validate all required fields
        if (!validateFields()) {
            return;
        }

        // Save the ticket data
        if (saveTicketData()) {
            // Show success message
            Alert successAlert = new Alert(AlertType.INFORMATION);
            successAlert.setTitle("Success");
            successAlert.setHeaderText("Ticket Booked Successfully!");
            successAlert.setContentText("Your metro ticket has been booked successfully.");
            successAlert.showAndWait();

            // Clear the form after successful booking
            clearForm();
        } else {
            // Show error message
            Alert errorAlert = new Alert(AlertType.ERROR);
            errorAlert.setTitle("Error");
            errorAlert.setHeaderText("Booking Failed");
            errorAlert.setContentText("Failed to save ticket. Please try again.");
            errorAlert.showAndWait();
        }
    }

    // Helper method to validate all fields
    private boolean validateFields() {
        StringBuilder errorMessage = new StringBuilder();

        // Check if all required fields are filled
        if (date.getValue() == null) {
            errorMessage.append("• Please select a date.\n");
        }

        if (from.getText().trim().isEmpty()) {
            errorMessage.append("• Please enter 'From' station.\n");
        }

        if (to.getText().trim().isEmpty()) {
            errorMessage.append("• Please enter 'To' station.\n");
        }

        if (time.getText().trim().isEmpty()) {
            errorMessage.append("• Please enter travel time.\n");
        }

        if (pay_ammount.getText().trim().isEmpty()) {
            errorMessage.append("• Please enter payment amount.\n");
        }

        if (nam_on_card.getText().trim().isEmpty()) {
            errorMessage.append("• Please enter name on card.\n");
        }

        if (card_number.getText().trim().isEmpty()) {
            errorMessage.append("• Please enter card number.\n");
        }

        if (exp_date.getText().trim().isEmpty()) {
            errorMessage.append("• Please enter expiry date.\n");
        }

        if (cvc.getText().trim().isEmpty()) {
            errorMessage.append("• Please enter CVC.\n");
        }

        // Check if terms and conditions are accepted
        if (!terms.isSelected()) {
            errorMessage.append("• Please accept the terms and conditions.\n");
        }

        // If there are errors, show them
        if (errorMessage.length() > 0) {
            Alert errorAlert = new Alert(AlertType.ERROR);
            errorAlert.setTitle("Validation Error");
            errorAlert.setHeaderText("Please correct the following:");
            errorAlert.setContentText(errorMessage.toString());
            errorAlert.showAndWait();
            return false;
        }

        return true;
    }

    // Helper method to save ticket data to binary file
    private boolean saveTicketData() {
        try {
            // Get date as string
            String ticketDate = "";
            if (date.getValue() != null) {
                ticketDate = date.getValue().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            }

            // Create MetroTicketModel object
            MetroTicketModel ticket = new MetroTicketModel(
                    ticketDate,
                    cvc.getText(),
                    card_number.getText(),
                    female_rsv.isSelected(),
                    terms.isSelected(),
                    nam_on_card.getText(),
                    from.getText(),
                    exp_date.getText(),
                    time.getText(),
                    to.getText(),
                    pay_ammount.getText()
            );

            // Read existing tickets
            List<MetroTicketModel> tickets = readTicketsFromFile();

            // Add new ticket
            tickets.add(ticket);

            // Save all tickets back to file
            return saveTicketsToFile(tickets);

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Helper method to read tickets from binary file
    private List<MetroTicketModel> readTicketsFromFile() {
        File file = new File(METRO_TICKETS_FILE);
        List<MetroTicketModel> tickets = new ArrayList<>();

        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                @SuppressWarnings("unchecked")
                List<MetroTicketModel> existingTickets = (List<MetroTicketModel>) ois.readObject();
                tickets.addAll(existingTickets);
            } catch (IOException | ClassNotFoundException e) {
                // If file is empty or corrupted, return empty list
                System.err.println("Error reading tickets file: " + e.getMessage());
            }
        }

        return tickets;
    }

    // Helper method to save tickets to binary file
    private boolean saveTicketsToFile(List<MetroTicketModel> tickets) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(METRO_TICKETS_FILE))) {
            oos.writeObject(tickets);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Helper method to clear the form
    private void clearForm() {
        date.setValue(null);
        from.clear();
        to.clear();
        time.clear();
        pay_ammount.clear();
        nam_on_card.clear();
        card_number.clear();
        exp_date.clear();
        cvc.clear();
        female_rsv.setSelected(false);
        terms.setSelected(false);
    }
}