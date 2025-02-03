module com.planner {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.planner to javafx.fxml;
    exports com.planner;
}
