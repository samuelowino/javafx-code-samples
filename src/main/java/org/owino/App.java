package org.owino;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.owino.layouts.BorderPaneLayout;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        try{
            var scene = new Scene(BorderPaneLayout.drawBorderPane(),600,600);
            stage.setScene(scene);
            stage.setMinHeight(600);
            stage.setMinWidth(600);
            stage.setTitle(SystemInfo.appName());
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

}