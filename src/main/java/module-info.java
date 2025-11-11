module com.group13.oopprojectgroup13traffic_management {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.group13.oopprojectgroup13traffic_management to javafx.fxml;
    exports com.group13.oopprojectgroup13traffic_management;
}