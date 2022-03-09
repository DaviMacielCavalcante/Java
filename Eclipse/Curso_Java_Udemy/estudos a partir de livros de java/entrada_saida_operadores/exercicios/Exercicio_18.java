package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_18 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------------------");
		System.out.println("        IMC       ");
		System.out.println("------------------");
		
		System.out.print("Informe o peso: ");
		double p = sc.nextDouble();
		System.out.print("Informe a altura: ");
		double a = sc.nextDouble();
		
		double imc = p / (a * a);
		System.out.println();
		System.out.printf("Seu IMC: %.2f%n", imc);
		System.out.println();
		System.out.println("IMC VALUES: ");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal: between 18.5 and 24.9");
		System.out.println("Overweight: between 25 and 29.9");
		System.out.println("Obese: 30 or greater");
		
		sc.close();
	}

}
