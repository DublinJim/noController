module com.example.scrap {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.scrap to javafx.fxml;
    exports com.example.scrap;
}