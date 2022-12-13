package com.project.ekart.dao;

import java.util.List;

import com.project.ekart.model.Exchange;
import com.project.ekart.model.Product;

public interface CustomerProductDAO {
	public List<Product> getAllProducts();
	
	public List<Exchange> getAllExchangeProduct();
}
