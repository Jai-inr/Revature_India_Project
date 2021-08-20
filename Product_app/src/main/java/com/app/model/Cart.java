package com.app.model;

public class Cart {
	private int cart_id;
	private int product_id;
	private int customer_id;
	private Customer customer;
	private Product product;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}
	
	
	public int getCart_id() {
		return cart_id;
	}
	public void setCart_id(int cart_id) {
		this.cart_id = cart_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Cart(int cart_id, int product_id, int customer_id, Customer customer, Product product) {
		super();
		this.cart_id = cart_id;
		this.product_id = product_id;
		this.customer_id = customer_id;
		this.customer = customer;
		this.product = product;
	}
	@Override
	public String toString() {
		return "Cart [cart_id=" + cart_id + ", product_id=" + product_id + ", customer_id=" + customer_id
				+ ", customer=" + customer + ", product=" + product + "]";
	}

}
