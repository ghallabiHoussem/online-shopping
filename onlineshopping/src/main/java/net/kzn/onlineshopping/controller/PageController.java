package net.kzn.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	  @RequestMapping(value= {"/","/home","/index"})
	  public ModelAndView index() {
		  
		  ModelAndView mv = new ModelAndView("page");
		  mv.addObject("title", "Home");
		  mv.addObject("categories",categoryDAO.list());
		  mv.addObject("userClickHome", "true");
		return mv;
		  
	  }
	  
	  
	  @RequestMapping(value= {"/about"})
	  public ModelAndView about() {
		  
		  ModelAndView mv = new ModelAndView("page");
		  mv.addObject("title", "About Us");
		  mv.addObject("userClickAbout", "true");
		return mv;
		  
	  }
	  
	  @RequestMapping(value= {"/contact"})
	  public ModelAndView contact() {
		  
		  ModelAndView mv = new ModelAndView("page");
		  mv.addObject("title", "Contact Us");
		  mv.addObject("userClickContact", "true");
		return mv;
		  
	  }
	  
	  @RequestMapping(value= {"/listProducts"})
	  public ModelAndView listProducts() {
		  
		  ModelAndView mv = new ModelAndView("page");
		  mv.addObject("title", "All Products");
		  mv.addObject("categories",categoryDAO.list());
		  mv.addObject("userClickListProduct", "true");
		return mv;
		  
	  }
	  
	  @RequestMapping(value= {"/listProducts/category/{id}"})
	  public ModelAndView getCategoryByID(@PathVariable int id) {
		  
		  ModelAndView mv = new ModelAndView("page");
		  Category category = new Category();
		  
		  category=categoryDAO.getById(id);
		  
		  mv.addObject("title", category.getName());
		  mv.addObject("categories",categoryDAO.list());
		  mv.addObject("category",category);
		  mv.addObject("userClickOneProduct", "true");
		return mv;
		  
	  }
}
