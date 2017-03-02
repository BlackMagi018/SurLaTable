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
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.*;

/**
 * FXML Controller class
 *
 * @author Jeremiah
 */
public class LoginController implements Initializable {
    
    
    List<String>users;
    @FXML
    private TextField logUser;
    @FXML
    private PasswordField logPass;
    @FXML
    private TextField regFN;
    @FXML
    private TextField regUser;
    @FXML
    private TextField regPass1;
    @FXML
    private TextField regPass2;
    @FXML
    private Button logInBtn;
    @FXML
    private Button regBtn;
    @FXML
    private Text errorTxt;
    
    @FXML
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
