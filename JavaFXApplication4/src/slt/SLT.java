package slt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Application Driver
 * @author Jeremiah Logan, Carter Garety, Jordan Ward
 */
public class SLT extends Application {
    
    @Override
    /**
     * Creates the scenes and displays it 
     */
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("SplashScreen.fxml"));
        Scene splash = new Scene(root);
        stage.setTitle("Sur La Table");
        stage.setScene(splash);
        stage.show();
    }

    /**
     * Launches the program
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
}
}
