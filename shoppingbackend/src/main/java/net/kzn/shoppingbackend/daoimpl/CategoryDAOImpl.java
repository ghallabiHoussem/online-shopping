package net.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.kzn.shoppingbackend.dao.CategoryDAO;
import net.kzn.shoppingbackend.dto.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO{
	
	@Autowired
	SessionFactory sessionFactory;
	
	
	
	@Override
	public List<Category> list() {
		
		String selectCategoryActive = "From Category where active = :active";
		Query query =sessionFactory.getCurrentSession().createQuery(selectCategoryActive); 
		query.setParameter("active", true);
		
		return  query.getResultList();
	}

	@Override
	public Category getById(int id) {
		
//		for (Category category : categories) {
//			if (category.getId()== id) {
//				return category;
//			}
//		}
		
		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	@Override

	public boolean add(Category category) {
		
		
		try {
			sessionFactory.getCurrentSession().persist(category);
			
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
		
	}

	@Override
	public boolean update(Category category) {
		try {
			sessionFactory.getCurrentSession().update(category);
			
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(Category category) {
		category.setActive(false);
		try {
			
			sessionFactory.getCurrentSession().update(category);
			
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
