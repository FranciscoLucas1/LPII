package com.example.exemplojfx3;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Scene scene;

    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainView.fxml"));
        scene = new Scene(fxmlLoader.load());
        stage.setTitle("Imagem legal");
        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest(e -> Platform.exit());
    }

    public static Scene getScene() {
        return scene;
    }


    public static Stage novaTela(String url) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(url));
        scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("AJUDAAAAAAAAAAAAAAAAAA");
        stage.setScene(scene);
        stage.show();
        return stage;
    }


    public static void main(String[] args) {
        launch();
    }
}