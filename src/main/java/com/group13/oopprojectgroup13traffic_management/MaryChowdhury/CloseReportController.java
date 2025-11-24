package com.group13.oopprojectgroup13traffic_management.MaryChowdhury;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CloseReportController{
    @FXML public ComboBox<String> reportSelector;
    @FXML public Label statusLabel;
    @FXML public TextArea closingNotes;
    @FXML public Label resultLabel;

    public ComboBox<String> getReportSelector() {
        return reportSelector;
    }

    public void setReportSelector(ComboBox<String> reportSelector) {
        this.reportSelector = reportSelector;
    }

    public Label getStatusLabel() {
        return statusLabel;
    }

    public void setStatusLabel(Label statusLabel) {
        this.statusLabel = statusLabel;
    }

    public TextArea getClosingNotes() {
        return closingNotes;
    }

    public void setClosingNotes(TextArea closingNotes) {
        this.closingNotes = closingNotes;
    }

    public Label getResultLabel() {
        return resultLabel;
    }

    public void setResultLabel(Label resultLabel) {
        this.resultLabel = resultLabel;
    }

    @Override
    public String toString() {
        return STR."CloseReportController{reportSelector=\{reportSelector}, statusLabel=\{statusLabel}, closingNotes=\{closingNotes}, resultLabel=\{resultLabel}}";
    }

    public CloseReportController(ComboBox<String> reportSelector, Label statusLabel, TextArea closingNotes, Label resultLabel) {
        this.reportSelector = reportSelector;
        this.statusLabel = statusLabel;
        this.closingNotes = closingNotes;
        this.resultLabel = resultLabel;


    }

    @javafx.fxml.FXML
    public void initialize() {
        reportSelector.setItems(FXCollections.observableArrayList("INC-AAA1","INC-BBB2"));
        reportSelector.setOnAction(e -> loadStatus());
    }

    private void loadStatus() {
        String id = reportSelector.getValue();
        if (id==null) { statusLabel.setText(""); return; }
        // TODO: fetch status
        statusLabel.setText("Current: Resolved");
    }

    @javafx.fxml.FXML
    public void oaMarkClosed(ActionEvent actionEvent) {
        String id = reportSelector.getValue();
        if (id==null) { resultLabel.setText("Select report."); return; }
        // TODO: verify resolved and perform final checks
        String notes = closingNotes.getText();
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        // TODO: persist closed state, store notes and timestamp
        resultLabel.setText(STR."Report \{id} closed at \{timestamp}");
        closingNotes.clear();

    }
}