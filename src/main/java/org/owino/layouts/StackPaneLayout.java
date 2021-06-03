package org.owino.layouts;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 * =========================
 * JavaFX StackPane Layout
 * =========================
 * The stackpane layout places all of the nodes within a single stack
 * with each new node added on top of the previous node.
 * This layout model provides an easy wau to overlay text on a shape or image
 * or to overlap common shapes to create complex shape.
 * <p>
 * For example, the help icon is create by stacking a question mark on top of a
 * rectangle with a gradient background.
 * <p>
 * =========
 * =   ?   =
 * =========
 */
public class StackPaneLayout {

    public static void addStackPane(HBox parentHBox) {
        StackPane stackPane = new StackPane();

        Rectangle helpIcon = new Rectangle(30, 25);

        helpIcon.setFill(
                new LinearGradient(
                        0, 0, 0, 1,
                        true,
                        CycleMethod.NO_CYCLE,
                        new Stop[]{
                                new Stop(0, Color.web("#4977A3")),
                                new Stop(0.5, Color.web("#B0C6DA")),
                                new Stop(1, Color.web("#9CB6CF"))
                        }
                )
        );

        helpIcon.setStroke(Color.web("#D0E6FA"));
        helpIcon.setArcHeight(3.5);
        helpIcon.setArcWidth(3.5);

        Text helpText = new Text("?");
        helpText.setFont(Font.font("Verdana", FontWeight.BOLD, 18));
        helpText.setFill(Color.WHITE);
        helpText.setStroke(Color.web("#7080A0"));

        stackPane.getChildren().addAll(helpIcon, helpText);
        stackPane.setAlignment(Pos.CENTER_RIGHT);
        StackPane.setMargin(helpText, new Insets(0,10,0,0)); // center the "?" symbol

        parentHBox.getChildren().add(stackPane);
        HBox.setHgrow(stackPane, Priority.ALWAYS);
    }
}
