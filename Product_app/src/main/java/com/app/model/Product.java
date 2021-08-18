package com.app.model;

public class Product {

	private int id;
	private  String productName;
	private Double productPrice;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	public Product(int id, String productName, Double productPrice) {
		super();
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productPrice=" + productPrice + "]";
	}
	
	
}
