package exercicios;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x, y, z;
		
		System.out.println("Este programa calculará o produto de 3 números inteiros");
		System.out.print("Informe o primeiro número:");
		x = sc.nextInt();
		System.out.print("Informe o segundo número:");
		y = sc.nextInt();
		System.out.print("Informe o terceiro número:");
		z = sc.nextInt();		
		
		int result = x * y * z;
		
		System.out.printf("Product is %d", result);
		
		sc.close();
	}

}
