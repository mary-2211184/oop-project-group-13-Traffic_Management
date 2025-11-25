package com.group13.oopprojectgroup13traffic_management.MaryChowdhury;

import com.sun.javafx.collections.ElementObservableListDecorator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Window;

import java.io.File;
import java.text.BreakIterator;
import java.util.List;

import static sun.jvm.hotspot.runtime.BasicObjectLock.size;

public class UploadEvidenceController{

    @FXML
    private TextField reportIdField;
    @FXML
    private Label uploadStatusLabel;
    @FXML
    private ListView fileListView;

    public class uploadEvidenceController {

        @FXML
        public TextField reportIdField;
        @FXML public Button chooseFilesBtn;
        @FXML public Button uploadBtn;
        @FXML public ListView<File> fileListView;
        @FXML public Label uploadStatusLabel;

        private ObservableList<File> files = FXCollections.observableArrayList();

        public uploadEvidenceController(TextField reportIdField, Button chooseFilesBtn, Button uploadBtn, ListView<File> fileListView, Label uploadStatusLabel, ObservableList<File> files) {
            this.reportIdField = reportIdField;
            this.chooseFilesBtn = chooseFilesBtn;
            this.uploadBtn = uploadBtn;
            this.fileListView = fileListView;
            this.uploadStatusLabel = uploadStatusLabel;
            this.files = files;
        }

        public TextField getReportIdField() {
            return reportIdField;
        }

        public void setReportIdField(TextField reportIdField) {
            this.reportIdField = reportIdField;
        }

        public Button getChooseFilesBtn() {
            return chooseFilesBtn;
        }

        public void setChooseFilesBtn(Button chooseFilesBtn) {
            this.chooseFilesBtn = chooseFilesBtn;
        }

        public Button getUploadBtn() {
            return uploadBtn;
        }

        public void setUploadBtn(Button uploadBtn) {
            this.uploadBtn = uploadBtn;
        }

        public ListView<File> getFileListView() {
            return fileListView;
        }

        public void setFileListView(ListView<File> fileListView) {
            this.fileListView = fileListView;
        }

        public Label getUploadStatusLabel() {
            return uploadStatusLabel;
        }

        public void setUploadStatusLabel(Label uploadStatusLabel) {
            this.uploadStatusLabel = uploadStatusLabel;
        }

        public ObservableList<File> getFiles() {
            return files;
        }

        public void setFiles(ObservableList<File> files) {
            this.files = files;
        }

        @Override
        public String toString() {
            return STR."uploadEvidenceController{reportIdField=\{reportIdField}, chooseFilesBtn=\{chooseFilesBtn}, uploadBtn=\{uploadBtn}, fileListView=\{fileListView}, uploadStatusLabel=\{uploadStatusLabel}, files=\{files}}";
        }

        @FXML
    public void initialize() {
        fileListView.setItems(files);
    }
    }

    @FXML
    public void onUploadFiles(ActionEvent actionEvent) {
        if (reportIdField.getText() == null || reportIdField.getText().isBlank()) {
            uploadStatusLabel.setText("Please enter Report ID.");
            return;
        }
        ElementObservableListDecorator<Object> files = null;
        if (files.isEmpty()) {
            uploadStatusLabel.setText("No files selected.");
            return;
        }

        // Validate file types and sizes (example)
        for (Object f :files) {
            String name = String.valueOf(f.getClass().isInterface());
            if (!(name.endsWith(".jpg") || name.endsWith(".jpeg") || name.endsWith(".png") || name.endsWith(".mp4") || name.endsWith(".mov"))) {
                uploadStatusLabel.setText(STR."Unsupported file type: \{name}");
                return;
            }
            // TODO: size check if required
        }

        // TODO: upload to server and link to reportId
        uploadStatusLabel.setText(STR."Upload successful: \{size()} file(s) uploaded.");
    }


    @FXML
    public void onChooseFiles(ActionEvent actionEvent){
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Select Evidence Files");
        chooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Images/Videos", "*.jpg", "*.jpeg", "*.png", "*.mp4", "*.mov"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );
        Window chooseFilesBtn = null;
        Window window = chooseFilesBtn.getScene().getWindow();
        List<File> selected = chooser.showOpenMultipleDialog(window);
        if (selected != null) {
            ElementObservableListDecorator<Object> files = null;
            files.addAll(selected);
            BreakIterator uploadStatusLabel = null;
            uploadStatusLabel.setText(STR."\{files.size()} file(s) selected.");
        }
    }

void main() {
}}

