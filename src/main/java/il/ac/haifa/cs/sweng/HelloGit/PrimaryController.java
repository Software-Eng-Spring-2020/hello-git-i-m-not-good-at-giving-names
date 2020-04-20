package il.ac.haifa.cs.sweng.HelloGit;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML
    void showAboutDialog(ActionEvent event) throws IOException {
    	Stage dialogStage = new Stage();
    	Parent parent = App.loadFXML("about_dialog");
    	if (parent == null) {
    		Alert alert = new Alert(AlertType.ERROR, "FXML loading error.");
    		alert.show();
    	}
    	Scene scene = new Scene(parent);
    	dialogStage.setScene(scene);
    	dialogStage.show();
    }

    @FXML // fx:id="clickBtn"
    private Button clickBtn; // Value injected by FXMLLoader

    @FXML // fx:id="field"
    private TextField field; // Value injected by FXMLLoader

    @FXML
    void click(ActionEvent event) {

    }
    
    // Pay attention to this example - You don't have to specify parameters on event handlers.
    @FXML
    void closeApp() {
    	System.exit(0);
    }

}
