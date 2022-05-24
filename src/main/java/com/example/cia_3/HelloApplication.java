package com.example.cia_3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Railway Management System");
        stage.setScene(scene);
        stage.show();
        // comment by ySH
    }

    public static void main(String[] args) {
        System.out.println("My name is Yash Lucas");
        System.out.println("My name is  Lucas");
        launch();
    }
}