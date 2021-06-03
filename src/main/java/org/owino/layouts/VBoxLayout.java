package org.owino.layouts;

import javafx.geometry.Insets;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 * =====================
 * JavaFX VBox layout.
 * =====================
 * The VBox layout pane is similar to the HBox layout pane,
 * except that the nodes are arranged in a single column.
 * <p>
 * ========================
 * = Data                 =
 * =    Sales             =
 * =    Marketing         =
 * =    Distribution      =
 * =    Costs             =
 * =                      =
 * ========================
 */
public class VBoxLayout {

    public static VBox addVBox() {
        VBox vBox = new VBox();
        int padding = 10;
        vBox.setPadding(new Insets(padding));
        vBox.setSpacing(8);

        Text menuTitle = new Text("Data");
        menuTitle.setFont(Font.font("Aerial", FontWeight.BOLD, 14));

        vBox.getChildren().add(menuTitle);

        Hyperlink options[] = new Hyperlink[]{
                new Hyperlink("Sales"),
                new Hyperlink("Marketing"),
                new Hyperlink("Distribution"),
                new Hyperlink("Costs")
        };

        for (int i = 0; i < options.length; i++) {
            VBox.setMargin(options[i], new Insets(0, 0, 0, 8));
            vBox.getChildren().add(options[i]);
        }

        return vBox;
    }
}
