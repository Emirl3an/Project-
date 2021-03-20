package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.awt.*;

public class Main extends Application{

    Button Button;



    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("TEditor");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();

        Button button = new Button();
        button.setText("Save");

    }

    public static void main(String[] args) {
        launch(args);
    }
}







