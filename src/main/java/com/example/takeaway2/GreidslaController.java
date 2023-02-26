package com.example.takeaway2;

import javafx.event.ActionEvent;

public class GreidslaController {
    public void onBack(ActionEvent actionEvent) {
        ViewSwitcher.switchTo(View.MAIN);
    }

    public void onForward() {
        ViewSwitcher.switchTo(View.MAIN);
        
    }

}

