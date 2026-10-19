package bd.edu.seu.app.controller;

import bd.edu.seu.app.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegistrationController {
    @FXML
    public TextField emailField;

    @FXML
    public TextField nameFiield;

    @FXML
    public PasswordField passField;

    @FXML
    void Action() {
        String name = nameFiield.getText();
        String pass = passField.getText();
        String email = emailField.getText();
        nameFiield.clear();
        passField.clear();
        emailField.clear();

        IO.println("register");

    }
    public void switchLog(){
        HelloApplication.switchChage("login");
    }
}
