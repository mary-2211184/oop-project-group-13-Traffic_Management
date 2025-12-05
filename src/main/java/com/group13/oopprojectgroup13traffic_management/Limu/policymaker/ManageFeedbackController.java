package com.group13.oopprojectgroup13traffic_management.Limu.policymaker;

import com.group13.oopprojectgroup13traffic_management.Limu.ParkingsystemManager.AppendableObjectOutPutStream;
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

public class ManageFeedbackController {

    @FXML
    private TableColumn<ManageFeedback, LocalDate> dateColumn;

    @FXML
    private DatePicker datepicker;

    @FXML
    private TableColumn<ManageFeedback, Integer> feedbackIdColumn;

    @FXML
    private TextField feedbackIdTextField;

    @FXML
    private TextField feedbackMessageTextField;

    @FXML
    private ComboBox<String> feedbackStatusCombobox;

    @FXML
    private TableColumn<ManageFeedback, String> feedbackmessageColumn;

    @FXML
    private TableColumn<ManageFeedback, String> feedbackstatusColumn;

    @FXML
    private TableView<ManageFeedback> tableview;

    @FXML
    public void initialize(){
        feedbackStatusCombobox.getItems().addAll("Resolved"," Pending"," In Progress");
        feedbackstatusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        feedbackmessageColumn.setCellValueFactory(new PropertyValueFactory<>("feedbackMessage"));
        feedbackIdColumn.setCellValueFactory(new PropertyValueFactory<>("fedId"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
    }

    @FXML
    void backbutton(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/group13/oopprojectgroup13traffic_management/limu/policymaker/policyMakerDAshboard.fxml")));
        Scene scene2 = new Scene(scene2Parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setTitle("ManageDonation");
        window.setScene(scene2);
        window.show();

    }

    @FXML
    void showAllfeedbackButton(ActionEvent event) {
        tableview.getItems().clear();
        ObjectInputStream ois = null;
        try {
            ManageFeedback y;
            ois = new ObjectInputStream(new FileInputStream("ManageFeedback.bin"));
            while (true) {
                y = (ManageFeedback) ois.readObject();
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
    void upadateallFeedbackButton(ActionEvent event) {
        tableview.getItems().clear();
        String message=feedbackMessageTextField.getText();
        int fedid=Integer.parseInt(feedbackIdTextField.getText());
        String status=feedbackStatusCombobox.getValue();
        LocalDate date=datepicker.getValue();
        File f= null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            f=new File("ManageFeedback.bin");
            if(f.exists()){
                fos=new FileOutputStream(f,true);
                oos=new AppendableObjectOutPutStream(fos);
            }
            else{
                fos=new FileOutputStream(f);
                oos=new ObjectOutputStream(fos);
            }
            ManageFeedback y=new ManageFeedback(message,status,fedid,date);
            tableview.getItems().add(y);

            oos.writeObject(y);

        }catch(IOException ex){
            Logger.getLogger(ManageFeedbackController.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                if(oos!=null){
                    oos.close();
                }
            }catch(IOException ex){
                Logger.getLogger(ManageFeedbackController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
