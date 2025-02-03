package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class Main extends Application {

    public void start(Stage stage) {
        GridPane grid = new GridPane;
        grid.setHgap(10);
        grid.setVgap(10);
        
        UIComponents.addComponents(grid);

        Scene scene = new Scene(grid, 400, 400);
        primaryStage.setTittle("Product");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch();
    }

}