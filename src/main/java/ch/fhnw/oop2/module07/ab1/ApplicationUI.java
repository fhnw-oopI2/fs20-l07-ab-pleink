package ch.fhnw.oop2.module07.ab1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;

public class ApplicationUI extends FlowPane {

    private Button addBtn;
    int counter = 1;

    public ApplicationUI(){
        initializeControls();
        layoutControls();
    }

    private void initializeControls(){
        addBtn = new Button("Add Label");
        addBtn.setOnAction(event -> generateLabel());
    }

    private void layoutControls(){
        setPadding(new Insets(10));
        setVgap(5);
        setHgap(5);
        getChildren().add(addBtn);
    }

    private void generateLabel(){
        getChildren().add(new Label("Label" + counter));
        counter++;
    }
}
