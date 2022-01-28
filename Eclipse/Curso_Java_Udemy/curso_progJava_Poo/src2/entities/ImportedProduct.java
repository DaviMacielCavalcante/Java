package entities;

public final class ImportedProduct extends Products3 {

	private Double customsFee;
	
	public ImportedProduct() {
		
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public String priceTag() {
		return name + " $" + String.format("%.2f", totalPrice()) + " (Customs Fee: $" + String.format("%.2f", customsFee) + ")";
	}
	
	
}
