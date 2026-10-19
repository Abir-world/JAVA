package bd.edu.seu.ecommerce.controller;

import bd.edu.seu.ecommerce.HelloApplication;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Dress1Controller implements Initializable {


    @FXML
    public TextField nameField;
    @FXML
    public Label dressNameErrorLabel;

    @FXML
    public ChoiceBox<String> dtypeChoiceField;
    @FXML
    public Label dressTypeErrorLabel;

    @FXML
    public ComboBox<String> sizeComboField;
    @FXML
    public Label sizeErrorLabel;


    @FXML
    public CheckBox blackCheckBox, whiteCheckBox;
    @FXML
    public Label colorErrorLabel;

    @FXML
    public Slider priceSliderField;
    @FXML
    public Label priceErrorLabel;

    @FXML
    public TextArea detailsAreaField;
    @FXML
    public Label detailsErrorLabel;

    @FXML
    public DatePicker dateField;
    @FXML
    public Label dateErrorField;

    @FXML
    public Spinner<Integer> quantitySpinnerField;
    @FXML
    public Label qualityErrorLabel;

    @FXML
    public PasswordField discountCodeField;
    @FXML
    public Label discountErrorLabel;

    @FXML
    public ToggleGroup toggleField;
    @FXML
    public Label customerErrorLabel;

    @FXML
    public CheckBox fbBoostcheckBoxField;


    @FXML
    public Button uploadButton;

    @FXML
    public Label uploadErrorLabel;

    public final String FILE = "dress.txt";

//public String imagePath = "";
    //public String imagePath = "";

//    @FXML
//    public ImageView imagePath;


    @FXML
    void mainAction() {
        hideAllErrors();
        boolean valid = true;

        String name =  nameField.getText();
        String dtype = dtypeChoiceField.getValue();
        String size = sizeComboField.getValue();
        if(name == null || name.trim().isEmpty()) {
            dressNameErrorLabel.setText("Dress Name Is Required");
            dressNameErrorLabel.setVisible(true);
            valid = false;
        }
        String type = dtypeChoiceField.getValue();
        if(type == null ) {
            dressTypeErrorLabel.setText("Dress Type Is Required");
            dressTypeErrorLabel.setVisible(true);
            valid = false;
        }
        if(size == null ) {
            sizeErrorLabel.setText("Size Is Required");
            sizeErrorLabel.setVisible(true);
            valid = false;
        }

        String color = "";
        if(whiteCheckBox.isSelected()) color = "White";
        if(blackCheckBox.isSelected()) color = "Black";

        if (color.isEmpty()) {
            colorErrorLabel.setText("Color is Required");
            colorErrorLabel.setVisible(true);
            valid = false;
        }
        int price = (int) priceSliderField.getValue();
        if(price < 500) {
            priceErrorLabel.setText("Price must be greater than 500");
            priceErrorLabel.setVisible(true);
            valid = false;
        }
        String details = detailsAreaField.getText();
        if (details.length() > 50) {
            detailsErrorLabel.setText("Only 50 characters are allowed");
            detailsErrorLabel.setVisible(true);
            valid = false;
        }
        LocalDate date = dateField.getValue();
        if(date == null || date.isAfter(LocalDate.now())) {
            dateErrorField.setText("Date Can't be future date.");
            dateErrorField.setVisible(true);
            valid = false;
        }
        int quantity = quantitySpinnerField.getValue();
        if(quantity <= 0) {
            qualityErrorLabel.setText("Quantity Can't be less than 0");
            qualityErrorLabel.setVisible(true);
            valid = false;
        }
        String discount = discountCodeField.getText();

        RadioButton selectedGenderRadio = (RadioButton) toggleField.getSelectedToggle();
        String selectedGender = selectedGenderRadio.getText();
        if(selectedGender == null ) {
            customerErrorLabel.setText("Targeted Customer Is Required");
            customerErrorLabel.setVisible(true);
            valid = false;
         }
        boolean fbBoost = fbBoostcheckBoxField.isSelected();
//        if(imagePath.isEmpty()) {
//            uploadErrorLabel.setText("Picture is Required");
//            uploadErrorLabel.setVisible(true);
//            valid = false;
//        }

        if(!valid) return;

        Product dress = new Product(name, type, size, color, price, details, date.toString(),quantity,discount,selectedGender,fbBoost);
        ArrayList<Product> dresses = new ArrayList<>();
        File file = new File("Dresses.txt");
        if(file.exists()) {
            try (ObjectInputStream os = new ObjectInputStream(new FileInputStream(file))){
                dresses = (ArrayList<Product>) os.readObject();
            } catch (Exception ig){}
        }
        writeToFile(dress);

        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Dress Information saved in txt file", ButtonType.OK);
        alert.showAndWait();

        //IO.println(name + " " +  dtype + " " + size+ " " + selectedGender+ " " + color+ " " + price+" " + details + " " + date+ " " + quantity + " " + discount + " " +selectedGender);

    }

    private void writeToFile(Product d) {
        try (RandomAccessFile raf = new RandomAccessFile(FILE, "rw")) {
            raf.seek(raf.length());
            raf.writeBytes(d.toFileString() + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void hideAllErrors() {
        dressNameErrorLabel.setVisible(false);

    }

    @FXML
    void showActionButton() {


    }

    @FXML
    void goToDress2() {

        HelloApplication.switchScene("dress02");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ObservableList<String> type = FXCollections.observableArrayList();
        type.add("Hoodie");
        type.add("Sweater");
        dtypeChoiceField.setItems(type);
        sizeComboField.getItems().addAll("MEDIUM", "LARGE");
        quantitySpinnerField.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0,500,1));
        priceSliderField.setMin(500);
        priceSliderField.setMax(5000);
        priceSliderField.setValue(500);
        hideAllErrors();
    }
}

