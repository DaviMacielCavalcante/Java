package exercicios;

import java.util.Scanner;

public class Exercicio_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int c, thisIsAVariable, q76354;
		
		System.out.print("Informe um n�mero: ");
		c= sc.nextInt();
		System.out.println("Informe outro n�mero: ");
		int value = sc.nextInt();
		
		System.out.println("This is a Java  program");
		System.out.printf("%s%n%s%n", "This is a Java", "program");
		
		System.out.print("Informe mais um n�mero: ");
		int number = sc.nextInt();
		
		if (number != 7) {
			System.out.println("The variable number is not equal to 7");
		}
				
				
		sc.close();
	}

}
