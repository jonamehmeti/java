package com.example;

public class PrintHandler{
    public static voit printOutValues(){
        String productType = UIComponents.productComboBox.getValue();

        String extraType = "";
        if(UIComponents.virtualCheckBox.isSelected()){
            extraType += "Virtual ";
        }

        if(UIComponents.downloadableCheckBox.isSelected()){
            extraType +="Downloadable " ;
        }

        ObservableList<String> selectedAttributes  = UIComponents.attributeListView.getSelectionModel().getSelectedItems();


        String attributes = String.join(" , ")
    }
}