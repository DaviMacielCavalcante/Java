package exemplos;

import java.util.Locale;
import java.util.Scanner;

import entitites.Products2;

public class Array_Ex2 {

	public static void main(String[] args) {


		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();		
		Products2[] vect = new Products2[n];
		
		for (int i=0; i<vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();			
			vect[i] = new Products2(name, price);
		}
		
		double sum = 0.0;
		
		for (int i=0; i<n; i++){
			sum += vect[i].getPrice();
		}
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		
		sc.close();
	}

}
