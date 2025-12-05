package com.group13.oopprojectgroup13traffic_management.MaryChowdhury;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.Event;
import javafx.scene.control.*;

public class CommunicationPanelController {
    public ComboBox<String> reportSelector;
    public TableView<Object> messageHistory;
    public TableColumn<MessageRow,String> colFrom;
    public TableColumn<MessageRow,String> colWhen;
    public TableColumn<MessageRow,String> colText;
    public TextArea messageArea;
    public Label msgStatus;

    private ObservableList<Object> messages = FXCollections.observableArrayList();

    public ComboBox<String> getReportSelector() {
        return reportSelector;
    }

    public void setReportSelector(ComboBox<String> reportSelector) {
        this.reportSelector = reportSelector;
    }

    public TableView<Object> getMessageHistory() {
        return messageHistory;
    }

    public void setMessageHistory(TableView<Object> messageHistory) {
        this.messageHistory = messageHistory;
    }

    public TableColumn<MessageRow, String> getColFrom() {
        return colFrom;
    }

    public void setColFrom(TableColumn<MessageRow, String> colFrom) {
        this.colFrom = colFrom;
    }

    public TableColumn<MessageRow, String> getColWhen() {
        return colWhen;
    }

    public void setColWhen(TableColumn<MessageRow, String> colWhen) {
        this.colWhen = colWhen;
    }

    public TableColumn<MessageRow, String> getColText() {
        return colText;
    }

    public void setColText(TableColumn<MessageRow, String> colText) {
        this.colText = colText;
    }

    public TextArea getMessageArea() {
        return messageArea;
    }

    public void setMessageArea(TextArea messageArea) {
        this.messageArea = messageArea;
    }

    public Label getMsgStatus() {
        return msgStatus;
    }

    public void setMsgStatus(Label msgStatus) {
        this.msgStatus = msgStatus;
    }

    public ObservableList<Object> getMessages() {
        return messages;
    }

    public void setMessages(ObservableList<Object> messages) {
        this.messages = messages;
    }

    @Override
    public String toString() {
        return STR."CommunicationPannelController{reportSelector=\{reportSelector}, messageHistory=\{messageHistory}, colFrom=\{colFrom}, colWhen=\{colWhen}, colText=\{colText}, messageArea=\{messageArea}, msgStatus=\{msgStatus}, messages=\{messages}}";
    }

    public CommunicationPanelController(ComboBox<String> reportSelector, TableView<Object> messageHistory, TableColumn<MessageRow, String> colFrom, TableColumn<MessageRow, String> colWhen, TableColumn<MessageRow, String> colText, TextArea messageArea, Label msgStatus, ObservableList<Object> messages) {
        this.reportSelector = reportSelector;
        this.messageHistory = messageHistory;
        this.colFrom = colFrom;
        this.colWhen = colWhen;
        this.colText = colText;
        this.messageArea = messageArea;
        this.msgStatus = msgStatus;
        this.messages = messages;


    }

    @javafx.fxml.FXML
    public void initialize() {
        reportSelector.setItems(FXCollections.observableArrayList("INC-AAA1","INC-BBB2"));
        colFrom.setCellValueFactory(c -> new javafx.beans.property.SimpleStringProperty(c.getValue().from));
        colWhen.setCellValueFactory(c -> new javafx.beans.property.SimpleStringProperty(c.getValue().when));
        colText.setCellValueFactory(c -> new javafx.beans.property.SimpleStringProperty(c.getValue().text));
        messageHistory.setItems(messages);
    }

    @javafx.fxml.FXML
    public void oaSend(Event event) {
        String id = reportSelector.getValue();
        String text = messageArea.getText();
        if (id==null || text==null || text.isBlank()) { msgStatus.setText("Select report and type a message."); return; }
        // TODO: send message, store in history
        messages.add(new MessageRow("Officer","now",text));
        messageArea.clear();
        msgStatus.setText("Message sent.");
    }

    @javafx.fxml.FXML
    public void oaLoadMessage(Event event) {
        String id = reportSelector.getValue();
        if (id==null) { msgStatus.setText("Select report."); return; }
        // TODO: load messages from DB
        messages.clear();
        messages.addAll(
                new MessageRow("Reporter","2025-11-13 14:20","There is a fallen tree."),
                new MessageRow("Officer.jones","2025-11-14 09:10","Acknowledged. Sending crew.")
        );
        msgStatus.setText("Loaded messages.");
    }
    public static class MessageRow {
        public String from, when, text;
        public MessageRow(String from,String when,String text){this.from=from;this.when=when;this.text=text;}
    }
}