package com.example.takeaway2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import vinnsla.Veitingar;

public class PontunController {
    @FXML
    private Label welcomeText;

    @FXML
    private ListView<Veitingar> fxkarfa;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
