package business;

import java.util.ArrayList;

import core.logger.BaseLogger;
import dataAccess.CategoryDao;
import entities.Category;


public class CategoryManager {
	private CategoryDao categoryDao;
	private BaseLogger[] logger;
	private ArrayList<String> categoryNames = new ArrayList<>(); 
	
	public CategoryManager(CategoryDao categoryDao, BaseLogger[] logger) {
		this.categoryDao = categoryDao;
		this.logger = logger;
	}
	
	public void getCategorys() {
		System.out.println("Kategoriler: ");
		for(String categoryName : this.categoryNames) {
			System.out.println("    - " + categoryName);
		}
	}
	
	public void addCategory(Category category) throws Exception {
		if(this.categoryNames.size() > 0) {
			for(String categoryName : this.categoryNames) {
				if(categoryName == category.getCategoryName()) {
					throw new Exception("Bu kategori ismi daha önce kaydedilmiş!" + categoryName);
				}
			}
		}
		categoryDao.add(category);
		categoryNames.add(category.getCategoryName());
		for(BaseLogger log : logger) {
			log.log(category.getCategoryName());
		}
	}
}
