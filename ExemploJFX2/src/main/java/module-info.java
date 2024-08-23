module com.example.exemplojfx3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.exemplojfx3 to javafx.fxml;
    exports com.example.exemplojfx3;
}