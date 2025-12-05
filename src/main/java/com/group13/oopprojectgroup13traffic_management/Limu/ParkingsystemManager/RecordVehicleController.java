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

public class RecordVehicleController {

    @FXML
    private TableColumn<RecordVehicle, String> contactNumberColumn;

    @FXML
    private TextField contactNumberTextField;

    @FXML
    private TableColumn<RecordVehicle, LocalDate> dateColumn;

    @FXML
    private DatePicker datepicker;

    @FXML
    private TableView<RecordVehicle> tableview;

    @FXML
    private TableColumn<RecordVehicle, Integer> vehicaleNumberCOlumn;

    @FXML
    private TextField vehicaleNumberTextField;

    @FXML
    private TableColumn<RecordVehicle, String> vehicaleTypeColumn;

    @FXML
    private ComboBox<String> vehicleTypeCombobox;

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
    public void initialize(){
        vehicleTypeCombobox.getItems().addAll("Car","Bike","EV","Truck");
        vehicaleTypeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        vehicaleNumberCOlumn.setCellValueFactory(new PropertyValueFactory<>("vehicleNumber"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        contactNumberColumn.setCellValueFactory(new PropertyValueFactory<>("contact"));


    }

    @FXML
    void recordButton(ActionEvent event) {
        tableview.getItems().clear();
        int carnumber=Integer.parseInt(vehicaleNumberTextField.getText());
        String type=vehicleTypeCombobox.getValue();
        String contact=contactNumberTextField.getText();
        LocalDate date=datepicker.getValue();
        File f= null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            f=new File("RecordVehicle.bin");
            if(f.exists()){
                fos=new FileOutputStream(f,true);
                oos=new AppendableObjectOutPutStream(fos);
            }
            else{
                fos=new FileOutputStream(f);
                oos=new ObjectOutputStream(fos);
            }
            RecordVehicle y=new RecordVehicle(carnumber,type,contact,date);
            tableview.getItems().add(y);

            oos.writeObject(y);

        }catch(IOException ex){
            Logger.getLogger(RecordVehicleController.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                if(oos!=null){
                    oos.close();
                }
            }catch(IOException ex){
                Logger.getLogger(RecordVehicleController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }

    @FXML
    void showallButton(ActionEvent event) {
        tableview.getItems().clear();
        ObjectInputStream ois = null;
        try {
            RecordVehicle y;
            ois = new ObjectInputStream(new FileInputStream("RecordVehicle.bin"));
            while (true) {
                y = (RecordVehicle) ois.readObject();
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
