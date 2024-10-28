module com.example.ejercicioj {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejercicioj to javafx.fxml;
    exports com.example.ejercicioj;
}