package model.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import model.services.CalcPar;

public class Contract implements CalcPar {

	private Integer number;
	private Date date;
	private Double totalValue;
	private List<Installment> installment = new ArrayList<>();
	
	public Contract() {
		
	}

	public Contract(Integer number, Date date, Double totalValue) {
		
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public Date getDate() {
		return date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public List<Installment> getInstallment() {
		return installment;
	}
	
	public void addInstallment(Installment installments){
		installment.add(installments);
	}
	
	public void calcPar(Date date, Double totalValue, int par) {
		Double initPar = totalValue / par;				
		for (int i = 1; i <= par; i++) {
			Double intPar = initPar * 0.01 * i;
			Double finalPar = intPar * 0.02;
			Double totalPar = finalPar;
			Calendar cal = new GregorianCalendar();
			cal.setTime(date);
			cal.add(Calendar.MONTH, i);
			Date dueDate = cal.getTime();
			Installment intMent = new Installment (dueDate,totalPar);
			this.addInstallment(intMent);
		}		
	}	 
	
	@Override
	public String toString() {		
		StringBuilder sb = new StringBuilder();		
		for (Installment install : installment) {
			sb.append(install + "\n");
		}
		return sb.toString();
	}
	
}
