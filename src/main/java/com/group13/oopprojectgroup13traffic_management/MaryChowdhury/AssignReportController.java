package com.group13.oopprojectgroup13traffic_management.MaryChowdhury;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class AssignReportController{
    @FXML public ComboBox<String> reportSelector;
    @FXML public ComboBox<String> officerSelector;
    @FXML public Label reportInfo;
    @FXML public Label assignStatus;

    public ComboBox<String> getReportSelector() {
        return reportSelector;
    }

    public void setReportSelector(ComboBox<String> reportSelector) {
        this.reportSelector = reportSelector;
    }

    public ComboBox<String> getOfficerSelector() {
        return officerSelector;
    }

    public void setOfficerSelector(ComboBox<String> officerSelector) {
        this.officerSelector = officerSelector;
    }

    public Label getReportInfo() {
        return reportInfo;
    }

    public void setReportInfo(Label reportInfo) {
        this.reportInfo = reportInfo;
    }

    public Label getAssignStatus() {
        return assignStatus;
    }

    public void setAssignStatus(Label assignStatus) {
        this.assignStatus = assignStatus;
    }

    @Override
    public String toString() {
        return STR."AssignReportController{reportSelector=\{reportSelector}, officerSelector=\{officerSelector}, reportInfo=\{reportInfo}, assignStatus=\{assignStatus}}";
    }

    public AssignReportController(ComboBox<String> reportSelector, ComboBox<String> officerSelector, Label reportInfo, Label assignStatus) {
        this.reportSelector = reportSelector;
        this.officerSelector = officerSelector;
        this.reportInfo = reportInfo;
        this.assignStatus = assignStatus;

    }

    @javafx.fxml.FXML
    public void initialize() {
        reportSelector.setItems(FXCollections.observableArrayList("INC-AAA1","INC-BBB2"));
        officerSelector.setItems(FXCollections.observableArrayList("officer.jones","officer.lee","officer.patel"));
        reportSelector.setOnAction(e -> reportInfo.setText(STR."Selected: \{reportSelector.getValue()}"));
    }

    @javafx.fxml.FXML
    public void oaAssign(ActionEvent actionEvent) {
        String report = reportSelector.getValue();
        String officer = officerSelector.getValue();
        if (report==null || officer==null) {
            assignStatus.setText("Select report and officer.");
            return;
        }
        // TODO: verify officer active and jurisdiction
        // TODO: persist assignment and notify
        assignStatus.setText(STR."Assigned \{report} to \{officer}");
    }
    }