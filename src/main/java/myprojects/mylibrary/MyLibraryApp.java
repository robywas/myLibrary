package myprojects.mylibrary;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import myprojects.mylibrary.utils.FxmlUtils;

import java.util.ResourceBundle;

public class MyLibraryApp extends Application {

    public static final String BORDER_PANE_MAIN_FXML = "/fxml/BorderPaneMain.fxml";

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

//        Locale.setDefault(new Locale("en"));
        Pane borderPane = FxmlUtils.fxmlLoader(BORDER_PANE_MAIN_FXML);

        ResourceBundle bundle = ResourceBundle.getBundle("bundles.messages");

        Scene scene = new Scene(borderPane);

        primaryStage.setTitle(FxmlUtils.getResourceBundles().getString("title.application"));
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
