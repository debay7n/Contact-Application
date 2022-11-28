module com.example.contact {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.contact to javafx.fxml;
    exports com.example.contact;
}