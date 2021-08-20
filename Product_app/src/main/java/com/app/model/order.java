package com.app.model;

public class order {
	
	private int order_id;
	private int product_id;
	private int customer_id;
	
	
	public order() {
		// TODO Auto-generated constructor stub
	}
	
	public order(int order_id, int product_id, int customer_id) {
		super();
		this.order_id = order_id;
		this.product_id = product_id;
		this.customer_id = customer_id;
	}




	public int getOrder_id() {
		return order_id;
	}




	public void setOrder_id(int order_id) {
		this.order_id = order_id;
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




	@Override
	public String toString() {
		return "order [order_id=" + order_id + ", product_id=" + product_id + ", customer_id=" + customer_id + "]";
	}

}
