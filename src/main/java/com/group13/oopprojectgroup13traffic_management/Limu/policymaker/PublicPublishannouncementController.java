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

public class PublicPublishannouncementController {

    @FXML
    private TextField announceTitleColumn;

    @FXML
    private TableColumn<PublicPublishAnnouncement, String> announcetitleColumn;

    @FXML
    private TableColumn<PublicPublishAnnouncement, String> areaColumn;

    @FXML
    private ComboBox<String> areaCombobox;

    @FXML
    private DatePicker datepicker;

    @FXML
    private TableColumn<PublicPublishAnnouncement, String> messageColumn;

    @FXML
    private TextField messageTextField;

    @FXML
    private TableView<PublicPublishAnnouncement> tableview;
    @FXML
    private TableColumn<PublicPublishAnnouncement, LocalDate> DateColumn;

    @FXML
    public void initialize(){
        announcetitleColumn.setCellValueFactory(new PropertyValueFactory<>("annoTitlel"));
        DateColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        areaColumn.setCellValueFactory(new PropertyValueFactory<>("area"));
        messageColumn.setCellValueFactory(new PropertyValueFactory<>("message"));
        areaCombobox.getItems().addAll("Bashundhara","Gulshan","Banani");

    }

    @FXML
    void addAnnouncement(ActionEvent event) {
        tableview.getItems().clear();
        String announcementTitle=announceTitleColumn.getText();
        String message=messageTextField.getText();
        LocalDate date=datepicker.getValue();
        String area=areaCombobox.getValue();
        File f= null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            f=new File("PublicAnnouncement.bin");
            if(f.exists()){
                fos=new FileOutputStream(f,true);
                oos=new AppendableObjectOutPutStream(fos);
            }
            else{
                fos=new FileOutputStream(f);
                oos=new ObjectOutputStream(fos);
            }
            PublicPublishAnnouncement y=new PublicPublishAnnouncement(announcementTitle,message,area,date);
            tableview.getItems().add(y);

            oos.writeObject(y);

        }catch(IOException ex){
            Logger.getLogger(PublicPublishannouncementController.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            try {
                if(oos!=null){
                    oos.close();
                }
            }catch(IOException ex){
                Logger.getLogger(PublicPublishannouncementController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
    void showAllannouncement(ActionEvent event) {
        tableview.getItems().clear();
        ObjectInputStream ois = null;
        try {
            PublicPublishAnnouncement y;
            ois = new ObjectInputStream(new FileInputStream("PublicAnnouncement.bin"));
            while (true) {
                y = (PublicPublishAnnouncement) ois.readObject();
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
