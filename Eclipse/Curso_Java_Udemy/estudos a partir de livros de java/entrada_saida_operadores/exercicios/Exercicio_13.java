package exercicios;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o raio do círculo: ");
		
		double r = sc.nextDouble();
		
		System.out.printf("%.2f%n", r *2);
		System.out.printf("%.2f%n", r * 2 * Math.PI);
		System.out.printf("%.2f%n", (r * r) * Math.PI);	

		sc.close();
	}

}
