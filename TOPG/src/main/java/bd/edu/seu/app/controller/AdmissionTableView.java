package bd.edu.seu.app.controller;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class AdmissionTableView implements Initializable {

    @FXML
    public TableView<Details> detailsTable;

    @FXML
    public TableColumn<Details, String> nameCol,passCol,programCol,genderCol,textCol;

    @FXML
    public TableColumn<Details, Boolean> checkCol;

    ObservableList<Details> DetailsList= FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameCol.setCellValueFactory(c-> new SimpleStringProperty(c.getValue().getName()));
        passCol.setCellValueFactory(c-> new SimpleStringProperty(c.getValue().getPassword()));
        programCol.setCellValueFactory(c-> new SimpleStringProperty(c.getValue().getProgram()));
        genderCol.setCellValueFactory(c-> new SimpleStringProperty(c.getValue().getGender()));
        textCol.setCellValueFactory(c-> new SimpleStringProperty(c.getValue().getText()));
        checkCol.setCellValueFactory(c-> new SimpleBooleanProperty(c.getValue().isCheck()));

        detailsTable.setItems(DetailsList);
        loadDetails();

    }
    public void loadDetails(){
        DetailsList.clear();
        ArrayList<Details> details = new ArrayList<Details>();
        DetailsList.addAll(details);
    }

}
