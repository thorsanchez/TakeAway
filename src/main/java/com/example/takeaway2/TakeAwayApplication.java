package com.example.takeaway2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class TakeAwayApplication extends Application {
    private PontunController pontunController;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("pontun-view.fxml"));
        Pane pontunViewPane = fxmlLoader.load();
        pontunController = fxmlLoader.getController();

        Scene scene = new Scene(pontunViewPane);
        ViewSwitcher.setScene(scene);
        ViewSwitcher.switchTo(View.MAIN);

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public PontunController getPontunViewController() {
        return pontunController;
    }
}
