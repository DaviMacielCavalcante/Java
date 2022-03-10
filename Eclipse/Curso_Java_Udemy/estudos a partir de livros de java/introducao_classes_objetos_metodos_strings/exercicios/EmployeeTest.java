package exercicios;

import java.util.Locale;
import java.util.Scanner;

import exercicios.entities.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee e1 = new Employee ("Davi", "Cavalcante", 2000.00);
		Employee e2 = new Employee ("Cecília", "Cavalcante", 4000.00);	
		
		System.out.printf("Salário anual de %s: $%.2f%n", e1.getName(), e1.anualSalary());
		System.out.printf("Salário anual de %s: $%.2f%n", e2.getName(), e2.anualSalary());
		
		e1.increaseSalary(0.1);
		e2.increaseSalary(0.1);
		
		System.out.println();
		
		System.out.printf("Salário anual de %s: $%.2f%n", e1.getName(), e1.anualSalary());
		System.out.printf("Salário anual de %s: $%.2f%n", e2.getName(), e2.anualSalary());
		
		sc.close();		
	}

}
