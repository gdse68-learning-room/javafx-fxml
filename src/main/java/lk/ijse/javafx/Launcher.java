package lk.ijse.javafx;

/*
    @author DanujaV
    @created 9/26/23 - 10:10 AM   
*/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //load the scene graph to the start method
        AnchorPane rootNode = FXMLLoader.load(this.getClass().getResource("/view/dashboard.fxml"));

        //create a new Scene
        Scene scene = new Scene(rootNode);

        //set scene to the primary stage
        stage.setScene(scene);

        //set title and get center on screen stage
        stage.setTitle("Dashboard");
        stage.centerOnScreen();

        //show stage to the crowd
        stage.show();
    }
}
