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
    @FXML
    List<String>Users = new ArrayList<String>();
    @FXML
    private TextField LogUser;
    @FXML
    private PasswordField LogPass;
    @FXML
    private TextField RegFN;
    @FXML
    private TextField RegUser;
    @FXML
    private TextField RegPass1;
    @FXML
    private TextField RegPass2;
    @FXML
    private Button LogInBtn;
    @FXML
    private Button RegBtn;
    @FXML
    private Text ErrorTxt;
    
    @FXML
    private void handleLogin(ActionEvent event) throws IOException{
     Stage stage; 
     Parent root;
     
     if(event.getSource()==LogInBtn){
         String s = LogUser.getText()+":"+LogPass.getText();
        if(Users.contains(s) == true){ 
        //get reference to the button's stage         
        stage=(Stage) LogInBtn.getScene().getWindow();
        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getResource("Selector.fxml"));
        //create a new scene with root and set the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        }
        else{
            ErrorTxt.setText("Username/Password Not Found");
            }
        }
    }
    
    @FXML
    private void handleRegister(ActionEvent event) throws IOException{
     Stage stage; 
     Parent root;
     
     if(event.getSource()==RegBtn){
         if(RegFN.getLength() > 5 && RegUser.getLength() > 5 && RegPass1.getLength() > 8 && RegPass1.getText().equals(RegPass2.getText())){
         String s = RegUser.getText()+":"+RegPass2.getText();
         Users.add(s);
        //get reference to the button's stage         
        stage=(Stage) LogInBtn.getScene().getWindow();
        //load up OTHER FXML document
        root = FXMLLoader.load(getClass().getResource("Selector.fxml"));
        //create a new scene with root and set the stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();   
        }
         else{
             ErrorTxt.setText("Unable to Register:Missing Parameters");
         }
    }
    }
    
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Users.add("User:Pass");
    }
    
}
