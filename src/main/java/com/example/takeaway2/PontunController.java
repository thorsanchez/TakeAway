package com.example.takeaway2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import vinnsla.Karfa;
import vinnsla.Veitingar;

public class PontunController {
    @FXML
    private Button innskraning;


    @FXML
    private ListView<Veitingar> fxkarfa;

    private Karfa karfa;

    @FXML
    public void takki(ActionEvent e) {
        innskraning.setText("Welcome to JavaFX Application!");
    }

    public void initialize() {
        verd.textProperty().bind(karfa. ()){

        }
    }

}

