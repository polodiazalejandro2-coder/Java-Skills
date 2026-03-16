module com.apd.login {
    requires javafx.controls;
    requires javafx.fxml;

    // Esto permite que JavaFX lea tus pantallas y controladores
    opens com.apd.login.view to javafx.fxml;
    opens com.apd.login.controller to javafx.fxml;
    
    exports com.apd.login.view;
}