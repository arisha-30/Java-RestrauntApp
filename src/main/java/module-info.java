module com.coders.javarestrauntapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.coders.javarestrauntapp to javafx.fxml;
    exports com.coders.javarestrauntapp;
}