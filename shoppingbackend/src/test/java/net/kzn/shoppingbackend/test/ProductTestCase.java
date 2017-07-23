package net.kzn.shoppingbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.kzn.shoppingbackend.dao.ProductDAO;
import net.kzn.shoppingbackend.dto.Product;

public class ProductTestCase {

	private static AnnotationConfigApplicationContext context;

	private static ProductDAO productDAO;

	private Product product;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.kzn.shoppingbackend");
		context.refresh();
		productDAO = (ProductDAO) context.getBean("ProductDAO");

	}
	/*
	 * @Test public void testCrudProduct() { product = new Product();
	 * 
	 * 
	 * product.setName("Helmi");
	 * product.setDescription("this is some description of senior category");
	 * product.setBrand("Oppo"); product.setUnitPrice(25000);
	 * 
	 * product.setActive(true); product.setCategoryId(3); product.setSupplierId(3);
	 * 
	 * 
	 * assertEquals("Successfully Add of Category", true, productDAO.add(product));
	 * 
	 * product =productDAO.get(2);
	 * 
	 * product.setName("Samsung Galaxy s7");
	 * 
	 * assertEquals("Successfully Add of Category", true,
	 * productDAO.update(product));
	 * 
	 * 
	 * assertEquals("Delete of Product",true,productDAO.delete(product));
	 * 
	 * assertEquals("Successfully fetch of list Category", 8,
	 * productDAO.list().size());
	 * 
	 * }
	 */

	@Test
	public void testListActiveProduct() {
		assertEquals("Successfully fetch of list active Product", 2, productDAO.getLatestActiveProducts(2).size());
	}

}
