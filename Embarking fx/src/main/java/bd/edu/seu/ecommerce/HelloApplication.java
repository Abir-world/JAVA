package bd.edu.seu.ecommerce;

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
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dress01.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 600);
        stage.setTitle("website!");
        stage.setScene(scene);
        stage.show();
    }

    public static void switchScene(String filename){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(filename+".fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 600);
            stage.setScene(scene);
        }catch (IOException e){
            IO.println("failled");
            e.printStackTrace();
        }

    }
}
