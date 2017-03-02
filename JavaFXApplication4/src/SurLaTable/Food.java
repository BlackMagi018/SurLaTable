/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SurLaTable;


import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Jeremiah
 */
public class Food {
    
    private final SimpleStringProperty name = new SimpleStringProperty("");
    private final SimpleStringProperty cuisine = new SimpleStringProperty("");
    private final SimpleStringProperty time = new SimpleStringProperty("");
    private final SimpleStringProperty price = new SimpleStringProperty("");
    
    public Food() {
        this("", "", "","");
    }
    
    public Food(String n, String c,String t, String p){
     setName(n);
     setCuisine(c);
     setTime(t);
     setPrice(p);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public String getCuisine() {
        return cuisine.get();
    }

    public void setCuisine(String cuisine) {
        this.cuisine.set(cuisine);
    }

    public String getTime() {
        return time.get();
    }

    public void setTime(String time) {
        this.time.set(time);
    }

    public String getPrice() {
        return price.get();
    }

    public void setPrice(String price) {
        this.price.set(price);
    }   
}
