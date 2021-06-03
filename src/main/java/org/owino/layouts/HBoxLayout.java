package org.owino.layouts;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 * =====================
 * JavaFX HBox Layout
 * =====================
 * The HBox layout pane provides an easy way for arranging a series of nodes
 * in a single row.
 * <p>
 * ============================================================
 * =    ------------                --------------            =
 * =    -          -                -            -            =
 * =    -  Button  -                -  Button    -            =
 * =    -          -                -            -            =
 * =    ------------                --------------            =
 * =                                                          =
 * ============================================================
 * <p>
 * The padding can be set to manage the distance between the nodes and the edges
 * of the HBox pane. Spacing can be set to manage the distance between the nodes.
 * The style can be set to change the background color.
 */
public class HBoxLayout {

    public static HBox addHBox() {
        HBox hBox = new HBox();

        int topPadding = 15;
        int bottomPadding = 15;
        int rightPadding = 12;
        int leftPadding = 12;

        hBox.setPadding(new Insets(topPadding, rightPadding, bottomPadding, leftPadding));
        hBox.setSpacing(10);
        hBox.setStyle("-fx-background-color: #336699;");

        Button startButton = new Button("Current Prices");
        startButton.setPrefSize(100, 20);

        Button stopButton = new Button("Projected Cost");
        stopButton.setPrefSize(100, 20);

        hBox.getChildren().addAll(startButton, stopButton);

        return hBox;
    }
}
