package com.group13.oopprojectgroup13traffic_management.MaryChowdhury;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MyReportsController
{
    @javafx.fxml.FXML
    private TableColumn colDesc;
    @javafx.fxml.FXML
    private TableColumn colType;
    @javafx.fxml.FXML
    private TableView tableView;
    @javafx.fxml.FXML
    private TableColumn colDate;
    @javafx.fxml.FXML
    private TableColumn colId;
    @javafx.fxml.FXML
    private TableColumn colStatus;

    public class myReportsController {

        @FXML
        public TableView<ReportRow> reportsTable;
        @FXML public TableColumn<ReportRow, String> colId;
        @FXML public TableColumn<ReportRow, String> colDate;
        @FXML public TableColumn<ReportRow, String> colType;
        @FXML public TableColumn<ReportRow, String> colStatus;
        @FXML public TableColumn<ReportRow, String> colDesc;

        private ObservableList<ReportRow> data = FXCollections.observableArrayList();

        public myReportsController(TableView<ReportRow> reportsTable, TableColumn<ReportRow, String> colId, TableColumn<ReportRow, String> colDate, TableColumn<ReportRow, String> colType, TableColumn<ReportRow, String> colStatus, TableColumn<ReportRow, String> colDesc, ObservableList<ReportRow> data) {
            this.reportsTable = reportsTable;
            this.colId = colId;
            this.colDate = colDate;
            this.colType = colType;
            this.colStatus = colStatus;
            this.colDesc = colDesc;
            this.data = data;
        }

        public TableView<ReportRow> getReportsTable() {
            return reportsTable;
        }

        public void setReportsTable(TableView<ReportRow> reportsTable) {
            this.reportsTable = reportsTable;
        }

        public TableColumn<ReportRow, String> getColId() {
            return colId;
        }

        public void setColId(TableColumn<ReportRow, String> colId) {
            this.colId = colId;
        }

        public TableColumn<ReportRow, String> getColDate() {
            return colDate;
        }

        public void setColDate(TableColumn<ReportRow, String> colDate) {
            this.colDate = colDate;
        }

        public TableColumn<ReportRow, String> getColType() {
            return colType;
        }

        public void setColType(TableColumn<ReportRow, String> colType) {
            this.colType = colType;
        }

        public TableColumn<ReportRow, String> getColStatus() {
            return colStatus;
        }

        public void setColStatus(TableColumn<ReportRow, String> colStatus) {
            this.colStatus = colStatus;
        }

        public TableColumn<ReportRow, String> getColDesc() {
            return colDesc;
        }

        public void setColDesc(TableColumn<ReportRow, String> colDesc) {
            this.colDesc = colDesc;
        }

        public ObservableList<ReportRow> getData() {
            return data;
        }

        public void setData(ObservableList<ReportRow> data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return STR."myReportsController{reportsTable=\{reportsTable}, colId=\{colId}, colDate=\{colDate}, colType=\{colType}, colStatus=\{colStatus}, colDesc=\{colDesc}, data=\{data}}";
        }

        @javafx.fxml.FXML
    public void initialize() {
            colId.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().id));
            colDate.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().date));
            colType.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().type));
            colStatus.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().status));
            colDesc.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().description));

            reportsTable.setItems(data);
            loadReports();
        }

        private void loadReports() {
            data.clear();
            // TODO: replace with DB fetch for the logged-in user
            data.addAll(
                    new ReportRow("INC-AAA1","2025-11-12","Accident","New","Minor collision at 5th St."),
                    new ReportRow("INC-BBB2","2025-11-13","Obstruction","In Progress","Fallen tree blocking lane")
            );
        }
        }

    @javafx.fxml.FXML
    public void onRefreshReports(ActionEvent actionEvent) {
        loadReports();
    }

    private void loadReports() {
    }

    public static class ReportRow {
        public String id, date, type, status, description;
        public ReportRow(String id, String date, String type, String status, String description){
            this.id=id;this.date=date;this.type=type;this.status=status;this.description=description;
        }
    }
    }