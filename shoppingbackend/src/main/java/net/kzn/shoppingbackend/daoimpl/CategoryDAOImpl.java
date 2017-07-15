package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

public class CategoryDAOImpl implements CategoryDAO{
	
	private static List<Category> categories =new ArrayList<>();
	
	static {
		Category category=new Category();
		category.setId(1);
		category.setName("Senior");
		category.setDescription("this is some description of senior category");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		category.setId(1);
		category.setName("Junior");
		category.setDescription("this is some description of senior category");
		category.setImageURL("CAT_2.png");
		
		category.setId(1);
		category.setName("Cadet");
		category.setDescription("this is some description of senior category");
		category.setImageURL("CAT_3.png");
		
		category.setId(1);
		category.setName("minimum");
		category.setDescription("this is some description of senior category");
		category.setImageURL("CAT_4.png");
		
		category.setId(1);
		category.setName("ecole");
		category.setDescription("this is some description of senior category");
		category.setImageURL("CAT_5.png");
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
