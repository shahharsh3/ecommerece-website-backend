package com.project.ekart.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.project.ekart.model.Product;

@Entity
@Table(name = "EXCHANGE_OFFERS")
public class ExchangeEntity {
	
	@Id
	@Column(name = "OFFER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer offerId;
	
	@Column(name = "PRODUCT_ID")
	private Integer productId;
	
	@Column(name = "OFFER_DISCOUNT")
	private Double offerDiscount;
	
	@Column(name = "SELLER_EMAIL_ID")
	private String sellerEmailId;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="PRODUCT_ID", insertable = false, updatable = false)
	private ProductEntity productEntities;

	public Integer getOfferId() {
		return offerId;
	}

	public void setOfferId(Integer offerId) {
		this.offerId = offerId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Double getOfferDiscount() {
		return offerDiscount;
	}

	public void setOfferDiscount(Double offerDiscount) {
		this.offerDiscount = offerDiscount;
	}

	public String getSellerEmailId() {
		return sellerEmailId;
	}

	public void setSellerEmailId(String sellerEmailId) {
		this.sellerEmailId = sellerEmailId;
	}

	public ProductEntity getProductEntities() {
		return productEntities;
	}

	public void setProductEntities(ProductEntity productEntities) {
		this.productEntities = productEntities;
	}
	
	

}
