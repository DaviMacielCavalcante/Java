package exercicios.entities;

public class Invoice {

	private String id;
	private String name;
	private int quantity;
	private double price;
	
	public Invoice() {
		
	}

	public Invoice(String id, String name, int quantity, double price) {		
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getInvoiceAmount(int quantity, double price) {
		
		if (quantity < 0) {
			quantity = 0;
			return quantity * price;
		}
		if (price < 0) {
			price = 0.0;
			return quantity * price;
		}
		
		return quantity * price;
	}

}
