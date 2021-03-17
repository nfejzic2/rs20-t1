package ba.unsa.etf.rs.tutorial1;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class MainController {
    public Label helloWorld;
    public GridPane gridPane;


    public void sayHelloWorld(ActionEvent actionEvent) {
        helloWorld.setText("Hello World!");
        gridPane.getStyleClass().add("new-background");
    }
}
