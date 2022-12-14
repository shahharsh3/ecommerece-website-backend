package com.ekart.service.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.project.ekart.dao.CustomerProductDAO;
import com.project.ekart.model.Product;
import com.project.ekart.service.CustomerProductService;
import com.project.ekart.service.CustomerProductServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerProductServiceTest {
	@Mock
	private CustomerProductDAO productDAO;
	

	@InjectMocks
	private CustomerProductService productService=new CustomerProductServiceImpl();
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	
	@Test
	public void getAllProductsValid() throws Exception {
		
		List<Product> products=new ArrayList<Product>();
		Product product=new Product();
		product.setProductId(1);
		products.add(product);
		Mockito.when(productDAO.getAllProducts()).thenReturn(products);
		Assert.assertNotNull(productService.getAllProducts());
		
	}

}
