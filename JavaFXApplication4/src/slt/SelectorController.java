/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slt;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jeremiah Logan, Carter Garety, Jordan Ward
 */
public class SelectorController implements Initializable {

    @FXML
    /*Feed Me Now Button */
    private Button fmn;
    
    @FXML
    /*Find A Table Button*/
    private Button fat;
    
    @FXML
    /**
     * Creates the next scene in the flow
     * when the button is clicked on
     */
    private void feedMeNow(ActionEvent event) throws IOException{
     Stage stage; 
     Parent root;
    //get reference to the button's stage         
    stage=(Stage) fmn.getScene().getWindow();
    //load up OTHER FXML document
    root = FXMLLoader.load(getClass().getResource("FeedMeNow.fxml"));
    //create a new scene with root and set the stage
    Scene scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
    }
    
    @FXML
    /**
     * Creates the next scene in the flow
     * when the button is clicked on
     */
    private void findATable(ActionEvent event) throws IOException{
     Stage stage; 
     Parent root;
    //get reference to the button's stage         
    stage=(Stage) fat.getScene().getWindow();
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
