package com.group13.oopprojectgroup13traffic_management.Limu.ParkingsystemManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AddNewParkingAreaControlller {

    @FXML
    private TextField areaLocatiionTextfield;

    @FXML
    private TableColumn<AddParking, String> arealocationColumn;

    @FXML
    private TableColumn<AddParking, LocalDate> dateColumn;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TextField parkingAreaNAmeTextField;

    @FXML
    private TableColumn<AddParking, String> parkingAreaNameColumn;

    @FXML
    private TableColumn<AddParking, String> parkingTypeColumn;

    @FXML
    private ComboBox<String> parkingTypeCombobox;

    @FXML
    private TableView<AddParking> tableview;

    @javafx.fxml.FXML
    public void initialize() {
        parkingTypeCombobox.getItems().addAll("Indoor","Outdoor","Multi-level");
        parkingTypeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        parkingAreaNameColumn.setCellValueFactory(new PropertyValueFactory<>("arenamel"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        arealocationColumn.setCellValueFactory(new PropertyValueFactory<>("location"));

    }

    @FXML
    void addParkingButton(ActionEvent event) {
        tableview.getItems().clear();
        String areaName=parkingAreaNAmeTextField.getText();
        String location=areaLocatiionTextfield.getText();
        LocalDate date=datePicker.getValue();
        String type=parkingTypeCombobox.getValue();
        File f= null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            f=new File("AddParking.bin");
            if(f.exists()){
                fos=new FileOutputStream(f,true);
                oos=new AppendableObjectOutPutStream(fos);
            }
            else{
                fos=new FileOutputStream(f);
                oos=new ObjectOutputStream(fos);
            }
            AddParking y=new AddParking(areaName,location,type,date);
            tableview.getItems().add(y);

            oos.writeObject(y);

        }catch(IOException ex){
            Logger.getLogger(AddNewParkingAreaControlller.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                if(oos!=null){
                    oos.close();
                }
            }catch(IOException ex){
                Logger.getLogger(AddNewParkingAreaControlller.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    void backButton(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/group13/oopprojectgroup13traffic_management/limu/ParkingsystemManager/parkingSystemDashboard.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("Back");
        window.setScene(scene2);
        window.show();

    }

    @FXML
    void showallDetailsButton(ActionEvent event) {
        tableview.getItems().clear();
        ObjectInputStream ois = null;
        try {
            AddParking y;
            ois = new ObjectInputStream(new FileInputStream("AddParking.bin"));
            while (true) {
                y = (AddParking) ois.readObject();
                tableview.getItems().add(y);
            }
        } catch (Exception ex) {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ex2) {
                ex2.printStackTrace();
            }
            ex.printStackTrace();
        }


    }

}
