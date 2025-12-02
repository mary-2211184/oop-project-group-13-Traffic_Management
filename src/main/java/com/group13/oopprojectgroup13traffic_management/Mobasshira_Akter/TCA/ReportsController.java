package com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.TCA;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ReportsController
{
    @javafx.fxml.FXML
    private ComboBox selectReportTypeCB;
    @javafx.fxml.FXML
    private TableView reportsTV;
    @javafx.fxml.FXML
    private DatePicker dpLDD;
    @javafx.fxml.FXML
    private TableColumn reportsLocationTC;
    @javafx.fxml.FXML
    private TableColumn reportsIncidentsTC;
    @javafx.fxml.FXML
    private TableColumn reportsDateTC;
    @javafx.fxml.FXML
    private TableColumn reportsCongestionLevelTC;
    @javafx.fxml.FXML
    private DatePicker dpLD;
    @javafx.fxml.FXML
    private TableColumn reportsTrafficDencityTC;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void filterOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exportaspdfOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generatereportOA(ActionEvent actionEvent) {
    }
}