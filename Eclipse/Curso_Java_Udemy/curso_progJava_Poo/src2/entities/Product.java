package entities;

public class Product {

	private String prodName;
	private Double price;
	
	public Product() {
		
	}
	
	public Product(String prodName, Double price) {		
		this.prodName = prodName;
		this.price = price;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}	
}
