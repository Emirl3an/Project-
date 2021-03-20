package sample;
import com.sun.media.jfxmediaimpl.platform.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.datatransfer.Clipboard;
import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {



//    @FXML
//    private Button btn_copy;
    @FXML
    private Button btn_save;
    @FXML
    private Button btn_import;
    @FXML
    private Button btn_exit;
    @FXML
    private Button btn_arial;
    @FXML
    private Button btn_delet;
    @FXML
    private Button btn_tahoma;
    @FXML
    private Button btn_verdana;

    @FXML
    private TextArea ta;
    @FXML
    private Label Fonts;
    @FXML
    private Slider S;

    String taPath;
    public Controller() {
    }

    @FXML
    public void onClick_btn_save(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Save File");
        File selectedFile = chooser.showSaveDialog(stage);
        FileWriter FW = new FileWriter(selectedFile.getAbsolutePath());
        FW.write(ta.getText().toString());
        FW.close();
    }

    @FXML
    public void onClick_btn_import(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Open File");
        File selectedFile = chooser.showOpenDialog(stage);

        FileReader FR = new FileReader(selectedFile.getAbsolutePath().toString());
        BufferedReader BR = new BufferedReader(FR);

        StringBuilder sb = new StringBuilder();
        String myText = "";

        while((myText = BR.readLine())!= null){
            sb.append(myText + "\n");
        }
        ta.setText(sb.toString());

    }

    @FXML
    public void onClick_btn_exit(ActionEvent event){
        System.exit(0);
    }
    @FXML
    public void Font1 (ActionEvent event){
        ta.setStyle("-fx-font-size: 30pt;");
    }
    @FXML
    public void Font2 (ActionEvent event){
        ta.setStyle("-fx-font-size: 20pt;");
    }
    @FXML
    public void Font3 (ActionEvent event){
        ta.setStyle("-fx-font-size: 10pt;");
    }
    @FXML
    public void About (ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("TEditor");
        alert.setHeaderText(null);
        alert.setContentText("TEditor - is a program which helps to work easier with the text format documents. You can correct size, font in your text and etc.");
        alert.showAndWait();
    }
    @FXML
    public void About_U (ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("University information");
        alert.setHeaderText(null);
        alert.setContentText("International Atatürk-Alatoo University,\n is a private university located in Bishkek, Kyrgyzstan.\n It was established in 1996.The university offers graduate,\n master's, and doctoral programs. It is often ranked as one\n of Kyrgyzstan's most prestigious universities.");
        alert.showAndWait();
    }

    @FXML
    public void Arial(ActionEvent event){
        ta.setStyle("-fx-font-family: arial;");
    }
    @FXML
    public void Tahoma(ActionEvent event){
        ta.setStyle("-fx-font-family: tahoma;");
    }
    @FXML
    public void Verdana(ActionEvent event){
        ta.setStyle("-fx-font-family: verdana;");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}
