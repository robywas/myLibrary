package myprojects.mylibrary.modelFx;

import myprojects.mylibrary.database.dao.CategoryDao;
import myprojects.mylibrary.database.dbutlis.DbManager;
import myprojects.mylibrary.database.models.Category;
import myprojects.mylibrary.utils.exceptions.ApplicationException;

public class CategoryModel {



    public void saveCategoryInDataBase(String name) throws ApplicationException {
        CategoryDao categoryDao = new CategoryDao();
        Category category = new Category();
        category.setName(name);
        categoryDao.createOrUpdate(category);
        DbManager.closeConnectionSource();
    }

}
