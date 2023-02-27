package com.example.takeaway2;

import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import vinnsla.Veitingar;

public class GreidslaController {
    public void onBack(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.MAIN);
    }

    public void onForward() {
        PontunController pontunController = ViewSwitcher.getPontunController();
        ListView<Veitingar> karfaListView = pontunController.getKarfaListView();
        karfaListView.getItems().clear();
        ViewSwitcher.switchTo(View.MAIN);

    }
}

