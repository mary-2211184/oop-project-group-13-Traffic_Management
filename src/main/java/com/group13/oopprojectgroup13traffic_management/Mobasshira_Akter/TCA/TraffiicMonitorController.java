package com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.TCA;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

//import ...

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;



public class TrafficMonitorController
{
    @javafx.fxml.FXML
    private TableColumn tmtvvcTC;
    @javafx.fxml.FXML
    private TableColumn tmtvDTC;
    @javafx.fxml.FXML
    private TableColumn tmtvtTC;
    @javafx.fxml.FXML
    private TableColumn tmtvATC;
    @javafx.fxml.FXML
    private ComboBox afCB;
    @javafx.fxml.FXML
    private TableColumn tmtvclTC;
    @javafx.fxml.FXML
    private TableView tmTV;

    public void rbOA(ActionEvent actionEvent) {}

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML

    public void rbOA(ActionEvent actionEvent){
            try {
                // Load the Traffic_Monitor.fxml file
                FXMLLoader loader = new FXMLLoader(TrafficMonitorController.class.getResource("Traffic_Monitor.fxml"));
                Parent root = loader.load();

                // Get the current stage from the action event
                Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

                // Create new scene and set it on the stage
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setTitle("Traffic_Monitor");
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
                // Handle the exception appropriately (show error message, etc.)
                //}
            }

            private URL getResource (String);
            {
                return null;
            }
        }




    //public void rbOA(ActionEvent actionEvent) {
     //   Parent root = null;
    //    FXMLLoader fxmlLoader = new FXMLLoader()



    }
}