package com.group13.oopprojectgroup13traffic_management.Limu.ParkingsystemManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParkingFeesController {

    @FXML
    private TableColumn<ParkingFees, String> daliyChargeColumn;

    @FXML
    private TextField feePerHourTextField;

    @FXML
    private TextField maximumddalyChargeTextField;

    @FXML
    private TableColumn<ParkingFees, Integer> perhoursColumn;

    @FXML
    private TableColumn<ParkingFees, String> pricingModeColumn;

    @FXML
    private TextField pricingModetextField;

    @FXML
    private TableView<ParkingFees> tableview;

    @FXML
    private TableColumn<ParkingFees, String> vehicaleTypeColumn;

    @FXML
    private ComboBox<String> vehicleTypecombobox;

    @FXML
    public void initialize(){
        vehicleTypecombobox.getItems().addAll("Car","Bike","EV","Truck");
        vehicaleTypeColumn.setCellValueFactory(new PropertyValueFactory<>("vehicleType"));
        pricingModeColumn.setCellValueFactory(new PropertyValueFactory<>("mode"));
        daliyChargeColumn.setCellValueFactory(new PropertyValueFactory<>("dailyCharge"));
        perhoursColumn.setCellValueFactory(new PropertyValueFactory<>("hours"));

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
    void parkingFeesButton(ActionEvent event) {
        tableview.getItems().clear();
        String vehicleType=vehicleTypecombobox.getValue();
        int hour=Integer.parseInt(feePerHourTextField.getText());
        String mode=pricingModetextField.getText();
        String max=maximumddalyChargeTextField.getText();
        File f= null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            f=new File("ParkingsFees.bin");
            if(f.exists()){
                fos=new FileOutputStream(f,true);
                oos=new AppendableObjectOutPutStream(fos);
            }
            else{
                fos=new FileOutputStream(f);
                oos=new ObjectOutputStream(fos);
            }
            ParkingFees y=new ParkingFees(vehicleType,hour,mode,max);
            tableview.getItems().add(y);

            oos.writeObject(y);

        }catch(IOException ex){
            Logger.getLogger(ParkingFeesController.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                if(oos!=null){
                    oos.close();
                }
            }catch(IOException ex){
                Logger.getLogger(ParkingFeesController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @FXML
    void shoeAllPArking(ActionEvent event) {
        tableview.getItems().clear();
        ObjectInputStream ois = null;
        try {
            ParkingFees y;
            ois = new ObjectInputStream(new FileInputStream("ParkingsFees.bin"));
            while (true) {
                y = (ParkingFees) ois.readObject();
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
