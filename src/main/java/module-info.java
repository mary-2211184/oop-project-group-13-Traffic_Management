
module com.group13.oopprojectgroup13traffic_management {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.logging;


    opens com.group13.oopprojectgroup13traffic_management to javafx.fxml;
    exports com.group13.oopprojectgroup13traffic_management;
    opens com.group13.oopprojectgroup13traffic_management.Limu.ParkingsystemManager to javafx.fxml;
    exports com.group13.oopprojectgroup13traffic_management.Limu.ParkingsystemManager;
    opens com.group13.oopprojectgroup13traffic_management.Limu.policymaker to javafx.fxml;
    exports com.group13.oopprojectgroup13traffic_management.Limu.policymaker;


    opens com.group13.oopprojectgroup13traffic_management.Rafi to javafx.fxml;
    exports com.group13.oopprojectgroup13traffic_management.Rafi;

    opens com.group13.oopprojectgroup13traffic_management.MaryChowdhury to javafx.fxml;
    exports com.group13.oopprojectgroup13traffic_management.MaryChowdhury;

    opens com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.SA to javafx.fxml;
    exports com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.SA;

    opens com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.TCA to javafx.fxml;
    exports com.group13.oopprojectgroup13traffic_management.Mobasshira_Akter.TCA;
}