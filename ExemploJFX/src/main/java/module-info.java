module com.example.exemplojfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exemplojfx to javafx.fxml;
    exports com.example.exemplojfx;
}