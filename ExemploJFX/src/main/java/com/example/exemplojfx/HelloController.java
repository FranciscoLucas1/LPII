package com.example.exemplojfx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField n1;
    @FXML
    private TextField n2;
    @FXML
    private Label resultado;
    @FXML
    private Button soma;

    @FXML
    public void somar(){
        resultado.setText(Double.parseDouble(n1.getText()) + Double.parseDouble(n2.getText())+"");
    }
}


