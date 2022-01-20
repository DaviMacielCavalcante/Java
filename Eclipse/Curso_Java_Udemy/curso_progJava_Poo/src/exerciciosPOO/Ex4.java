package exerciciosPOO;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Ex4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double valorDolar = sc.nextDouble();		
		System.out.print("How many dollars will be bought? ");
		double dolarQuant = sc.nextDouble();
		double result = CurrencyConverter.result(valorDolar, dolarQuant);
		System.out.printf("Amount to be paid in reais = %.2f", result);
		
		sc.close();
	}

}
