package com.mycompany.domain;

public class Product 
{
	int ProductId;
	String ProductName;
	int ProductPrice;
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public int getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(int productPrice) {
		ProductPrice = productPrice;
	}
	public Product() {
		super();
		ProductId = getProductId();
		ProductName = getProductName();
		ProductPrice = getProductPrice();
	}
	
	
	
}
