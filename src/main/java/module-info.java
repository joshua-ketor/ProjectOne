module org.example.projectone {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.projectone to javafx.fxml;
    exports org.example.projectone;
}