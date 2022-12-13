package com.project.ekart.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.project.ekart.model.Exchange;
import com.project.ekart.model.Product;
import com.project.ekart.service.CustomerProductService;

@CrossOrigin
@RestController
@RequestMapping("CustomerProductAPI")
public class CustomerProductAPI {

	@Autowired
	private CustomerProductService customerProductService;
	
	@Autowired
	private Environment environment;
	
	@GetMapping(value = "getAllProducts")
	public ResponseEntity<List<Product>> getAllProducts() throws Exception {
		
		List<Product> products = null;
		try
		{
			products = customerProductService.getAllProducts();
			
			return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
		}
		catch (Exception e) {
			
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, environment.getProperty(e.getMessage()));
		}
		
	}
	
	@GetMapping(value = "getAllExchangeProduct")
	public ResponseEntity<List<Exchange>> getAllExchangeProduct() throws Exception{
		
		List<Exchange> exchange = null;
		try {
			exchange = customerProductService.getAllExchangeProduct();
			
			return new ResponseEntity<List<Exchange>>(exchange, HttpStatus.OK);
			
		} catch (Exception e) {
			
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, environment.getProperty(e.getMessage()));
		}
	}
}
