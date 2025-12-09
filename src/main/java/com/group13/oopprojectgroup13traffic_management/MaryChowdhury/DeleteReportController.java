package com.group13.oopprojectgroup13traffic_management.MaryChowdhury;//import com.sun.glass.ui.Clipboard;
//import com.sun.glass.ui.ClipboardAssistance;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.text.BreakIterator;

public class DeleteReportController {
    @FXML
    private TableColumn colTime;
    @FXML
    private Label deleteStatusLabel;
    @FXML
    private TableView tableView;
    @FXML
    private TableColumn colDate;
    @FXML
    private TableColumn colId;
    @FXML
    private TableColumn colStatus;

//    private ObservableList<ReportRow> data = FXCollections.observableArrayList();

    public TableColumn getColTime() {
        return colTime;
    }

    public void setColTime(TableColumn colTime) {
        this.colTime = colTime;
    }

    public Label getDeleteStatusLabel() {
        return deleteStatusLabel;
    }

    public void setDeleteStatusLabel(Label deleteStatusLabel) {
        this.deleteStatusLabel = deleteStatusLabel;
    }

    public TableView getTableView() {
        return tableView;
    }

    public void setTableView(TableView tableView) {
        this.tableView = tableView;
    }

    public TableColumn getColDate() {
        return colDate;
    }

    public void setColDate(TableColumn colDate) {
        this.colDate = colDate;
    }

    public TableColumn getColId() {
        return colId;
    }

    public void setColId(TableColumn colId) {
        this.colId = colId;
    }

    public TableColumn getColStatus() {
        return colStatus;
    }

    public void setColStatus(TableColumn colStatus) {
        this.colStatus = colStatus;
    }


    public DeleteReportController(TableColumn colTime, Label deleteStatusLabel, TableView tableView, TableColumn colDate, TableColumn colId, TableColumn colStatus, ObservableList<ReportRow> data) {
        this.colTime = colTime;
        this.deleteStatusLabel = deleteStatusLabel;
        this.tableView = tableView;
        this.colDate = colDate;
        this.colId = colId;
        this.colStatus = colStatus;
//        this.data = data;


    }

    @FXML
    public void initialize() {
        colId.setCellValueFactory(c -> new SimpleStringProperty(c.getClass().descriptorString()));
        colDate.setCellValueFactory(c -> new SimpleStringProperty(c.getClass().toGenericString()));
        colStatus.setCellValueFactory(c -> new SimpleStringProperty(c.getClass().toGenericString()));
        colStatus.setCellValueFactory(c -> new SimpleStringProperty(c.getClass().toGenericString()));
    }
}