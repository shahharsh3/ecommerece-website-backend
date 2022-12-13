package com.project.ekart.service;

import java.util.List;

import com.project.ekart.model.Order;


public interface SellerOrderService {

	public void modifyOrderStatus(Integer orderId, String orderStatus) throws Exception;
	public List<Order> viewOrders(String sellerEmailId) throws Exception;
}
