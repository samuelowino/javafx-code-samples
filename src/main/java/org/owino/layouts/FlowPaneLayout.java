package org.owino.layouts;

import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;

import java.util.concurrent.Flow;

/**
 * ==============================
 * JavaFX FlowPane Layout
 * ==============================
 * The nodes within a FlowPane layout are laid out consecutively and
 * wrap at the boundary set for the pane.
 * <p>
 * Nodes can flow vertically (in columns) or horizontally (in rows).
 * <p>
 * A vertical flow pane wraps at the height boundary of the pane.
 * <p>
 * A horizontal flow pane wraps at the width boundary of the pane.
 */
public class FlowPaneLayout {
    public static FlowPane addFlowPane() {
        FlowPane flowPane = new FlowPane();
        flowPane.setPadding(new Insets(5, 0, 5, 0));
        flowPane.setVgap(4);
        flowPane.setHgap(4);
        flowPane.setPrefWrapLength(170);
        flowPane.setStyle("-fx-background-color: DAE6F3;");

        ImageView pages[] = new ImageView[8];

        for (int i = 0; i < 8; i++) {
            pages[i] = new ImageView(
                    new Image(FlowPaneLayout.class.getClassLoader().getResource("chart_" + (i + 1) + ".png").toExternalForm())
            );
            flowPane.getChildren().add(pages[i]);
        }

        return flowPane;
    }
}
