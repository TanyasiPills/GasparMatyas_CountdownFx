module com.example.countdown {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.compiler;


    opens com.example.countdown to javafx.fxml;
    exports com.example.countdown;
}