package com.planner;



import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;

public class PlannerController {

    @FXML
    private TextField titleField;
    @FXML
    private TextArea descriptionField;
    @FXML
    private ListView<Task> taskListView;
    @FXML
    private Button addButton;
    @FXML
    private Button deleteButton;

    @FXML
    public void initialize() {
        taskListView.setItems(TaskManager.getTasks());

        addButton.setOnAction(e -> addTask());
        deleteButton.setOnAction(e -> deleteTask());
    }

    private void addTask() {
        String title = titleField.getText();
        String description = descriptionField.getText();

        if (!title.isEmpty()) {
            Task task = new Task(title, description);
            TaskManager.addTask(task);
            titleField.clear();
            descriptionField.clear();
        }
    }

    private void deleteTask() {
        Task selectedTask = taskListView.getSelectionModel().getSelectedItem();
        if (selectedTask != null) {
            TaskManager.removeTask(selectedTask);
        }
    }
}
