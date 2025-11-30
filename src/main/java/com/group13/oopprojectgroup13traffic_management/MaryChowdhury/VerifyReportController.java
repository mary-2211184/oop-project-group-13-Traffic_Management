package com.group13.oopprojectgroup13traffic_management.MaryChowdhury;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class VerifyReportController
{
    @FXML public TableView<MyReportsController.ReportRow> reportsTable;
    @FXML public TableColumn<MyReportsController.ReportRow, String> colId;
    @FXML public TableColumn<MyReportsController.ReportRow, String> colDate;
    @FXML public TableColumn<MyReportsController.ReportRow, String> colType;
    @FXML public TableColumn<MyReportsController.ReportRow,String> colReporter;
    @FXML public TableColumn<MyReportsController.ReportRow, String> colStatus;
    @FXML public Label verifyLabel;

    private ObservableList<MyReportsController.ReportRow> data = FXCollections.observableArrayList();

    public TableView<MyReportsController.ReportRow> getReportsTable() {
        return reportsTable;
    }

    public void setReportsTable(TableView<MyReportsController.ReportRow> reportsTable) {
        this.reportsTable = reportsTable;
    }

    public TableColumn<MyReportsController.ReportRow, String> getColId() {
        return colId;
    }

    public void setColId(TableColumn<MyReportsController.ReportRow, String> colId) {
        this.colId = colId;
    }

    public TableColumn<MyReportsController.ReportRow, String> getColDate() {
        return colDate;
    }

    public void setColDate(TableColumn<MyReportsController.ReportRow, String> colDate) {
        this.colDate = colDate;
    }

    public TableColumn<MyReportsController.ReportRow, String> getColType() {
        return colType;
    }

    public void setColType(TableColumn<MyReportsController.ReportRow, String> colType) {
        this.colType = colType;
    }

    public TableColumn<MyReportsController.ReportRow, String> getColReporter() {
        return colReporter;
    }

    public void setColReporter(TableColumn<MyReportsController.ReportRow, String> colReporter) {
        this.colReporter = colReporter;
    }

    public TableColumn<MyReportsController.ReportRow, String> getColStatus() {
        return colStatus;
    }

    public void setColStatus(TableColumn<MyReportsController.ReportRow, String> colStatus) {
        this.colStatus = colStatus;
    }

    public Label getVerifyLabel() {
        return verifyLabel;
    }

    public void setVerifyLabel(Label verifyLabel) {
        this.verifyLabel = verifyLabel;
    }

    public ObservableList<MyReportsController.ReportRow> getData() {
        return data;
    }

    public void setData(ObservableList<MyReportsController.ReportRow> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return STR."VerifyReportController{reportsTable=\{reportsTable}, colId=\{colId}, colDate=\{colDate}, colType=\{colType}, colReporter=\{colReporter}, colStatus=\{colStatus}, verifyLabel=\{verifyLabel}, data=\{data}}";
    }

    public VerifyReportController(TableView<MyReportsController.ReportRow> reportsTable, TableColumn<MyReportsController.ReportRow, String> colId, TableColumn<MyReportsController.ReportRow, String> colDate, TableColumn<MyReportsController.ReportRow, String> colType, TableColumn<MyReportsController.ReportRow, String> colReporter, TableColumn<MyReportsController.ReportRow, String> colStatus, Label verifyLabel, ObservableList<MyReportsController.ReportRow> data) {
        this.reportsTable = reportsTable;
        this.colId = colId;
        this.colType = colType;
        this.colReporter = colReporter;
        this.colStatus = colStatus;
        this.verifyLabel = verifyLabel;
        this.data = data;


    }

    @FXML
    public void initialize() {
        colId.setCellValueFactory(c -> new SimpleStringProperty((String) c.getValue().id));

        colReporter.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().toString()));
        colStatus.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().status));
        reportsTable.setItems(data);

        data.addAll(
                new MyReportsController.ReportRow("INC-AAA1","2025-11-12","Accident","john.doe","New"),
                new MyReportsController.ReportRow("INC-BBB2","2025-11-13","Obstruction","jane.smith","New")
        );
    }


    @FXML
    public void oaMarkValid(ActionEvent actionEvent) {
        MyReportsController.ReportRow sel = reportsTable.getSelectionModel().getSelectedItem();
        if (sel==null){ verifyLabel.setText("Select report."); return; }
        reportsTable.refresh();
        // TODO: persist verification result and timestamp
        verifyLabel.setText(STR."\{sel.toString()} marked Valid.");
    }

        MyReportsController.ReportRow value;
    }
//
//    private ObservableValue<String> call(TableColumn.CellDataFeatures<MyReportsController.ReportRow, String> c1) {
//        ObservableValue<String> call = call(c1);
//        return call;
//    }
//
//
//    @FXML
//    public void oaViewEvidence(ActionEvent actionEvent) {
//        ChoiceBox<Object> reportsTable = null;
//        MyReportsController.ReportRow sel = (MyReportsController.ReportRow) reportsTable.getSelectionModel().getSelectedItem();
//        BreakIterator verifyLabel = null;
//        if (sel==null) { verifyLabel.setText("Select a report."); return; }
//        // TODO: open evidence viewer and load files
//        verifyLabel.setText(STR."Open evidence for \{sel.id}");
//    }
//
//void main() {
//}