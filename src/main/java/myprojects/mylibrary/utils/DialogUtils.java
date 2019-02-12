package myprojects.mylibrary.utils;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;

import java.util.Optional;
import java.util.ResourceBundle;

public class DialogUtils {

    static ResourceBundle bundle = FxmlUtils.getResourceBundles();

    public static void dialogAboutApplication(){
        Alert informationAlert = new Alert(Alert.AlertType.INFORMATION);
        informationAlert.setTitle(bundle.getString("about.header"));
        informationAlert.setHeaderText(bundle.getString("about.header"));
        informationAlert.setContentText(bundle.getString("about.content"));
        informationAlert.showAndWait();
    }

    public static Optional<ButtonType> dialogExitConfirmation(){
        Alert confirmationDialog = new Alert(Alert.AlertType.CONFIRMATION);
        confirmationDialog.setHeaderText(bundle.getString("exit.header"));
        confirmationDialog.setTitle(bundle.getString("exit.title"));
        Optional<ButtonType> result = confirmationDialog.showAndWait();
        return result;
    }

    public static void errorDialog(String error){
        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
        errorAlert.setTitle(bundle.getString("error.title"));
        errorAlert.setHeaderText(bundle.getString("error.header"));
        errorAlert.showAndWait();
        TextArea textArea = new TextArea(error);
        errorAlert.getDialogPane().setContent(textArea);


    }


}
