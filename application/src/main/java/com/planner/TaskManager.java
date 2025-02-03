package com.planner;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TaskManager {
    private static final ObservableList<Task> taskList = FXCollections.observableArrayList();

    public static ObservableList<Task> getTasks() {
        return taskList;
    }

    public static void addTask(Task task) {
        taskList.add(task);
    }

    public static void removeTask(Task task) {
        taskList.remove(task);
    }
}
