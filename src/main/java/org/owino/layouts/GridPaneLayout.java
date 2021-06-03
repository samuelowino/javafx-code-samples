package org.owino.layouts;

import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

/**
 * ==========================
 * JavaFX Grid Pane layout
 * ==========================
 * The GridPane layout enabled you to create a flexible grid of rows and columns
 * in which to lay out nodes.
 * Nodes can be placed in any cell in the grid and can span cells as needed.
 *
 * A child may be placed anywhere within the grid and may span multiple rows/columns
 *
 * =========================================================
 * |    cell |  cell   |   cell  |               |  cell  |
 * ========= ========= ========= = spanning cell ==========
 * |    cell |  cell   |   cell  |              |  cell   |
 * ========= ========= ========= ========= ================
 * |   spanning  cell |   cell  |  cell   |  cell  |  cell|
 * ========= ========= ========= ========= ================
 * |    cell |  cell   |   cell  |  cell   |  cell  | cell|
 * ========= ========= ========= ========= ================
 *
 * Grid Constraints
 * =====================
 * A child's placement within the grid is defined by it's layout constraints
 *
 * ------------------------------------------------------------------------------------------------------------
 * columnIndex constraint   ==> integer ==> column where child's layout area starts
 * ------------------------------------------------------------------------------------------------------------
 * rowIndex constraint      ==> integer ==> row where child's layout area starts
 * ------------------------------------------------------------------------------------------------------------
 * columnSpan               ==> integer ==> the number of columns that child's layout area spans horizontally.
 * ------------------------------------------------------------------------------------------------------------
 * rowSpan                  ==> integer ==> the number of rows the child layout area spans vertical
 * ------------------------------------------------------------------------------------------------------------
 *
 *  Supported add() functions
 *  1. add(Node child, int columnIndex, int rowIndex)
 *              ==> Adds a child to the gridpane at the specified column,row position.
 *  2. add(Node child, int columnIndex, int rowIndex, int colspan, int rowspan)
 *              ==> Adds a child to the gridpane at the specified column,row position and spans.
 *
 */
public class GridPaneLayout {

    public static GridPane addGridPane() {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        int paddingTop = 0;
        int paddingRight = 10;
        int paddingBottom = 0;
        int paddingLeft = 10;

        gridPane.setPadding(new Insets(paddingTop, paddingRight, paddingBottom, paddingLeft));

        //Category in column 2, row 1
        Text category = new Text("Sales");
        category.setFont(Font.font("Aerial", FontWeight.BOLD, 20));
        gridPane.add(category, 1, 0);

        //Title in column 3, row 1
        Text chartTitle = new Text("Current year");
        chartTitle.setFont(Font.font("Aerial",FontWeight.BOLD,20));
        gridPane.add(chartTitle,2,0);

        //Subtitle in column 2-3, row 2
        Text chartSubtitle = new Text("Goods and Services");
        gridPane.add(chartSubtitle,1,1,2,1);

        //House icon in column 1, row 1-2
        ImageView imageView = new ImageView(
                new Image(GridPaneLayout.class.getResourceAsStream(
                        "images/house.png"
                ))
        );
        gridPane.add(imageView,0,0,1,2);

        //Left label in column 1 (bottom), row 3
        Text goodsPercent = new Text("Goods\n80%");
        GridPane.setValignment(goodsPercent, VPos.BOTTOM);
        gridPane.add(goodsPercent,0,2);

        //Chart in column 2-3, row 3
        ImageView imageChart = new ImageView(
                new Image(
                        GridPaneLayout.class.getResourceAsStream(
                                "images/pie_chart.png"
                        )
                )
        );
        gridPane.add(imageChart,1,2,2,1);

        //Right label in column 4 (top), row 3
        Text servicesPercent = new Text("Services\n20%");
        GridPane.setValignment(servicesPercent,VPos.TOP);
        gridPane.add(servicesPercent,3,2);

        return gridPane;
    }
}
