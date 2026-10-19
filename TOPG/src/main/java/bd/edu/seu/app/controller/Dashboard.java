package bd.edu.seu.app.controller;

import bd.edu.seu.app.HelloApplication;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Dashboard implements Initializable {

    @FXML
    private Label emailLabel;




    public void changeToLog(){
        HelloApplication.switchChage("login");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        emailLabel.setText(LoginController.loggedInEmail);

    }
}
