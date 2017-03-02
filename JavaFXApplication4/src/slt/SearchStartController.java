/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slt;

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
 * @author Jeremiah Logan, Carter Garety, Jordan Ward
 */
public class SearchStartController implements Initializable {

    @FXML
    private ChoiceBox cuisine;
    @FXML
    private DatePicker date;
    @FXML
    private ChoiceBox local;
    @FXML
    private Button searchBtn;
    
    @FXML
    /**
     * Enters the restaurant's the fit the
     * requested cuisine into the Restaurant
     * dropdown menu
     */
    private void setLocal(){
        String s = (String)cuisine.getValue();
        switch(s){
            case "American": local.setItems(FXCollections.observableArrayList
            ("Buffalo Wild Wings","Outback Steakhouse","Red Lobster"));
            break;
            case "Chinese": local.setItems(FXCollections.observableArrayList
            ("Panda Express","PF Chang's","Panda One"));
            break;
            case "Greek": local.setItems(FXCollections.observableArrayList
            ("Sheshco Grill","Zesty Gyros","Bosna Express","Chicago Style Gyro"));
            break;
            case "Italian": local.setItems(FXCollections.observableArrayList
            ("Mangiamo","Osteria Rossa","Uccello's","Peppino's Pizzeria"));
            break;
            case "Japanese": local.setItems(FXCollections.observableArrayList
            ("Mizu Sushi","Maru Sushi","Sushi Yama"));
            break;
            case "Mediterranean": local.setItems(FXCollections.observableArrayList
            ("Parsley Mediterranean Grill","Shiraz Grille","Le Kabob"));
            break;
            case "Mexican": local.setItems(FXCollections.observableArrayList
            ("El Aztecas","On the Border","Cantina Grill"));
            break;
            case "Thai": local.setItems(FXCollections.observableArrayList
            ("Aroy Thai","Erb Thai","Lai Thai Kitchen"));
            break;
            default: break;
        }
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cuisine.setItems(FXCollections.observableArrayList
        ("American","Chinese","Greek","Italian","Japanese","Mediterranean","Mexican","Thai"));
                
    }    
    
}
