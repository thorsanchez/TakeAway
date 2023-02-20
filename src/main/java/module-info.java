module com.example.takeaway2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.takeaway2 to javafx.fxml;
    exports com.example.takeaway2;
}
