package com.project.ekart.dao;

import java.util.List;

import com.project.ekart.model.Product;

public interface SellerProductDAO {

	public Integer addNewProduct(Product product);
	
	public Product modifyProductDetails(Product product);
	
	public Integer removeProduct(String sellerEmailId, Integer productId);
	
	public List<String> getProductCategoryList();
}
