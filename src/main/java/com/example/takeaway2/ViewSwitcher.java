package com.example.takeaway2;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public class ViewSwitcher {


    private static Scene scene;
    //til að tengja fxkarfa frá Pcontroller við Gcontroller
    private static PontunController pontunController;

    private static Map<View, Parent> cache = new HashMap<>();

    //til að tengja fxkarfa frá Pcontroller við Gcontroller
    public static PontunController getPontunController() {
        return pontunController;
    }

    public static void setScene(Scene scene) {
        ViewSwitcher.scene = scene;
    }

    public static void switchTo(View view) {
        if (scene == null) {
            System.out.println("No scene was set");
            return;
        }

        try {
            Parent root;

            if (cache.containsKey(view)) {
                System.out.println("Loading from cache");

                root = cache.get(view);
            } else {
                System.out.println("Loading from FXML");

                root = FXMLLoader.load(ViewSwitcher.class.getResource(view.getFileName())
                );

                cache.put(view, root);
            }

            scene.setRoot(root);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
