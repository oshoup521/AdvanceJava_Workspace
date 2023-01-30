package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Product;

@Repository // mandatory annotation to tell SC following is a spring bean containing DAL
public class ProductDaoImpl implements ProductDao {
	// dependency : SessionFactory
	@Autowired
	private SessionFactory factory;

	@Override
	public List<Product> getProductsByDesc(String key) {
		String jpql = "select p from Product p where p.description like : key";
		
		return factory.getCurrentSession().createQuery(jpql,Product.class)
				.setParameter("key", "%+key1+%").getResultList();
	}

}
