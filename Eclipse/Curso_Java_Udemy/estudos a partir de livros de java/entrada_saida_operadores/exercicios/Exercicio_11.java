package exercicios;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro n�mero: ");
		int a = sc.nextInt();
		System.out.print("Informe o segundo n�mero: ");
		int b = sc.nextInt();
		
		int m = a % b;
		
		if (m == 0) {
			System.out.println(a + " � m�ltiplo de " + b);
		}
		else {
			System.out.println(a + " n�o � m�ltiplo de " + b);
		}
		
		sc.close();
	}

}
