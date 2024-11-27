package com.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class main extends Application {
    public void start(Stage primaryStage){
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Sample.fxml"));
            Scene scene = new Scene(loader.load(), 400, 400);
            primaryStage.setTitle("FXML in JAVA");
            primaryStage.show();

        }

    }

    public static void main(String[] args) {
        launch;
    }
}
   
