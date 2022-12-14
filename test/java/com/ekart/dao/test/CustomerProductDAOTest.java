package com.ekart.dao.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.project.ekart.dao.CustomerProductDAO;
import com.project.ekart.model.Exchange;
import com.project.ekart.model.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@Transactional
@Rollback(true)
public class CustomerProductDAOTest {
	@Autowired
	CustomerProductDAO customerProductDAO;
	@Test
	public void getAllProductsValid(){
		List<Product> products=new ArrayList<>();
		Product product=new Product();
		products.add(product);
		
		Assert.assertNotNull(customerProductDAO.getAllProducts());
	}
	
	@Test
	public void getAllExchangeProductsValid(){
		List<Exchange> exchanges=new ArrayList<>();
		Exchange exchange=new Exchange();
		exchanges.add(exchange);
		
		Assert.assertNotNull(customerProductDAO.getAllExchangeProduct());
	}
	

}
