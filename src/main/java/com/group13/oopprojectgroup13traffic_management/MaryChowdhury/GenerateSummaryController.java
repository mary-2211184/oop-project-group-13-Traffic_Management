package com.group13.oopprojectgroup13traffic_management.MaryChowdhury;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.time.LocalDate;


public class GenerateSummaryController
{
    @FXML
    private Label generateStatusLabel;
    @FXML
    private DatePicker fromDatePicker;
    @FXML
    private ComboBox typeComboBox;
    @FXML
    private TableView metricTableView;
    @FXML
    private DatePicker toDatePicker;
    @FXML
    private TableColumn colMetric;
    @FXML
    private TableColumn colValue;

    public Label getGenerateStatusLabel() {
        return generateStatusLabel;
    }

    public void setGenerateStatusLabel(Label generateStatusLabel) {
        this.generateStatusLabel = generateStatusLabel;
    }

    public DatePicker getFromDatePicker() {
        return fromDatePicker;
    }

    public void setFromDatePicker(DatePicker fromDatePicker) {
        this.fromDatePicker = fromDatePicker;
    }

    public ComboBox getTypeComboBox() {
        return typeComboBox;
    }

    public void setTypeComboBox(ComboBox typeComboBox) {
        this.typeComboBox = typeComboBox;
    }

    public TableView getMetricTableView() {
        return metricTableView;
    }

    public void setMetricTableView(TableView metricTableView) {
        this.metricTableView = metricTableView;
    }

    public DatePicker getToDatePicker() {
        return toDatePicker;
    }

    public void setToDatePicker(DatePicker toDatePicker) {
        this.toDatePicker = toDatePicker;
    }

    public TableColumn getColMetric() {
        return colMetric;
    }

    public void setColMetric(TableColumn colMetric) {
        this.colMetric = colMetric;
    }

    public TableColumn getColValue() {
        return colValue;
    }

    public void setColValue(TableColumn colValue) {
        this.colValue = colValue;
    }

    @Override
    public String toString() {
        return STR."GenerateSummaryController{generateStatusLabel=\{generateStatusLabel}, fromDatePicker=\{fromDatePicker}, typeComboBox=\{typeComboBox}, metricTableView=\{metricTableView}, toDatePicker=\{toDatePicker}, colMetric=\{colMetric}, colValue=\{colValue}}";
    }

    public GenerateSummaryController(Label generateStatusLabel, DatePicker fromDatePicker, ComboBox typeComboBox, TableView metricTableView, DatePicker toDatePicker, TableColumn colMetric, TableColumn colValue) {
        this.generateStatusLabel = generateStatusLabel;
        this.fromDatePicker = fromDatePicker;
        this.typeComboBox = typeComboBox;
        this.metricTableView = metricTableView;
        this.toDatePicker = toDatePicker;
        this.colMetric = colMetric;
        this.colValue = colValue;


    }

    @FXML
    public void initialize() {
        ChoiceBox typeCombo = null;
        typeCombo.setItems(FXCollections.observableArrayList("All", "Accident", "Obstruction", "Violation"));
        typeCombo.setValue("All");
        Object metrics = null;
        metricTableView.getClass();
        colMetric.setCellValueFactory(c -> new SimpleStringProperty(c.getClass().toGenericString()));
        colValue.setCellValueFactory(c -> new SimpleStringProperty(c.getClass().toGenericString()));
    }

    @FXML
    public void oaGenerateSummary(ActionEvent actionEvent) {
        LocalDate f = fromDatePicker.getValue();
        LocalDate t = toDatePicker.getValue();
        if (f == null || t == null || f.isAfter(t)) {
            generateStatusLabel.setText("Invalid date range.");
            return;
        }
        String type = typeComboBox.getCellFactory().toString();


        generateStatusLabel.setText(STR."Summary generated for \{f} to \{t}");
    }

}
