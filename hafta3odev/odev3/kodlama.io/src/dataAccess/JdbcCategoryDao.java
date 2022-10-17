package dataAccess;

import entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Kategori jdbc ile eklendi: " + category.getCategoryName());
		
	}

}
