package exerciciosPOO;

import java.util.Locale;
import java.util.Scanner;

import entitites.Operário;

public class Ex2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Operário prol = new Operário(); 
		
		System.out.print("Name: ");		
		prol.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		prol.brutesal = sc.nextDouble();
		System.out.print("Tax: ");
		prol.impis = sc.nextDouble();
		System.out.println();
		prol.reals();
		System.out.printf("Employee: %s, $ %.2f%n", prol.name, prol.newSal);		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		prol.persal = sc.nextDouble();
		System.out.println();
		System.out.println(prol);
		sc.close();
	}

}
