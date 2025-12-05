package com.group13.oopprojectgroup13traffic_management.MaryChowdhury;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FeedbackController
{
    @javafx.fxml.FXML
    private TextField reportIdField;
    @javafx.fxml.FXML
    private TextArea feedbackArea;
    @javafx.fxml.FXML
    private ChoiceBox ratingChoiceBox;
    @javafx.fxml.FXML
    private Label resultLabel;

    public TextField getReportIdField() {
        return reportIdField;
    }

    public void setReportIdField(TextField reportIdField) {
        this.reportIdField = reportIdField;
    }

    public TextArea getFeedbackArea() {
        return feedbackArea;
    }

    public void setFeedbackArea(TextArea feedbackArea) {
        this.feedbackArea = feedbackArea;
    }

    public ChoiceBox getRatingChoiceBox() {
        return ratingChoiceBox;
    }

    public void setRatingChoiceBox(ChoiceBox ratingChoiceBox) {
        this.ratingChoiceBox = ratingChoiceBox;
    }

    public Label getResultLabel() {
        return resultLabel;
    }

    public void setResultLabel(Label resultLabel) {
        this.resultLabel = resultLabel;
    }

    @Override
    public String toString() {
        return STR."FeedbackController{reportIdField=\{reportIdField}, feedbackArea=\{feedbackArea}, ratingChoiceBox=\{ratingChoiceBox}, resultLabel=\{resultLabel}}";
    }

    public FeedbackController(TextField reportIdField, TextArea feedbackArea, ChoiceBox ratingChoiceBox, Label resultLabel) {
        this.reportIdField = reportIdField;
        this.feedbackArea = feedbackArea;
        this.ratingChoiceBox = ratingChoiceBox;
        this.resultLabel = resultLabel;


    }

    @javafx.fxml.FXML
    public void initialize() {
        ratingChoiceBox.setItems(FXCollections.observableArrayList(1,2,3,4,5));
        ratingChoiceBox.setValue(5);
    }

    @javafx.fxml.FXML
    public void oaSubmitFeedback(ActionEvent actionEvent) {
        String feedback = feedbackArea.getText();
        Integer rating = (Integer) ratingChoiceBox.getValue();

        if (feedback == null || feedback.isBlank()) {
            resultLabel.setText("Feedback cannot be empty.");
            return;
        }
        if (rating == null || rating < 1 || rating > 5) {
            resultLabel.setText("Rating must be 1-5.");
            return;
        }

        // TODO: persist feedback with optional reportId
        resultLabel.setText("Thanks — feedback submitted.");
        feedbackArea.clear();
    }

}