package bd.edu.seu.app.controller;

import bd.edu.seu.app.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    public TextField emailField;

    @FXML
    public PasswordField passwordField;

    public static String loggedInEmail = "";


    @FXML
    void loginAction() {
        String email = emailField.getText();
        emailField.clear();
        String password = passwordField.getText();
        passwordField.clear();

        String validEmail = "abir12";
        String validPass = "123";
        if(validEmail.equals(email) && validPass.equals(password)){
            loggedInEmail = email;
            HelloApplication.switchChage("dashboard");
        }

        IO.println(email+ " "+ password);

    }

    @FXML
    public void changeToReg() {
        HelloApplication.switchChage("registration");
    }











}
