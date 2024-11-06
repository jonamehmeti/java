package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox; 
import javafx.stage.Stage;

public class Main extends Application {

    private Stage window;
    private Scene loginScene, signupScene, mainScene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Hyni në account tuaj!");

        // Login 
        GridPane loginLayout = createAuthLayout("Login");
        TextField loginUsernameInput = new TextField();
        PasswordField loginPasswordInput = new PasswordField();
        Button loginButton = new Button("Login");
        Button toSignupButton = new Button("Sign up");

        loginButton.setStyle("-fx-background-color: #90EE90; -fx-text-fill: white;"); 
        toSignupButton.setStyle("-fx-background-color: #90EE90; -fx-text-fill: white;");

        addAuthFields(loginLayout, loginUsernameInput, loginPasswordInput, loginButton);
        loginLayout.add(toSignupButton, 1, 3);

        // Signup 
        GridPane signupLayout = createAuthLayout("Sign Up");
        TextField signupUsernameInput = new TextField();
        PasswordField signupPasswordInput = new PasswordField();
        Button signupButton = new Button("Sign up");
        Button toLoginButton = new Button("Hyni në llogarinë tuaj!");

        signupButton.setStyle("-fx-background-color: #90EE90; -fx-text-fill: white;");
        toLoginButton.setStyle("-fx-background-color: #90EE90; -fx-text-fill: white;");

        addAuthFields(signupLayout, signupUsernameInput, signupPasswordInput, signupButton);
        signupLayout.add(toLoginButton, 1, 3);

        toSignupButton.setOnAction(e -> window.setScene(signupScene));
        toLoginButton.setOnAction(e -> window.setScene(loginScene));
    
        loginButton.setOnAction(e -> handleLogin(loginUsernameInput.getText(), loginPasswordInput.getText()));
        signupButton.setOnAction(e -> handleSignup(signupUsernameInput.getText(), signupPasswordInput.getText()));

        loginScene = new Scene(loginLayout, 400, 300);
        signupScene = new Scene(signupLayout, 400, 300);
        mainScene = createMainScene();

        window.setScene(loginScene);
        window.show();
    }

    private GridPane createAuthLayout(String title) {
        GridPane layout = new GridPane();
        layout.setPadding(new Insets(20));
        layout.setHgap(10);
        layout.setVgap(10);

        Label titleLabel = new Label(title);
        titleLabel.setStyle("-fx-font-size: 16px; -fx-font-weight: bold;");
        layout.add(titleLabel, 0, 0, 2, 1);
        
        return layout;
    }

    private void addAuthFields(GridPane layout, TextField usernameInput, PasswordField passwordInput, Button actionButton) {
        layout.add(new Label("Username:"), 0, 1);
        layout.add(usernameInput, 1, 1);
        
        layout.add(new Label("Password:"), 0, 2);
        layout.add(passwordInput, 1, 2);

        layout.add(actionButton, 1, 4);
    }

    private void handleLogin(String username, String password) {
        //  authentication logic
        System.out.println("Logging in with Username: " + username + ", Password: " + password);
        window.setScene(mainScene); 
    }

    private void handleSignup(String username, String password) {
    //sign-up logic
        System.out.println("Signing up with Username: " + username + ", Password: " + password);
        window.setScene(mainScene); 
    }

    private Scene createMainScene() {
        VBox layout = new VBox(20);
        layout.setPadding(new Insets(20));
        Label mainLabel = new Label("Mirë se vini në aplikacionin tonë!");
        Label paragrafi = new Label("Lorem Ipsum is simply dummy text of the printing and typesetting industry.");
        Label paragrafiA = new Label("Adjust the CSS styles or RichTextFX settings to achieve the desired paragraph formatting.");
        layout.getChildren().add(mainLabel);
        layout.getChildren().add(paragrafi);
        layout.getChildren().add(paragrafiA);
        return new Scene(layout, 600, 400);
    }
}
