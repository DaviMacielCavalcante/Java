package exercicios;

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		int x = sc.nextInt();
		System.out.print("Informe o segundo número: ");
		int y = sc.nextInt();
		
		if (x > y) {
			System.out.println("O primeiro número é maior.");
		}
		else if (x < y) {
			System.out.println("O segundo número é maior.");
		}
		else {
			System.out.println("Os número são iguais");
		}
		
		int sum = x + y;
		int mult = x * y;
		int dif = x - y;
		int div = x / y;
		int med = (int) (x + y) / 2;
		System.out.println(sum + " " + med + " " + mult + " " + dif + " " + div);
		
		sc.close();


	}

}
