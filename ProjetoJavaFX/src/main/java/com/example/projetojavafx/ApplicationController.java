package com.example.projetojavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

import java.io.IOException;

public class ApplicationController {

    @FXML
    private MenuItem cadastrar;

    @FXML
    void onCadastrarClick(){
        try {
            Application.newStage("cadastrar_aluno-view.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}