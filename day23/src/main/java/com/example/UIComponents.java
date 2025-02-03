package com.example;

import javafx.collections.FXCollections;
import javafx.collections.Observablelist;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.GridPane;

public class UIComponents{
    static ComboBox<String> productComboBox = new ComboBox<>();
    static CheckBox virtualCheckBox = new CheckBox("Virtual Checkbox");
    static CheckBox downloadableCheckBox = new CheckBox("Downloadable Checkbox");
    static ListView<String> attributeListView = new ListView<>();
    static Button saveButton = new Button();

    public static void addComponents(GridPane grid){
        productComboBox.getItems().addAll("Simple", "Grouped", "Affiliate", "Variable");
        productComboBox.setValue("Attributes");
        grid.add(productComboBox,1, 0);

        grid.add(virtualCheckBox, 1 , 2);
        grid.add(downloadableCheckBox, 1, 3);

        ObservableList<String> attributes = FXCollections.observableArrayList("Color", "Size", "Brand", "Material");
        attributeListView.setItems(attributes);
        attributesListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        grid.add(attributeListView, 1, 4 );

        grid.add(saveButton, 1, 5);

        saveButton.setOnAction(e-> PrintHandler.printOutValues());


    }
 }