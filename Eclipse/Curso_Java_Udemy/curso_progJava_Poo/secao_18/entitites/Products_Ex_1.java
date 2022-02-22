package entitites;

import java.io.Serializable;

public class Products_Ex_1 implements Serializable {	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private Integer quantity;
	private Double price;
	
	public Products_Ex_1() {
		
	}
	
	public Products_Ex_1(String name, Integer quantity, Double price) {		
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Products_Ex_1 [name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
	
	
}
