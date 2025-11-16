package com.group13.oopprojectgroup13traffic_management.MaryChowdhury;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class IncidentReportFormController
{
    @FXML
    private TextField locationField;
    @FXML
    private TextArea descriptionArea;
    @FXML
    private TextField timeField;
    @FXML
    private DatePicker datePicker;
    @FXML
    private Label IncidentIdLabel;
    @FXML
    private ComboBox typeCombo;
    @FXML
    private Label statusLabel;

    @FXML
    public void initialize() {
        ObservableList allowedTypes = null;
        typeCombo.setItems(null);
        datePicker.setValue(LocalDate.now());
        IncidentIdLabel.setText("");
    }

    @FXML
    public void onUploadEvidence(ActionEvent actionEvent) {
        statusLabel.setText("Open 'Upload Evidence' screen from your application navigation.");
    }
    private void clearForm() {
        locationField.clear();
        typeCombo.setValue(null);
        datePicker.setValue(LocalDate.now());
        timeField.clear();
        descriptionArea.clear();
    }

    @FXML
    public void onSubmitReport(ActionEvent actionEvent) {
        String loc = locationField.getText();
        String type = typeCombo.getValue();
        LocalDate date = datePicker.getValue();
        String time = timeField.getText();
        String desc = descriptionArea.getText();

        if (loc == null || loc.isBlank() || type == null || date == null || time == null || time.isBlank()) {
            statusLabel.setText("Please fill all required fields.");
            return;
    }
        if (!time.matches("\\d{1,2}:\\d{2}")) {
            statusLabel.setText("Time must be HH:mm");
            return;
    }
        if (!allowedTypes.contains(type)) {
            statusLabel.setText("Invalid incident type.");
            return;
            String incidentId = "INC-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
            String submissionTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));


            IncidentIdLabel.setText("Submitted. Incident ID: " + incidentId + " at " + submissionTime);
            statusLabel.setText("");
            clearForm();