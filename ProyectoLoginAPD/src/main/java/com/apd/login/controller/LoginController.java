package com.apd.login.controller;

import com.apd.login.model.UserDataValidations;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML private TextField txtUser;
    @FXML private PasswordField txtPass;
    @FXML private Label lblInfo;

    private UserDataValidations model = new UserDataValidations();

    @FXML
    private void onLoginClick() {
        String user = txtUser.getText();
        String pass = txtPass.getText();

        if (model.validateLogin(user, pass)) {
            lblInfo.setText("Acceso correcto");
            lblInfo.setStyle("-fx-text-fill: green;");
        } else {
            lblInfo.setText("Email o clave incorrectos");
            lblInfo.setStyle("-fx-text-fill: red;");
        }
    }
}