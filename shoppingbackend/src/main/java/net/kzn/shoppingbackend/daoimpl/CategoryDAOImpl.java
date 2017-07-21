package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO{
	
	private static List<Category> categories =new ArrayList<>();
	
	static {
		Category category=new Category();
		category.setId(1);
		category.setName("Senior");
		category.setDescription("this is some description of senior category");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		category=new Category();
		category.setId(2);
		category.setName("Junior");
		category.setDescription("this is some description of senior category");
		category.setImageURL("CAT_2.png");
		categories.add(category);
		category=new Category();
		category.setId(3);
		category.setName("Cadet");
		category.setDescription("this is some description of senior category");
		category.setImageURL("CAT_3.png");
		categories.add(category);
		category=new Category();
		category.setId(4);
		category.setName("minimum");
		category.setDescription("this is some description of senior category");
		category.setImageURL("CAT_4.png");
		categories.add(category);
		category=new Category();
		category.setId(5);
		category.setName("ecole");
		category.setDescription("this is some description of senior category");
		category.setImageURL("CAT_5.png");
		categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category getById(long id) {
		
		for (Category category : categories) {
			if (category.getId()== id) {
				return category;
			}
		}
		return null;
	}

}
