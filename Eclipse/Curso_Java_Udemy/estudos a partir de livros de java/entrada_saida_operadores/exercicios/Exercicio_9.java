package exercicios;

import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número: ");
		int a = sc.nextInt();
		System.out.print("Informe o segundo número: ");
		int b = sc.nextInt();
		System.out.print("Informe o terceiro número: ");
		int c = sc.nextInt();
		System.out.print("Informe o quarto número: ");
		int d = sc.nextInt();
		System.out.print("Informe o quinto número: ");
		int e = sc.nextInt();
		
		//menor
		if (a < b && a < c && a < d && a < e) {
			System.out.println(a + " é o menor.");
		}
		else if (b < a && b < c && b < d && b < e) {
			System.out.println(b + " é o menor.");
		}
		else if (c < b && c < a && c < d && c < e) {
			System.out.println(c + " é o menor.");
		}
		else if (d < a && d < b && d < c && d < e) {
			System.out.println(d + " é o menor.");
		}
		else if (e < a && e < b && e < c && e < d) {
			System.out.println(e + " é o menor.");
		}
		
		//maior
		if (a > b && a > c && a > d && a > e) {
			System.out.println(a + " é o maior.");
		}
		else if (b > a && b > c && b > d && b > e) {
			System.out.println(b + " é o maior.");
		}
		else if (c > b && c > a && c > d && c > e) {
			System.out.println(c + " é o maior.");
		}
		else if (d > a && d > b && d > c && d > e) {
			System.out.println(d + " é o maior.");
		}
		else if (e > a && e > b && e > c && e > d) {
			System.out.println(e + " é o maior.");
		}
		
		sc.close();
	}

}
