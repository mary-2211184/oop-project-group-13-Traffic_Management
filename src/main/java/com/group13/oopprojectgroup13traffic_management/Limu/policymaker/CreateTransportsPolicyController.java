package com.group13.oopprojectgroup13traffic_management.Limu.policymaker;

import com.group13.oopprojectgroup13traffic_management.Limu.ParkingsystemManager.AppendableObjectOutPutStream;
import com.group13.oopprojectgroup13traffic_management.Limu.ParkingsystemManager.ParkingFees;
import com.group13.oopprojectgroup13traffic_management.Limu.ParkingsystemManager.RecordVehicle;
import com.group13.oopprojectgroup13traffic_management.Limu.ParkingsystemManager.RecordVehicleController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateTransportsPolicyController {

    @FXML
    private TableColumn<CreatetransportPolicy, LocalDate> dateColumn;

    @FXML
    private DatePicker datePicker;

    @FXML
    private TextField policyDescriptionTextfield;

    @FXML
    private TableColumn<CreatetransportPolicy, String> policyDesriptionColumn;

    @FXML
    private TextField policyTitleTextField;

    @FXML
    private TableColumn<CreatetransportPolicy, String> policycategoryColumn;

    @FXML
    private TableColumn<CreatetransportPolicy, String> policytitleColumn;

    @FXML
    private TableView<CreatetransportPolicy> tableview;
    @FXML
    private ComboBox<String> categoryCombobox;

    @FXML
    public void initialize(){
        categoryCombobox.getItems().addAll("Traffic","Parking", "Safety");
        policytitleColumn.setCellValueFactory(new PropertyValueFactory<>("policyTitle"));
        policycategoryColumn.setCellValueFactory(new PropertyValueFactory<>("category"));
        policyDesriptionColumn.setCellValueFactory(new PropertyValueFactory<>("des"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));

    }

    @FXML
    void addPolicyButton(ActionEvent event) {
        String polTitle=policyTitleTextField.getText();
        String des=policyDescriptionTextfield.getText();
        LocalDate date=datePicker.getValue();
        String category=categoryCombobox.getValue();
        File f= null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            f=new File("CreatePolicy.bin");
            if(f.exists()){
                fos=new FileOutputStream(f,true);
                oos=new AppendableObjectOutPutStream(fos);
            }
            else{
                fos=new FileOutputStream(f);
                oos=new ObjectOutputStream(fos);
            }
            CreatetransportPolicy y=new CreatetransportPolicy(polTitle,des,category,date);
            tableview.getItems().add(y);

            oos.writeObject(y);

        }catch(IOException ex){
            Logger.getLogger(CreateTransportsPolicyController.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                if(oos!=null){
                    oos.close();
                }
            }catch(IOException ex){
                Logger.getLogger(CreateTransportsPolicyController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    @FXML
    void backButton(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/group13/oopprojectgroup13traffic_management/limu/policymaker/policyMakerDAshboard.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("ManageDonation");
        window.setScene(scene2);
        window.show();

    }

    @FXML
    void showallPolicy(ActionEvent event) {
        tableview.getItems().clear();
        ObjectInputStream ois = null;
        try {
            CreatetransportPolicy y;
            ois = new ObjectInputStream(new FileInputStream("CreatePolicy.bin"));
            while (true) {
                y = (CreatetransportPolicy) ois.readObject();
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
