package com.group13.oopprojectgroup13traffic_management;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;

public class SceneSwitch {

    public class App extends Application {

        private static Stage primaryStage;
        private static Scene mainScene;

        @Override
        public void start(Stage stage) throws Exception {
            primaryStage = stage;

            // First screen to show (change to whatever you want as default)
            Parent root = loadFXML("IncidentReportForm"); // IncidentReportForm.fxml

            mainScene = new Scene(root);
            primaryStage.setScene(mainScene);
            primaryStage.setTitle("Traffic Incident System");
            primaryStage.show();
        }


        public static void setRoot(String fxml) {
            try {
                Parent root = loadFXML(fxml);
                mainScene.setRoot(root);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private static Parent loadFXML(String fxml) throws IOException {
            FXMLLoader loader = new FXMLLoader(App.class.getResource(STR."/fxml/\{fxml}.fxml"));
            return loader.load();
        }

        public static void main(String[] args) {
            launch(args);
        }
    }
}
