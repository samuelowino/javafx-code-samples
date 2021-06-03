package org.owino.windows;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.owino.SystemInfo;

public class SigninOptionsWindow extends Stage {

    private BorderPane borderPaneRootContainer;
    private Button googleSigninButton;
    private Button emailSigninButton;
    private CheckBox acceptTermsAndConditionsCheckbox;

    public SigninOptionsWindow() {
        initializeWindow();
        initializeResources();
        initializeListeners();
    }

    private void initializeWindow() {
        setTitle(SystemInfo.appName());
        setMinWidth(600);
        setMinHeight(600);
        setAlwaysOnTop(true);

        borderPaneRootContainer = new BorderPane();

        var windowScene = new Scene(borderPaneRootContainer);
        setScene(windowScene);
    }

    private void initializeResources() {
        googleSigninButton = new Button("Continue with Google");
        emailSigninButton = new Button("Continue with email");
        acceptTermsAndConditionsCheckbox = new CheckBox("Accept our terms and conditions");

        var vBoxRootContainer = new VBox();
        vBoxRootContainer.getChildren().add(googleSigninButton);
        vBoxRootContainer.getChildren().add(emailSigninButton);
        vBoxRootContainer.getChildren().add(acceptTermsAndConditionsCheckbox);

        borderPaneRootContainer.setCenter(vBoxRootContainer);
    }

    private void initializeListeners() {
        googleSigninButton.setOnMouseClicked((event) -> {
            System.out.println("Launch google signin flow....");
            close();
        });

        emailSigninButton.setOnMouseClicked((event) -> {
            System.out.println("Launch Email signin flow");
            close();
        });

        acceptTermsAndConditionsCheckbox.setOnMouseClicked((event) ->{
            System.out.println("Terms and conditions accepted " + acceptTermsAndConditionsCheckbox.isSelected());
        });
    }
}
