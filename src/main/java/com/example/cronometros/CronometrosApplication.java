package com.example.cronometros;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CronometrosApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CronometrosApplication.class.getResource("cronometros-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 360, 360);
        stage.setTitle("Cronómetros");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}