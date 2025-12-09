package com.group13.oopprojectgroup13traffic_management.MaryChowdhury;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;

public class EditReportController
{
    @javafx.fxml.FXML
    private Label loadLabel;
    @javafx.fxml.FXML
    private TextField locationField;
    @javafx.fxml.FXML
    private ComboBox comboReportSelector;
    @javafx.fxml.FXML
    private ComboBox comboType;
    @javafx.fxml.FXML
    private TextField timeField;
    @javafx.fxml.FXML
    private TextArea descTextArea;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private Label resultLabel;

    public class editReportController {

        @FXML
        public ComboBox<String> reportSelector;
        @FXML
        public Label loadedLabel;
        @FXML
        public TextField locationField;
        @FXML
        public ComboBox<String> typeCombo;
        @FXML
        public DatePicker datePicker;
        @FXML
        public TextField timeField;
        @FXML
        public TextArea descriptionArea;
        @FXML
        public Label resultLabel;

        private ObservableList<String> reportIds = FXCollections.observableArrayList("INC-AAA1", "INC-BBB2");
        private ObservableList<String> types = FXCollections.observableArrayList("Accident", "Obstruction", "Violation", "Other");


        @javafx.fxml.FXML
        public void initialize() {
            comboReportSelector.setItems(reportIds);
            comboType.setItems(types);

            // Set default selected values (optional)
            if (!reportIds.isEmpty()) {
                comboReportSelector.getSelectionModel().selectFirst();
            }
            if (!types.isEmpty()) {
                comboType.getSelectionModel().selectFirst();
            }

            // Set today's date in the DatePicker
            datePicker.setValue(LocalDate.now());

            // Optional: initial text
            loadLabel.setText("Select a report to edit.");
            resultLabel.setText("");

            comboReportSelector.getItems().addAll("INC-AAA1", "INC-BBB2");
            comboType.getItems().addAll("Accident", "Obstruction", "Violation", "Other");

        }
    }

    @javafx.fxml.FXML
    public void onSaveChanges(ActionEvent actionEvent) {
        if (locationField.getText() == null || locationField.getText().isBlank()) {
            resultLabel.setText("Location required.");
            return;
        }

        if (comboReportSelector.getValue() == null) {
            resultLabel.setText("Please select a report ID.");
            return;
        }

        if (comboType.getValue() == null) {
            resultLabel.setText("Please select a report type.");
            return;
        }

        if (datePicker.getValue() == null) {
            resultLabel.setText("Please select a date.");
            return;
        }

        if (timeField.getText() == null || timeField.getText().isBlank()) {
            resultLabel.setText("Time required.");
            return;
        }

        // Grab all values
        String reportId   = comboReportSelector.getId();
        String type       = comboType.getId();
        String location   = locationField.getText();
        LocalDate date    = datePicker.getValue();
        String time       = timeField.getText();
        String desc       = descTextArea.getText();

        // TODO: persist update to DB here
        System.out.println("Saving report:");
        System.out.println(STR."ID: \{reportId}");
        System.out.println(STR."Type: \{type}");
        System.out.println(STR."Location: \{location}");
        System.out.println(STR."Date: \{date}");
        System.out.println(STR."Time: \{time}");
        System.out.println(STR."Description: \{desc}");

        resultLabel.setText("Report updated successfully.");
    }
}