package com.project.ekart.service;

import java.util.List;

import com.project.ekart.model.Exchange;
import com.project.ekart.model.Product;

public interface CustomerProductService {
	public List<Product> getAllProducts() throws Exception;
	
	public List<Exchange> getAllExchangeProduct() throws Exception;
}
