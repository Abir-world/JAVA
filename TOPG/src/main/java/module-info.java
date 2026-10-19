module bd.edu.seu.app {
    requires javafx.controls;
    requires javafx.fxml;


    opens bd.edu.seu.app to javafx.fxml;
    exports bd.edu.seu.app;

    opens bd.edu.seu.app.controller to javafx.fxml;
    exports bd.edu.seu.app.controller;
}