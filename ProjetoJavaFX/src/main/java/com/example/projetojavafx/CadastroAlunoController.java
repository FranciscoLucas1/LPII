package com.example.projetojavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.scene.image.Image;
import java.io.File;

public class CadastroAlunoController {
    @FXML
    private TextField nome;

    @FXML
    private TextField cpf;

    @FXML
    private DatePicker data;

    @FXML

    private ImageView foto;
    @FXML

    private Button salvar;

    @FXML
    void OnFotoClick(){
        FileChooser fc = new FileChooser();
        File file = fc.showOpenDialog(Application.getScene().getWindow());
        if(file != null){
            foto.setImage(new Image(file.toURI().toString()));
        }
    }

    @FXML
    void OnSalvarClick(){

    }




}
