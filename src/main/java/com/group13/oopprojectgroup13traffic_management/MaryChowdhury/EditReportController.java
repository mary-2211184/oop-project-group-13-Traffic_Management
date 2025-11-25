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
        @FXML public Label loadedLabel;
        @FXML public TextField locationField;
        @FXML public ComboBox<String> typeCombo;
        @FXML public DatePicker datePicker;
        @FXML public TextField timeField;
        @FXML public TextArea descriptionArea;
        @FXML public Label resultLabel;

        private ObservableList<String> reportIds = FXCollections.observableArrayList("INC-AAA1","INC-BBB2");
        private ObservableList<String> types = FXCollections.observableArrayList("Accident","Obstruction","Violation","Other");

        public editReportController(ComboBox<String> reportSelector, Label loadedLabel, TextField locationField, ComboBox<String> typeCombo, DatePicker datePicker, TextField timeField, TextArea descriptionArea, Label resultLabel, ObservableList<String> reportIds, ObservableList<String> types) {
            this.reportSelector = reportSelector;
            this.loadedLabel = loadedLabel;
            this.locationField = locationField;
            this.typeCombo = typeCombo;
            this.datePicker = datePicker;
            this.timeField = timeField;
            this.descriptionArea = descriptionArea;
            this.resultLabel = resultLabel;
            this.reportIds = reportIds;
            this.types = types;
        }

        public ComboBox<String> getReportSelector() {
            return reportSelector;
        }

        public void setReportSelector(ComboBox<String> reportSelector) {
            this.reportSelector = reportSelector;
        }

        public Label getLoadedLabel() {
            return loadedLabel;
        }

        public void setLoadedLabel(Label loadedLabel) {
            this.loadedLabel = loadedLabel;
        }

        public TextField getLocationField() {
            return locationField;
        }

        public void setLocationField(TextField locationField) {
            this.locationField = locationField;
        }

        public ComboBox<String> getTypeCombo() {
            return typeCombo;
        }

        public void setTypeCombo(ComboBox<String> typeCombo) {
            this.typeCombo = typeCombo;
        }

        public DatePicker getDatePicker() {
            return datePicker;
        }

        public void setDatePicker(DatePicker datePicker) {
            this.datePicker = datePicker;
        }

        public TextField getTimeField() {
            return timeField;
        }

        public void setTimeField(TextField timeField) {
            this.timeField = timeField;
        }

        public TextArea getDescriptionArea() {
            return descriptionArea;
        }

        public void setDescriptionArea(TextArea descriptionArea) {
            this.descriptionArea = descriptionArea;
        }

        public Label getResultLabel() {
            return resultLabel;
        }

        public void setResultLabel(Label resultLabel) {
            this.resultLabel = resultLabel;
        }

        public ObservableList<String> getReportIds() {
            return reportIds;
        }

        public void setReportIds(ObservableList<String> reportIds) {
            this.reportIds = reportIds;
        }

        public ObservableList<String> getTypes() {
            return types;
        }

        public void setTypes(ObservableList<String> types) {
            this.types = types;
        }

        @Override
        public String toString() {
            return STR."EditReportController{reportSelector=\{reportSelector}, loadedLabel=\{loadedLabel}, locationField=\{locationField}, typeCombo=\{typeCombo}, datePicker=\{datePicker}, timeField=\{timeField}, descriptionArea=\{descriptionArea}, resultLabel=\{resultLabel}, reportIds=\{reportIds}, types=\{types}}";
        }

        @javafx.fxml.FXML
    public void initialize() {
            reportSelector.setItems(reportIds);
            typeCombo.setItems(types);
            datePicker.setValue(LocalDate.now());
        }
    }

    @javafx.fxml.FXML
    public void onSaveChanges(ActionEvent actionEvent) {
        if (locationField.getText()==null || locationField.getText().isBlank()) {
            resultLabel.setText("Location required.");
            return;
        }
        // TODO: persist update to DB
        resultLabel.setText("Report updated successfully.");
    }
    }