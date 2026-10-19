package bd.edu.seu.app.controller;

import bd.edu.seu.app.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class AdmissionController implements Initializable {
    @FXML
    public TextArea biography;

    @FXML
    public CheckBox checkBox;

    @FXML
    public TextField nameField;

    @FXML
    public PasswordField passwordField;

    @FXML
    public ChoiceBox<String> programChoice;

    @FXML
    public ToggleGroup genderRadio;

    @FXML
    public Slider slider;

    @FXML
    public ListView<String> admissionViewList;
    ObservableList<String> admissionList;
    //ObservableList<Details> DetailsList;(bhul maybe)


    @FXML
    void actionEvent() {
        String name = nameField.getText();
        String pass = passwordField.getText();
        String program = programChoice.getValue();
        RadioButton selectedRadio = (RadioButton) genderRadio.getSelectedToggle();
        String gender = selectedRadio.getText();
        Boolean agree = checkBox.isSelected();
        String bio = biography.getText();
        double price = slider.getValue();

        Details details = new Details(name,pass,program,gender, biography.getText(), checkBox.isSelected());
        //DetailsList.add(details);(eikhne use hobe na (learning->)
        String value = name+ " "+ pass+" "+program+" "+gender+" "+bio+" " +agree;
        admissionList.add(value);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        admissionList = FXCollections.observableArrayList();
        admissionViewList.setItems(admissionList);


        ObservableList<String> program = FXCollections.observableArrayList();
        program.add("CSE");
        program.add("BBA");
        program.add("EEE");

        programChoice.setItems(program);
    }

    @FXML
    void tableAction() {
        HelloApplication.switchChage("tableview");

    }
}
