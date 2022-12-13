package com.project.ekart.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.ekart.entity.AddressEntity;
import com.project.ekart.entity.CustomerEntity;
import com.project.ekart.entity.ExchangeEntity;
import com.project.ekart.entity.ProductEntity;
import com.project.ekart.model.Address;
import com.project.ekart.model.Exchange;
import com.project.ekart.model.Product;
@Repository(value = "customerProductDAO")
public class CustomerProductDAOImpl implements CustomerProductDAO {
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Product> getAllProducts() {

		Query query = entityManager.createQuery("select p from ProductEntity p");
		
		List<ProductEntity> productEntityList= query.getResultList();
		
		List<Product> listOfProducts = new ArrayList<Product>();
		for (ProductEntity productEntity : productEntityList) {
			Product product = new Product();
			product.setBrand(productEntity.getBrand());
			product.setCategory(productEntity.getCategory());
			product.setDescription(productEntity.getDescription());
			product.setName(productEntity.getName());
			product.setPrice(productEntity.getPrice());
			product.setProductId(productEntity.getProductId());
			product.setQuantity(productEntity.getQuantity());
			product.setDiscount(productEntity.getDiscount());

			listOfProducts.add(product);
		}
		return listOfProducts;
	}

	@Override
	public List<Exchange> getAllExchangeProduct() {
		
		Query query = entityManager.createQuery("select e from ExchangeEntity e");
		
		List<ExchangeEntity> exchangeEntityList = query.getResultList();
		
		List<Exchange> listOfProduct = new ArrayList<Exchange>();
		for (ExchangeEntity exchangeEntity : exchangeEntityList) {
			Exchange exchange = new Exchange();
			exchange.setOfferId(exchangeEntity.getOfferId());
			exchange.setProductId(exchangeEntity.getProductId());
			exchange.setOfferDiscount(exchangeEntity.getOfferDiscount());
			exchange.setSellerEmailId(exchangeEntity.getSellerEmailId());
			
			ProductEntity productEntity = exchangeEntity.getProductEntities();
			Product product = new Product();
			product.setBrand(productEntity.getBrand());
			product.setCategory(productEntity.getCategory());
			product.setDescription(productEntity.getDescription());
			product.setDiscount(productEntity.getDiscount());
			product.setName(productEntity.getName());
			product.setPrice(productEntity.getPrice());
			product.setProductId(productEntity.getProductId());
			product.setQuantity(productEntity.getQuantity());
			exchange.setProduct(product);
			
//			List<Product> addList=new ArrayList<>();
//			for(ProductEntity pe:exchangeEntity.getProductEntities()){
//			Product product = new Product();
//			product.setBrand(pe.getBrand());
//			product.setCategory(pe.getCategory());
//			product.setDescription(pe.getDescription());
//			product.setName(pe.getName());
//			product.setPrice(pe.getPrice());
//			product.setProductId(pe.getProductId());
//			product.setQuantity(pe.getQuantity());
//			product.setDiscount(pe.getDiscount());
//			addList.add(product);
//			exchange.setProduct(product);
//			}
			
			listOfProduct.add(exchange);
			
		}
		
		return listOfProduct;
	}
	
	
	
}
