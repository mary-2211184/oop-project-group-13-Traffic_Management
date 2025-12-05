package com.group13.oopprojectgroup13traffic_management.MaryChowdhury;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class UpdateStatusController{
    @FXML
    public ComboBox<String> reportSelector;
    @FXML public Label currentStatusLabel;
    @FXML public ComboBox<String> statusCombo;
    @FXML public Label resultLabel;

    private ObservableList<String> statusOptions = FXCollections.observableArrayList("New","In Progress","Resolved","Closed");

    public ComboBox<String> getReportSelector() {
        return reportSelector;
    }

    public void setReportSelector(ComboBox<String> reportSelector) {
        this.reportSelector = reportSelector;
    }

    public Label getCurrentStatusLabel() {
        return currentStatusLabel;
    }

    public void setCurrentStatusLabel(Label currentStatusLabel) {
        this.currentStatusLabel = currentStatusLabel;
    }

    public ComboBox<String> getStatusCombo() {
        return statusCombo;
    }

    public void setStatusCombo(ComboBox<String> statusCombo) {
        this.statusCombo = statusCombo;
    }

    public Label getResultLabel() {
        return resultLabel;
    }

    public void setResultLabel(Label resultLabel) {
        this.resultLabel = resultLabel;
    }

    public ObservableList<String> getStatusOptions() {
        return statusOptions;
    }

    public void setStatusOptions(ObservableList<String> statusOptions) {
        this.statusOptions = statusOptions;
    }

    @Override
    public String toString() {
        return STR."UpdateStatusController{reportSelector=\{reportSelector}, currentStatusLabel=\{currentStatusLabel}, statusCombo=\{statusCombo}, resultLabel=\{resultLabel}, statusOptions=\{statusOptions}}";
    }

    public UpdateStatusController(ComboBox<String> reportSelector, Label currentStatusLabel, ComboBox<String> statusCombo, Label resultLabel, ObservableList<String> statusOptions) {
        this.reportSelector = reportSelector;
        this.currentStatusLabel = currentStatusLabel;
        this.statusCombo = statusCombo;
        this.resultLabel = resultLabel;
        this.statusOptions = statusOptions;


    }

    @FXML
    public void initialize() {
        reportSelector.setItems(FXCollections.observableArrayList("INC-AAA1","INC-BBB2"));
        statusCombo.setItems(statusOptions);
        reportSelector.setOnAction(e -> initialize());
    }

    @javafx.fxml.FXML
    public void oaChangeStatus(ActionEvent actionEvent) {
        String id = reportSelector.getValue();
        String newStatus = statusCombo.getValue();
        if (id==null || newStatus==null) {
            resultLabel.setText("Select report and new status.");
            return;
        }
        // TODO: validate allowed transition
        // TODO: persist change and log
        resultLabel.setText(STR."Status updated for \{id} -> \{newStatus}");
    }
    }