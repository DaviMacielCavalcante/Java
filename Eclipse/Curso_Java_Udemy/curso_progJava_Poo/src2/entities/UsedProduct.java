package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Products3 {

	private Date manufactureDate;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct() {
		
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDAte(Date manufactureDAte) {
		this.manufactureDate = manufactureDAte;
	}
	
	@Override
	public String priceTag() {
		return name + " $" + String.format("%.2f", price) + "(Manufacture date: $" + sdf.format(manufactureDate) + ")";
	}
}
