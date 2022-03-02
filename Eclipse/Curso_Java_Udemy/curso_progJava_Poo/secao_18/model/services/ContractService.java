package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;
	
	public ContractService (OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int month) {
		Double basicQuota = contract.getTotalValue() / month;
		//basicQuota = 200
		for (int i = 1; i <= month; i++) {
			Double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			//updatedQuota = 202
			Double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
			// fullQuota = 206.04
			Date dueDate = addMonths(contract.getDate(), i);			
			contract.getInstallments().add(new Installment (dueDate, fullQuota));			
		}	
	}
	
	private Date addMonths(Date date, int N) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, N);
		return cal.getTime();
	}
	
}
