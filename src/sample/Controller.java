package sample;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Worker;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;



public class Controller implements Initializable {

    ObservableList<Contact> contacts = FXCollections.observableArrayList();

    public Controller () {

    }

    @FXML
    TextField nameField;
    @FXML
    TextField numberField;
    @FXML
    TextField emailField;


    public void addButton (){

    }
    public void removeButton (){
        System.out.println("removeButton");
    }
    public void dialoguePane (){
        System.out.println("dialoguePane");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        }

    }
}
