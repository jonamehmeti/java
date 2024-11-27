package com.example;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label messageLabel;

    @FXML
    private void onBtnClick() {
     messageLabel.setText("Button Clicked!");
 
     }

    @FXML
    void initialize() {
        assert messageLabel != null : "fx:id=\"messageLabel\" was not injected: check your FXML file 'mainscene.fxml'.";

    }

}

