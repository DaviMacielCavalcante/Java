package exercicios;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		int a = sc.nextInt();
		System.out.print("Informe o segundo número: ");
		int b = sc.nextInt();
		
		int m = a % b;
		
		if (m == 0) {
			System.out.println(a + " é múltiplo de " + b);
		}
		else {
			System.out.println(a + " não é múltiplo de " + b);
		}
		
		sc.close();
	}

}
