package com.group13.oopprojectgroup13traffic_management.Limu.policymaker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class PolicyMakerDAshboardControlller {

    @FXML
    void createpolicyButton(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/group13/oopprojectgroup13traffic_management/limu/policymaker/createTransportsPolicy.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("ManageDonation");
        window.setScene(scene2);
        window.show();
    }


    @FXML
    public void publicpublishAnnounceButton(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/group13/oopprojectgroup13traffic_management/limu/policymaker/manageFeedback.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("ManageDonation");
        window.setScene(scene2);
        window.show();
    }

    @FXML
    public void reviewreportButton(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/group13/oopprojectgroup13traffic_management/limu/policymaker/publicPublishannouncement.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("ManageDonation");
        window.setScene(scene2);
        window.show();
    }

    @FXML
    public void managefeedbackButton(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/group13/oopprojectgroup13traffic_management/limu/policymaker/reviewReportPandTra.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("ManageDonation");
        window.setScene(scene2);
        window.show();
    }
}
