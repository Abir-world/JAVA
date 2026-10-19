package bd.edu.seu.ecommerce.controller;



import bd.edu.seu.ecommerce.HelloApplication;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.CheckBoxTableCell;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.util.ResourceBundle;


public class Dress2Controller implements Initializable {
    @FXML
    public TableView<Product> tableView;

    @FXML
    public TableColumn<Product, String> namecoloum,colorcolum,typecoloum;

    @FXML
    public TableColumn<Product, Number> pricecoloum, quantitycoloum;

    @FXML
    public TableColumn<Product, String> boostcoloum;
    @FXML
    public TableColumn<Product, String> purchasecoloum;

    @FXML
    public TextField filterField;

    private final String FILE = "dress.txt";

    @FXML
    public static Label nameLabel,typeLabel,sizeLabel, colorLabel, priceLavel, detailsLabel, purchaseLabel,quantityLabel,customerLabel, boosLabel ;

    //ObservableList<Product> productObservableList;
    private ObservableList<Product> masterList = FXCollections.observableArrayList();




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        namecoloum.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getName()));
        typecoloum.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getType()));
        colorcolum.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getColor()));
        pricecoloum.setCellValueFactory(c-> new SimpleObjectProperty<>(c.getValue().getPrice()));
        pricecoloum.setCellValueFactory(c-> new SimpleObjectProperty<>(c.getValue().getPrice()));
        quantitycoloum.setCellValueFactory(c-> new SimpleObjectProperty<>(c.getValue().getQuantity()));
        //boostcoloum.setCellValueFactory(c-> new SimpleBooleanProperty(c.getValue().isFbBoost()));
        //boostcoloum.setCellFactory(CheckBoxTableCell.forTableColumn(boostcoloum));

//        productObservableList = FXCollections.observableArrayList();
//        tableView.setItems(productObservableList);
       loadFromFile();



    }

    private void loadFromFile() {
        masterList.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] d = line.split(",");
                if (d.length < 11) continue;

                masterList.add(new Product(
                        d[0],d[1],d[2],d[3],
                        Double.parseDouble(d[4]),d[5],d[6],
                        Integer.parseInt(d[7]),d[8],d[9],
                        Boolean.parseBoolean(d[10])
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    void backAction() {

    }

    @FXML
    void goToDress1() {
        HelloApplication.switchScene("dress01");
    }
    public void show (Product d){
        namecoloum.setText("Dress name: "+d.getName());
        typeLabel.setText("Dress type"+d.getType());
        sizeLabel.setText("Dress size"+d.getSize());
        colorLabel.setText("Dress color"+d.getColor());
        priceLavel.setText("Dress price"+d.getPrice()+" BDT");
        detailsLabel.setText("Dress details"+d.getDetails());
        purchaseLabel.setText("Dress date"+d.getLast_purchase());
        quantityLabel.setText("Dress quantity"+String.valueOf(d.getQuantity()));
        boosLabel.setText(Boolean.parseBoolean("Booster"+d.isFbBoost()) ? "Enabled" : "Disabled");

    }

}

//    private void show(Product d) {
//        namecoloum.setText("Dress name:"+d.getName());
//        typeLabel.setText("Dress type"+d.getType());
//        sizeLabel.setText("Dress size"+d.getSize());
//        colorLabel.setText("Dress color"+d.getColor());
//        priceLavel.setText("Dress price"+d.getPrice()+" BDT");
//        detailsLabel.setText("Dress details"+d.getDetails());
//        purchaseLabel.setText("Dress date"+d.getLast_purchase());
//        quantityLabel.setText("Dress quantity"+String.valueOf(d.getQuantity()));
//        boosLabel.setText(Boolean.parseBoolean("Booster"+d.isFbBoost()) ? "Enabled" : "Disabled");
//    }

