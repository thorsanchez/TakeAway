package com.example.takeaway2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import vinnsla.Karfa;

public class GreidslaController {

    @FXML
    private TextField fxPantaText;

    private final Karfa karfa = new Karfa();

    private PontunController pontunController;


    public void clearFxkarfa() {
        // get the controller for PontunController.fxml
        PontunController pontunController = (PontunController) ViewSwitcher.lookup(View.MAIN);

        // clear fxkarfa
        pontunController.clearkarfa();
        if (pontunController != null) {
            pontunController.clearkarfa();
        }
    }


    public void onBack(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.MAIN);
    }


    public void onForward(ActionEvent actionEvent) {
        // set the pontunController object
        //pontunController.clearkarfa();
        clearFxkarfa();
        // switch to the next view
        ViewSwitcher.switchTo(View.MAIN);
    }

}


