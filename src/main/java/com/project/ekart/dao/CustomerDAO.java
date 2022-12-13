package com.project.ekart.dao;

import com.project.ekart.model.Address;
import com.project.ekart.model.Customer;

public interface CustomerDAO {
	
	public Boolean checkAvailabilityOfEmailId(String emailId);
	public Boolean checkAvailabilityOfPhoneNumber(String phoneNumber);
	public String registerNewCustomer(Customer customer);
	public String authenticateCustomer(String emailId, String password);
	public String getPasswordOfCustomer(String emailId) ;
	public Customer getCustomerByEmailId(String emailId);
	public Customer getCustomerByPhoneNumber(String phoneNumber);

	public void updateProfile(Customer customer);
	public void changePassword(String customerEmailId, String newHashedPassword);
	
	public Integer addShippingAddress(String customerEmailId, Address address);
	public void updateShippingAddress(Address address);
	public void deleteShippingAddress(String customerEmailId, Integer addressId);
	public Address getShippingAddress(Integer addressId) throws Exception;
}
