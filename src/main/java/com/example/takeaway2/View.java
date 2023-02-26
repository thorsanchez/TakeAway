package com.example.takeaway2;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public enum View {
    MAIN("pontun-view.fxml"),
    ABOUT("greidsla.fxml");

    private String fileName;

    View(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
