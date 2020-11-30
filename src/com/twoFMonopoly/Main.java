package com.twoFMonopoly;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("UI/FX/mainMenu.fxml"));
        primaryStage.setResizable(false);
        primaryStage.setTitle("2FMonopoly");
        primaryStage.setScene(new Scene(root, 1366, 768));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
