package ch.fhnw.oop2.module07.ab3;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.util.converter.NumberStringConverter;

public class ApplicationUI extends VBox {

    private Slider slider;
    private TextField display;

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

        display = new TextField();
        display.textProperty().bindBidirectional(slider.valueProperty(), new NumberStringConverter());

    }

    private void layoutControls(){
        setPadding(new Insets(10));
        setSpacing(20);
        setAlignment(Pos.CENTER);

        getChildren().addAll(display, slider);
    }
}
