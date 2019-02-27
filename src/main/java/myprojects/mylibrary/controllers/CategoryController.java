package myprojects.mylibrary.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import myprojects.mylibrary.modelFx.CategoryFx;
import myprojects.mylibrary.modelFx.CategoryModel;
import myprojects.mylibrary.utils.exceptions.ApplicationException;

public class CategoryController {


    @FXML
    private Button addCategoryButton;

    @FXML
    private TextField categoryTextField;

    @FXML
    private ComboBox<CategoryFx> categoryComboBox;

    private CategoryModel categoryModel;

    @FXML
    public void initialize(){
        this.categoryModel = new CategoryModel();
        initBindings();
    }

    private void initBindings() {
        addCategoryButton.disableProperty().bind(categoryTextField.textProperty().isEmpty());
    }

    public void addCategoryOnAction() throws ApplicationException {
        categoryModel.saveCategoryInDataBase(categoryTextField.getText());
        categoryTextField.clear();
    }
}
