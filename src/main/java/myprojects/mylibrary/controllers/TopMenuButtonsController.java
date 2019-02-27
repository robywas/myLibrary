package myprojects.mylibrary.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.ToggleGroup;

public class TopMenuButtonsController {


    public static final String LIBRARY_FXML = "/fxml/OpenLibrary.fxml";
    public static final String BOOKS_FXML = "/fxml/OpenBooks.fxml";
    public static final String STATS_FXML = "/fxml/OpenStats.fxml";
    public static final String ADD_BOOK_FXML = "/fxml/AddBook.fxml";
    public static final String ADD_CATEGORY_FXML = "/fxml/AddCategory.fxml";


    private MainController mainController;

    @FXML
    private ToggleGroup toggleButtons;

    @FXML
    public void openLibrary() {
        mainController.setCenter(LIBRARY_FXML);

    }

    @FXML
    public void openBooks() {
        mainController.setCenter(BOOKS_FXML);
    }

    @FXML
    public void openStats() {
        mainController.setCenter(STATS_FXML);
    }

    @FXML
    public void addBook() {
        resetToggleButtons();
        mainController.setCenter(ADD_BOOK_FXML);
    }

    @FXML
    public void addCategory() {
        resetToggleButtons();
        mainController.setCenter(ADD_CATEGORY_FXML);

    }

    public void setMainController(MainController mainController) {
        this.mainController = mainController;
    }

    private void resetToggleButtons() {
        if (toggleButtons.getSelectedToggle() != null)
            toggleButtons.getSelectedToggle().setSelected(false);
    }

}
