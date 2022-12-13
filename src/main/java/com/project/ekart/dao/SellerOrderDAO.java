package com.project.ekart.dao;

import java.util.List;

import com.project.ekart.model.Order;
import com.project.ekart.model.OrderStatus;


public interface SellerOrderDAO {

	public void modifyOrderStatus(Integer orderId, OrderStatus orderStatus);
	
	public List<Order> getOrdersForProducts(List<Integer> productIds);
}
