package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Ex_1 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data: ");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		sc.nextLine();
		Date date = sdf.parse(sc.nextLine());	
		System.out.print("Contract value: ");
		Double value = sc.nextDouble();
		
		Contract contr = new Contract(number, date, value);
		
		ContractService cs = new ContractService(new PaypalService());
		
		System.out.print("Enter number of installments: ");
		int N = sc.nextInt();		
		cs.processContract(contr, N);
		
		System.out.println("Installments: ");
		for (Installment it : contr.getInstallments()) {
			System.out.println(it);
		}

		sc.close();
	}

}
