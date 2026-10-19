module bd.edu.seu.ecommerce {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;



    opens bd.edu.seu.ecommerce to javafx.fxml;
    exports bd.edu.seu.ecommerce;

    opens bd.edu.seu.ecommerce.controller to javafx.fxml;
    exports bd.edu.seu.ecommerce.controller;


}