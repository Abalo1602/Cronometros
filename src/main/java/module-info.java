module com.example.cronometros {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cronometros to javafx.fxml;
    exports com.example.cronometros;
}