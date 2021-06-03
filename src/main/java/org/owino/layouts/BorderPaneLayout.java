package org.owino.layouts;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.net.URISyntaxException;

/**
 * =====================
 * JavaFx Border Pane
 * =====================
 * The Border Pane layout pane provides five regions in which to place nodes:
 * top,
 * bottom,
 * left,
 * right and center.
 *
 * If your application does not need one of the regions, you do not need to define it
 * and no space is allocated for it.
 *
 * ================================================================
 * =                        TOP                                   =
 * ================================================================
 * =        =                                       =             =
 * = LEFT   =              CENTER                   = RIGHT       =
 * =        =                                       =             =
 * =        =                                       =             =
 * ================================================================
 * =                       BOTTOM                                 =
 * ================================================================
 *
 *
 * If the window is larger than the space needed for the contents of each region,
 * the extra space is given to the center region by default.
 *
 * If the window is smaller than the space needed for the contents of each region,
 * the regions might overlap.
 *
 */

public class BorderPaneLayout {

    public static BorderPane drawBorderPane() throws URISyntaxException {
        BorderPane borderPane = new BorderPane();

        HBox hBox = HBoxLayout.addHBox();
        VBox vBox = VBoxLayout.addVBox();

        borderPane.setTop(hBox);
        borderPane.setLeft(vBox);

        StackPaneLayout.addStackPane(hBox);

        borderPane.setCenter(new GridPaneLayout().addGridPane());
        borderPane.setRight(FlowPaneLayout.addFlowPane());

        return borderPane;
    }
}
