package com.project.ekart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.ekart.dao.CustomerProductDAO;
import com.project.ekart.model.Exchange;
import com.project.ekart.model.Product;

@Service(value = "customerProductService")
@Transactional
public class CustomerProductServiceImpl implements CustomerProductService {

	@Autowired
	private CustomerProductDAO customerProductDAO;
	
	@Override
	public List<Product> getAllProducts() throws Exception {

		List<Product> products =null;
		products = customerProductDAO.getAllProducts();
		return products;	
		
	}
	
	@Override
	public List<Exchange> getAllExchangeProduct() throws Exception{
		
		List<Exchange> exchange = null;
		exchange = customerProductDAO.getAllExchangeProduct();
		return exchange;
	}
}
