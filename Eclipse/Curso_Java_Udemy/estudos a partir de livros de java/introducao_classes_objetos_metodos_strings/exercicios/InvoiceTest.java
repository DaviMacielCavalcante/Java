package exercicios;

import java.util.Locale;
import java.util.Scanner;

import exercicios.entities.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o número do produto: ");
		String id = sc.nextLine();
		System.out.print("Informe o nome do produto: ");
		String name = sc.nextLine();
		System.out.print("Informe a quantidade do produto: ");
		int quantity = sc.nextInt();
		System.out.print("Informe o preço do produto: ");
		double price = sc.nextDouble();
		
		Invoice p = new Invoice(id, name, quantity, price);
		
		System.out.println();
		System.out.printf("O preço é de: $%.2f", p.getInvoiceAmount(quantity, price));
		
		
		
		sc.close();
	}

}
