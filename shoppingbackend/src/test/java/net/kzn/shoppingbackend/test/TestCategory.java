package net.kzn.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

public class TestCategory {

	private static AnnotationConfigApplicationContext applicationContext;

	private static CategoryDAO categoryDAO;

	private Category category;

	@BeforeClass
	public static void Init() {

		applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.scan("net.kzn.shoppingbackend");
		applicationContext.refresh();

		categoryDAO = (CategoryDAO) applicationContext.getBean("categoryDAO");

	}

	// @Test
	// public void testAddCategory(){
	//
	//
	//
	// category=new Category();
	//
	// category.setName("ecole");
	// category.setDescription("this is some description of senior category");
	// category.setImageURL("CAT_5.png");
	////
	// assertEquals("Successfully Add of Category", true,categoryDAO.add(category));
	//
	//
	// }

	/*
	 * @Test public void testGetCategory(){
	 * 
	 * 
	 * 
	 * category=categoryDAO.getById(3);
	 * 
	 * assertEquals("Successfully fetch of Category","Cadet",category.getName());
	 * 
	 * 
	 * }
	 */
	/*
	 * @Test public void testupdateCategory(){
	 * 
	 * 
	 * 
	 * category=categoryDAO.getById(3); category.setName("cadddddeeeeet");
	 * 
	 * assertEquals("Successfully fetch of Category",true,categoryDAO.update(
	 * category));
	 * 
	 * 
	 * }
	 */
	/*
	 * @Test public void testupdateCategory(){
	 * 
	 * 
	 * 
	 * category=categoryDAO.getById(3);
	 * 
	 * assertEquals("Delete of Category",true,categoryDAO.delete(category));
	 * 
	 * 
	 * }
	 */
	/*
	 * @Test public void testListCategory(){
	 * 
	 * 
	 * assertEquals("Successfully fetch of list Category",4,categoryDAO.list().size(
	 * ));
	 * 
	 * 
	 * }
	 */

	@Test
	public void testCrudCategory() {
		
		category = new Category();

		category.setName("ecole");
		category.setDescription("this is some description of senior category");
		category.setImageURL("CAT_1.png");

		assertEquals("Successfully Add of Category", true, categoryDAO.add(category));
		
		category = new Category();

		category.setName("cadet");
		category.setDescription("this is some description of Cadet category");
		category.setImageURL("CAT_2.png");

		assertEquals("Successfully Add of Category", true, categoryDAO.add(category));
		
		Category category = categoryDAO.getById(1);
	
		assertEquals("Delete of Category",true,categoryDAO.delete(category));

		assertEquals("Successfully fetch of list Category", 1, categoryDAO.list().size());

	}
}
