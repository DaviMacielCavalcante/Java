package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;

public class Ex_1 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		sc.nextLine();
		Date date = sdf.parse(sc.nextLine());	
		System.out.print("Contract value: ");
		double value = sc.nextDouble();
		Contract contr = new Contract(number, date, value);	
		System.out.print("Enter number of installments: ");
		int par = sc.nextInt();		
		contr.calcPar(date, value, par);
		
		System.out.println("Installments: ");
		System.out.print(contr);

		sc.close();
	}

}
