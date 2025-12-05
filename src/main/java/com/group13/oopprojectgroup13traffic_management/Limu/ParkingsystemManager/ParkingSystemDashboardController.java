package com.group13.oopprojectgroup13traffic_management.Limu.ParkingsystemManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ParkingSystemDashboardController {

    @FXML
    void addParkingButrton(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/group13/oopprojectgroup13traffic_management/limu/ParkingsystemManager/addNewParkingArea.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("ManageDonation");
        window.setScene(scene2);
        window.show();

    }

    @FXML
    public void parkingslotbutton(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/group13/oopprojectgroup13traffic_management/limu/ParkingsystemManager/parkingFees.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("ManageDonation");
        window.setScene(scene2);
        window.show();
    }

    @FXML
    public void parkingfeesButton(ActionEvent event)  throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/group13/oopprojectgroup13traffic_management/limu/ParkingsystemManager/recordVehicle.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("ManageDonation");
        window.setScene(scene2);
        window.show();
    }

    @FXML
    public void recordVehicleButton(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/group13/oopprojectgroup13traffic_management/limu/ParkingsystemManager/updateParkingslot.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("ManageDonation");
        window.setScene(scene2);
        window.show();
    }
}
