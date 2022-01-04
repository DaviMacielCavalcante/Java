package entitites;

import java.util.Date;

public class Order {

	private Date date;
	private Products products;
	
	public Order(Date date, Products products) {
		super();
		this.date = date;
		this.products = products;
		this.products.name = "TV";
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}
	
	
	
}
