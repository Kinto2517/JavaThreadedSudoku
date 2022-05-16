package Samurai;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

@Override
public void start(Stage primaryStage) throws Exception{


    Parent root = FXMLLoader.load(getClass().getResource("gui.fxml"));
    primaryStage.setTitle("Samurai");
    primaryStage.setScene(new Scene(root,1500,840));
    primaryStage.initStyle(StageStyle.UNDECORATED);
    primaryStage.show();
    test a =new test();



}

    public static void main(String[] args) {
       launch(args);

    }



}


