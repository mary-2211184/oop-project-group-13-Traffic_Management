package com.group13.oopprojectgroup13traffic_management.MaryChowdhury;

//import com.sun.javafx.collections.ElementObservableListDecorator;
//import com.sun.javafx.collections.ObservableListWrapper;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class IncidentReportFormController {
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
    private Object submissionTime;

    public IncidentReportFormController(TextField locationField, TextArea descriptionArea, TextField timeField, DatePicker datePicker, Label incidentIdLabel, ComboBox typeCombo, Label statusLabel) {
        this.locationField = locationField;
        this.descriptionArea = descriptionArea;
        this.timeField = timeField;
        this.datePicker = datePicker;
        IncidentIdLabel = incidentIdLabel;
        this.typeCombo = typeCombo;
        this.statusLabel = statusLabel;
    }

    public TextField getLocationField() {
        return locationField;
    }

    public void setLocationField(TextField locationField) {
        this.locationField = locationField;
    }

    public TextArea getDescriptionArea() {
        return descriptionArea;
    }

    public void setDescriptionArea(TextArea descriptionArea) {
        this.descriptionArea = descriptionArea;
    }

    public TextField getTimeField() {
        return timeField;
    }

    public void setTimeField(TextField timeField) {
        this.timeField = timeField;
    }

    public DatePicker getDatePicker() {
        return datePicker;
    }

    public void setDatePicker(DatePicker datePicker) {
        this.datePicker = datePicker;
    }

    public Label getIncidentIdLabel() {
        return IncidentIdLabel;
    }

    public void setIncidentIdLabel(Label incidentIdLabel) {
        IncidentIdLabel = incidentIdLabel;
    }

    public ComboBox getTypeCombo() {
        return typeCombo;
    }

    public void setTypeCombo(ComboBox typeCombo) {
        this.typeCombo = typeCombo;
    }

    public Label getStatusLabel() {
        return statusLabel;
    }

    public void setStatusLabel(Label statusLabel) {
        this.statusLabel = statusLabel;
    }

    @Override
    public String toString() {
        return STR."IncidentReportFormController{locationField=\{locationField}, descriptionArea=\{descriptionArea}, timeField=\{timeField}, datePicker=\{datePicker}, IncidentIdLabel=\{IncidentIdLabel}, typeCombo=\{typeCombo}, statusLabel=\{statusLabel}}";
    }

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
        String type = typeCombo.getValue().toString();
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

    }
}