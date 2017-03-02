package slt;


import javafx.beans.property.SimpleStringProperty;

/**
 * Restaurant Data
 * @author Jeremiah Logan, Carter Garety, Jordan Ward
 */
public class Food {
    
    /** Name of the restaurant */
    private final SimpleStringProperty name = new SimpleStringProperty("");
    /** The Restaurant's Cuisine */
    private final SimpleStringProperty cuisine = new SimpleStringProperty("");
    /** Time range the restaurant is open*/
    private final SimpleStringProperty time = new SimpleStringProperty("");
    /** Price Point for the restaurant */
    private final SimpleStringProperty price = new SimpleStringProperty("");
    
    /**
     * Constructor creates a empty food object
     */
    public Food() {
        this("", "", "","");
    }
    
    /**
     * Constructor creates a food object and sets the
     * instance variables to the parameters passed to it.
     * @param n - name given
     * @param c - cuisine given
     * @param t - time range given
     * @param p - price point given
     */
    public Food(String n, String c,String t, String p){
     setName(n);
     setCuisine(c);
     setTime(t);
     setPrice(p);
    }

    /**
     * Returns the name of the restaurant
     * @return name's string value
     */
    public String getName() {
        return name.get();
    }

    /**
     * Changes the restaurant's name
     * @param name - restaurant's new name
     */
    public void setName(String name) {
        this.name.set(name);
    }
    
    /**
     * Returns the cuisine of the restaurant
     * @return cuisine's string value
     */
    public String getCuisine() {
        return cuisine.get();
    }

    /**
     * Changes the restaurant's cuisine
     * @param cuisine - restaurant's new cuisine
     */
    public void setCuisine(String cuisine) {
        this.cuisine.set(cuisine);
    }

    /**
     * Returns the time range of the restaurant
     * @return time's string value
     */
    public String getTime() {
        return time.get();
    }

    /**
     * Changes the restaurant's time
     * @param time - restaurant's new time range
     */
    public void setTime(String time) {
        this.time.set(time);
    }

    /**
     * Returns the price point of the restaurant
     * @return price's string value
     */
    public String getPrice() {
        return price.get();
    }

    /**
     * Changes the restaurant's price
     * @param price - restaurant's new price point
     */
    public void setPrice(String price) {
        this.price.set(price);
    }   
}
