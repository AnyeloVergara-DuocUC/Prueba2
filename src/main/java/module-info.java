module com.prueba.prueba1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.prueba.prueba1 to javafx.fxml;
    exports com.prueba.prueba1;
}