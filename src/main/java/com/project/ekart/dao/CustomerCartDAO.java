package com.project.ekart.dao;

import java.util.List;

import com.project.ekart.model.CustomerCart;
import com.project.ekart.model.Product;

public interface CustomerCartDAO {

	public void addProductToCart(String customerEmailId, CustomerCart customerCart);
	public List<CustomerCart> getCustomerCarts(String customerEmailId);
	public void modifyQuantityOfProductInCart(Integer cartId, Integer quantity);
	public void deleteProductFromCart(String customerEmailId, Integer cartId);
	public Product getProductById(Integer productId);
}
