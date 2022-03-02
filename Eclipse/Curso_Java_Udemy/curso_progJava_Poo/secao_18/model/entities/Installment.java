package model.entities;

import java.util.Date;

public class Installment {

	private Date dueDate;
	private Double amount;
	
	public Installment(Date dueDate, Double amount) {		
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public Date getDueDate() {
		return dueDate;
	}	

	public Double getAmount() {
		return amount;
	}	
	
	
}
