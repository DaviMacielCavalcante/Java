package exercicios;

import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		int x = sc.nextInt();
		System.out.print("Informe o segundo número: ");
		int y = sc.nextInt();
		
		int sum = x + y;
		int mult = x * y;
		int dif = x - y;
		int div = x / y;
		
		System.out.println(sum + " " + mult + " " + dif + " " + div);
		
		sc.close();
	}
}
