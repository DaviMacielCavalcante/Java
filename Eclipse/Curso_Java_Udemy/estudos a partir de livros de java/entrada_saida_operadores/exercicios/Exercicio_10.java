package exercicios;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		int a = sc.nextInt();

		int rest = a % 2;
		
		if (rest == 0) {
			System.out.println("O número é par.");
		}
		else {
			System.out.println("O número é ímpar.");
		}
		
		sc.close();
	}

}
