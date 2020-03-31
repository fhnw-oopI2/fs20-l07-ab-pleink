package ch.fhnw.oop2.module07.ab2;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent rootPanel = new ApplicationUI();

        Scene scene = new Scene(rootPanel);

        primaryStage.setTitle("AB 2");
        primaryStage.setScene(scene);
        primaryStage.setWidth(400);
        primaryStage.setHeight(200);

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
