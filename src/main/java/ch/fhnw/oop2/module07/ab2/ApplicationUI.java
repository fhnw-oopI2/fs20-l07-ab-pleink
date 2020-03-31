package ch.fhnw.oop2.module07.ab2;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.StringProperty;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {

    private Slider slider;
    private Label display;

    public ApplicationUI(){
        initializeControls();
        layoutControls();
    }

    private void initializeControls(){


        slider = new Slider(0, 10, 5);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(1);
        slider.setSnapToTicks(true);
        slider.valueProperty().addListener((
                (observable, oldValue, newValue) -> display.setText(observable.getValue().toString()))
        );

        display = new Label("5.0");

    }

    private void layoutControls(){
        setPadding(new Insets(10));
        setSpacing(20);
        setAlignment(Pos.CENTER);

        getChildren().addAll(display, slider);
    }
}
