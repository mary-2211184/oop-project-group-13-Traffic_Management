package com.group13.oopprojectgroup13traffic_management.MaryChowdhury;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class AccessEvidenceController{
    public ComboBox<String> reportSelector;
    public ListView<String> evidenceList;
    public Label evidenceStatus;

    private ObservableList<String> items = FXCollections.observableArrayList();

    public ComboBox<String> getReportSelector() {
        return reportSelector;
    }

    public void setReportSelector(ComboBox<String> reportSelector) {
        this.reportSelector = reportSelector;
    }

    public ListView<String> getEvidenceList() {
        return evidenceList;
    }

    public void setEvidenceList(ListView<String> evidenceList) {
        this.evidenceList = evidenceList;
    }

    public Label getEvidenceStatus() {
        return evidenceStatus;
    }

    public void setEvidenceStatus(Label evidenceStatus) {
        this.evidenceStatus = evidenceStatus;
    }

    public ObservableList<String> getItems() {
        return items;
    }

    public void setItems(ObservableList<String> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return STR."AccessEvidenceController{reportSelector=\{reportSelector}, evidenceList=\{evidenceList}, evidenceStatus=\{evidenceStatus}, items=\{items}}";
    }

    public AccessEvidenceController(ComboBox<String> reportSelector, ListView<String> evidenceList, Label evidenceStatus, ObservableList<String> items) {
        this.reportSelector = reportSelector;
        this.evidenceList = evidenceList;
        this.evidenceStatus = evidenceStatus;
        this.items = items;


    }

    @javafx.fxml.FXML
    public void initialize() {
        reportSelector.setItems(FXCollections.observableArrayList("INC-AAA1","INC-BBB2"));
        evidenceList.setItems(items);
    }

    @javafx.fxml.FXML
    public void oaDownload(ActionEvent actionEvent) {
        String sel = evidenceList.getSelectionModel().getSelectedItem();
        if (sel==null) { evidenceStatus.setText("Select file."); return; }
        // TODO: download
        evidenceStatus.setText(STR."Downloaded \{sel}");
    }


    @javafx.fxml.FXML
    public void oaViewSelected(ActionEvent actionEvent) {
        String sel = evidenceList.getSelectionModel().getSelectedItem();
        if (sel==null) { evidenceStatus.setText("Select file."); return; }
        // TODO: open embedded viewer (ImageView / MediaView)
        evidenceStatus.setText(STR."Opening viewer for \{sel}");
    }

    @javafx.fxml.FXML
    public void oaLoadEvidence(ActionEvent actionEvent) {
        String id = reportSelector.getValue();
        if (id==null) { evidenceStatus.setText("Select report."); return; }
        // TODO: fetch evidence file list from server
        items.clear();
        items.addAll("photo1.jpg","video1.mp4"); // placeholder
        evidenceStatus.setText(STR."Loaded evidence for \{id}");
    }
}