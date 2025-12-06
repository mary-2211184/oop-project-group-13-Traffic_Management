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

public class UpdateParkingslotController {

    @FXML
    private TableColumn<UpdateParking, LocalDate> datePickerColumn;

    @FXML
    private DatePicker datepicker;

    @FXML
    private TextField enterSlotTExtField;

    @FXML
    private TableColumn<UpdateParking, Integer> enterSlotiDColumn;

    @FXML
    private TableColumn<UpdateParking, String> selectAreaColumn;

    @FXML
    private TextField selectAreaTextField;

    @FXML
    private TableColumn<UpdateParking, String> solotstatusColumn;

    @FXML
    private ComboBox<String> statusCombobox;

    @FXML
    private TableView<UpdateParking> tableview;

    @javafx.fxml.FXML
    public void initialize() {
        statusCombobox.getItems().addAll("Available","Occupied","Reserved","Maintenance");
        solotstatusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        selectAreaColumn.setCellValueFactory(new PropertyValueFactory<>("selectArea"));
        enterSlotiDColumn.setCellValueFactory(new PropertyValueFactory<>("slotID"));
        datePickerColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

    }

    @FXML
    void backbutton(ActionEvent event) throws IOException{
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/group13/oopprojectgroup13traffic_management/limu/ParkingsystemManager/parkingSystemDashboard.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("Back");
        window.setScene(scene2);
        window.show();



    }

    @FXML
    void showallbutton(ActionEvent event) {
        tableview.getItems().clear();
        ObjectInputStream ois = null;
        try {
            UpdateParking y;
            ois = new ObjectInputStream(new FileInputStream("UpdateParking.bin"));
            while (true) {
                y = (UpdateParking) ois.readObject();
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

    @FXML
    void updateButton(ActionEvent event) {
        tableview.getItems().clear();
        String status=statusCombobox.getValue();
        int slotId=Integer.parseInt(enterSlotTExtField.getText());
        String area=selectAreaTextField.getText();
        LocalDate date=datepicker.getValue();
        File f= null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            f=new File("UpdateParking.bin");
            if(f.exists()){
                fos=new FileOutputStream(f,true);
                oos=new AppendableObjectOutPutStream(fos);
            }
            else{
                fos=new FileOutputStream(f);
                oos=new ObjectOutputStream(fos);
            }
            UpdateParking y=new UpdateParking(status,slotId,area,date);
            tableview.getItems().add(y);

            oos.writeObject(y);

        }catch(IOException ex){
            Logger.getLogger(UpdateParkingslotController.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                if(oos!=null){
                    oos.close();
                }
            }catch(IOException ex){
                Logger.getLogger(UpdateParkingslotController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
