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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cart_id;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + customer_id;
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + product_id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cart other = (Cart) obj;
		if (cart_id != other.cart_id)
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (customer_id != other.customer_id)
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (product_id != other.product_id)
			return false;
		return true;
	}

}
