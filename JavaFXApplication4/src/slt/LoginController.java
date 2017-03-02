/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slt;

import java.io.IOException;
import java.net.URL;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Jeremiah Logan, Carter Garety, Jordan Ward
 */
public class LoginController implements Initializable {
    
    /*List of authorized users and their passwords */
    List<String>users;
    @FXML
    /*Text Field for Registered Users Login */
    private TextField logUser;
    @FXML
    /*Text Field for Registered Users Password */
    private PasswordField logPass;
    @FXML
    /*Text Field for New Users Full Name */
    private TextField regFN;
    @FXML
    /*Text Field for New Users Username */
    private TextField regUser;
    @FXML
    /*Text Field for New Users Password */
    private TextField regPass1;
    @FXML
    /*Text Field to confirm Password */
    private TextField regPass2;
    @FXML
    /*Login Button */
    private Button logInBtn;
    @FXML
    /*Register Button */
    private Button regBtn;
    @FXML
    /*Text object to display errors */
    private Text errorTxt;
    
    @FXML
    /**
     * Creates the next scene in the flow
     * when the button is clicked on
     */
    private void handleLogin(ActionEvent event) throws IOException{
     Stage stage; 
     Parent root;
     if(event.getSource()==logInBtn){
         String s = logUser.getText()+":"+logPass.getText();
        if(users.contains(s) == true){ 
        //get reference to the button's stage         
        stage=(Stage) logInBtn.getScene().getWindow();
        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getResource("Selector.fxml"));
        //create a new scene with root and set the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }
        else{
            errorTxt.setText("Username/Password Not Found");
            }
        }
    }
    
    @FXML
    /**
     * Creates the next scene in the flow
     * when the button is clicked on
     */
    private void handleRegister(ActionEvent event) throws IOException{
     Stage stage = new Stage(); 
     Parent root;
     if(event.getSource()==regBtn){
         if(regFN.getLength() > 5 && regUser.getLength() > 5 && regPass1.getLength() > 8 && regPass1.getText().equals(regPass2.getText())){
         String s = regUser.getText()+":"+regPass2.getText();
         users.add(s);
        //get reference to the button's stage
        stage = (Stage) logInBtn.getScene().getWindow();
        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getResource("Selector.fxml"));
        //create a new scene with root and set the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();   
        }
         else{
             errorTxt.setText("Unable to Register:Missing Parameters");
             }
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        List<String>users = new ArrayList<String>();
        users.add("User:Pass");
    }
    
}
