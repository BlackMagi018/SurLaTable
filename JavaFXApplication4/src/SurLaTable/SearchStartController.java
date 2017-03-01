/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SurLaTable;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;

/**
 * FXML Controller class
 *
 * @author Jeremiah
 */
public class SearchStartController implements Initializable {

    @FXML
    private ChoiceBox Cuisine;
    @FXML
    private DatePicker Date;
    @FXML
    private ChoiceBox Local;
    @FXML
    private Button SearchBtn;
    
    @FXML
    private void setLocal(){
        String s = (String)Cuisine.getValue();
        switch(s){
            case "American": Local.setItems(FXCollections.observableArrayList
            ("Buffalo Wild Wings","Outback Steakhouse","Red Lobster"));
            break;
            case "Chinese": Local.setItems(FXCollections.observableArrayList
            ("Panda Express","PF Chang's","Panda One"));
            break;
            case "Greek": Local.setItems(FXCollections.observableArrayList
            ("Sheshco Grill","Zesty Gyros","Bosna Express","Chicago Style Gyro"));
            break;
            case "Italian": Local.setItems(FXCollections.observableArrayList
            ("Mangiamo","Osteria Rossa","Uccello's","Peppino's Pizzeria"));
            break;
            case "Japanese": Local.setItems(FXCollections.observableArrayList
            ("Mizu Sushi","Maru Sushi","Sushi Yama"));
            break;
            case "Mediterranean": Local.setItems(FXCollections.observableArrayList
            ("Parsley Mediterranean Grill","Shiraz Grille","Le Kabob"));
            break;
            case "Mexican": Local.setItems(FXCollections.observableArrayList
            ("El Aztecas","On the Border","Cantina Grill"));
            break;
            case "Thai": Local.setItems(FXCollections.observableArrayList
            ("Aroy Thai","Erb Thai","Lai Thai Kitchen"));
            break;
        }
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Cuisine.setItems(FXCollections.observableArrayList
        ("American","Chinese","Greek","Italian","Japanese","Mediterranean","Mexican","Thai"));
                
    }    
    
}
