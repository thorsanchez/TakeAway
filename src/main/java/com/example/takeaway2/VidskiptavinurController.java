package com.example.takeaway2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class VidskiptavinurController {

    @FXML
    private Button fxInnskra;
    @FXML
    private TextField fxNafn;
    @FXML
    private TextField fxHeimilisfang;

    public void fxInnskra(ActionEvent actionEvent) {
        //idskiptavinur.nafn = fxNafn.getText();
        ViewSwitcher.switchTo(View.MAIN);
    }

    public String getNafn() {
        return fxNafn.getText();
    }
}
