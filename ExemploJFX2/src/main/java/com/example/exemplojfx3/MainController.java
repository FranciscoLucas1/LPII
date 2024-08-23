package com.example.exemplojfx3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class MainController implements Initializable{
    @FXML
    private ImageView imagem;
    @FXML
    private ComboBox comboBox;
    @FXML
    private DatePicker data;
    @FXML
    private MenuItem sobre;

    private Stage stage;
    @FXML
    public void onSobreClicked(){
        if(stage == null){
            try {
                stage = Main.novaTela("AjudaView.fxml");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }



    }


    public void onDataClicked(){
        System.out.println(data.getValue());
    }
    @FXML
    public void onImagemClicked(){
        FileChooser fc = new FileChooser();
        File file = fc.showOpenDialog(Main.getScene().getWindow());
        if(file != null){
            imagem.setImage(new Image(String.valueOf(file.toURI())));
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        List<String> lista = new ArrayList<>();
        lista.add("a");
        lista.add("b");
        ObservableList<String> obs;
        obs = FXCollections.observableArrayList(lista);

        comboBox.setItems(obs);

    }

    @FXML
    public void onCbClicked(){
        System.out.println(comboBox.getValue());
    }



}