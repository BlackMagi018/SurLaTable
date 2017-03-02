/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SurLaTable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jeremiah
 */
public class SelectorController implements Initializable {

    @FXML
    private Button FMN;
    @FXML
    private Button FAT;
    
    
    @FXML
    private void FeedMeNow(ActionEvent event) throws IOException{
     Stage stage; 
     Parent root;

    //get reference to the button's stage         
    stage=(Stage) FMN.getScene().getWindow();
    //load up OTHER FXML document
    root = FXMLLoader.load(getClass().getResource("FeedMeNow.fxml"));
    //create a new scene with root and set the stage
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    }
    
    @FXML
    private void FindATable(ActionEvent event) throws IOException{
     Stage stage; 
     Parent root;

    //get reference to the button's stage         
    stage=(Stage) FMN.getScene().getWindow();
    //load up OTHER FXML document
    root = FXMLLoader.load(getClass().getResource("SearchStart.fxml"));
    //create a new scene with root and set the stage
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
