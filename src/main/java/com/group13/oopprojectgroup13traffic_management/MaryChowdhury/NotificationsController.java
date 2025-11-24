package com.group13.oopprojectgroup13traffic_management.MaryChowdhury;

import com.sun.glass.ui.Clipboard;
import com.sun.javafx.collections.ElementObservableListDecorator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class NotificationsController
{
    @FXML
    private Text notificationsList;

    public Text getNotificationsList() {
        return notificationsList;
    }

    public void setNotificationsList(Text notificationsList) {
        this.notificationsList = notificationsList;
    }

    @Override
    public String toString() {
        return STR."NotificationsController{notificationsList=\{notificationsList}}";
    }

    public NotificationsController(Text notificationsList) {
        this.notificationsList = notificationsList;

    }

    @FXML
    public void initialize() {
        String items = "";
        notificationsList.setText(items);
        loadNotifications();
    }

    @FXML
    public void oaRefresh(ActionEvent actionEvent) {
        loadNotifications();
    }

    @FXML
    public void oaMarkRead(ActionEvent actionEvent) {
        String sel = String.valueOf(notificationsList.getSelectionEnd());
        if (sel==null) return;
        // TODO: send mark-read to backend
        Clipboard items = null;
        items.remove(null);
    }
    private void loadNotifications() {
        ElementObservableListDecorator<Object> items = null;
        items.clear();
        items.addAll(
                "INC-AAA1: Status changed to In Progress (2025-11-14 09:02)",
                "INC-BBB2: Officer verified (2025-11-14 12:30)"
        );
    }
}
