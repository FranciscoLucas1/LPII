package com.example.projetojavafx;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    private static Scene scene;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("application-view.fxml"));
        scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Gerenciamento de Alunos UNIVERSIDADE Y");
        stage.setScene(scene);
        stage.show();
    }
    public static Scene getScene(){
        return scene;
    }
    public static Stage newStage(String url) throws IOException{
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource(url));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setScene(scene);
        stage.show();
        return stage;
    }

    public static void main(String[] args) {
        launch();
    }
}