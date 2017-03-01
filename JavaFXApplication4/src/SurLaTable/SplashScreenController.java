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
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jeremiah
 */
public class SplashScreenController implements Initializable {

    @FXML
    Pane Logo;
    
    @FXML
    private void Start(ActionEvent event) throws IOException{
     Stage stage; 
     Parent root;

    //get reference to the button's stage         
    stage=(Stage) Logo.getScene().getWindow();
    //load up OTHER FXML document
    root = FXMLLoader.load(getClass().getResource("Login.fxml"));
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
