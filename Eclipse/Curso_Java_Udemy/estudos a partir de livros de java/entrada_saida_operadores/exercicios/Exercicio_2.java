package exercicios;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x, y, z;
		
		System.out.println("Este programa calcular� o produto de 3 n�meros inteiros");
		System.out.print("Informe o primeiro n�mero:");
		x = sc.nextInt();
		System.out.print("Informe o segundo n�mero:");
		y = sc.nextInt();
		System.out.print("Informe o terceiro n�mero:");
		z = sc.nextInt();		
		
		int result = x * y * z;
		
		System.out.printf("Product is %d", result);
		
		sc.close();
	}

}
