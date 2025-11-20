module com.group13.oopprojectgroup13traffic_management {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.hotspot.agent;


    opens com.group13.oopprojectgroup13traffic_management to javafx.fxml;
    exports com.group13.oopprojectgroup13traffic_management;
    opens com.group13.oopprojectgroup13traffic_management.Limu.ParkingsystemManager to javafx.fxml;
    exports com.group13.oopprojectgroup13traffic_management.Limu.ParkingsystemManager;
    opens com.group13.oopprojectgroup13traffic_management.Limu.policymaker to javafx.fxml;
    exports com.group13.oopprojectgroup13traffic_management.Limu.policymaker;
}