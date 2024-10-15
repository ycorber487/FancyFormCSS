package org.example.di_formdesign_cortesyon;

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);

        Label bienvenida = new Label("Welcome");
        bienvenida.setFont(Font.font(24));
        grid.add(bienvenida, 0, 0,2,1);

        Label username = new Label("Username: ");
        grid.add(username, 0, 1);

        TextField userText = new TextField();
        grid.add(userText, 1, 1);

        Label password = new Label("Password ");
        grid.add(password, 0, 2);

        PasswordField passText = new PasswordField();
        grid.add(passText, 1, 2);

        Button boton = new Button("Sign in");
        grid.add(boton, 2, 3);

        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(5, 5, 5, 5));

        Scene scene = new Scene(grid, 500, 400);
        // aniadimos el css
        scene.getStylesheets().add(getClass().getResource("/style.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Welcome!");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}