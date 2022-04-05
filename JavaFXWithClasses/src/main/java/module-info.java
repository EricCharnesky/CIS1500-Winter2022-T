module com.example.javafxwithclasses {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxwithclasses to javafx.fxml;
    exports com.example.javafxwithclasses;
}