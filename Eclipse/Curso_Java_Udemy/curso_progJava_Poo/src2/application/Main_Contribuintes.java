package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.Pessoa_Fisica;
import entities.Pessoa_Juridica;

public class Main_Contribuintes {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			if (ch == 'i') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				Double rendaAnual = sc.nextDouble();
				System.out.print("Health expenditures: ");
				Double gastosSaude = sc.nextDouble();
				list.add(new Pessoa_Fisica(name, rendaAnual, gastosSaude));
			}
			else if (ch == 'c'){
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				Double rendaAnual = sc.nextDouble();
				System.out.print("Number of employees: ");
				Integer numEmp = sc.nextInt();
				list.add(new Pessoa_Juridica(name, rendaAnual, numEmp));
				
			}
			else {
				
			}
			
		}
		
		System.out.println();
		System.out.println("Taxes paid: ");
		for (Pessoa p : list) {
			System.out.printf(p.getName() + ": $ %.2f%n", p.imposto());
		}
		
		double sum = 0.0;
		for (Pessoa x : list) {			
			sum+= x.imposto();			
		}
		System.out.println();
		System.out.println("Total taxes: ");
		System.out.printf("$ %.2f", sum);
		
		sc.close();
	}

}
