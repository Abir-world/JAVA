package bd.edu.seu.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private static Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("admission.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage.setTitle("Application!");
        stage.setScene(scene);
        stage.show();
    }

    public static void switchChage (String fxmlFileName){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName+".fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 600);
            stage.setScene(scene);
        }catch(IOException e){
            IO.println("Failled");
            e.printStackTrace();
        }
    }

}