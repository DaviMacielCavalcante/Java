package exercicios;

import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro n�mero: ");
		int a = sc.nextInt();
		System.out.print("Informe o segundo n�mero: ");
		int b = sc.nextInt();
		System.out.print("Informe o terceiro n�mero: ");
		int c = sc.nextInt();
		System.out.print("Informe o quarto n�mero: ");
		int d = sc.nextInt();
		System.out.print("Informe o quinto n�mero: ");
		int e = sc.nextInt();
		
		//menor
		if (a < b && a < c && a < d && a < e) {
			System.out.println(a + " � o menor.");
		}
		else if (b < a && b < c && b < d && b < e) {
			System.out.println(b + " � o menor.");
		}
		else if (c < b && c < a && c < d && c < e) {
			System.out.println(c + " � o menor.");
		}
		else if (d < a && d < b && d < c && d < e) {
			System.out.println(d + " � o menor.");
		}
		else if (e < a && e < b && e < c && e < d) {
			System.out.println(e + " � o menor.");
		}
		
		//maior
		if (a > b && a > c && a > d && a > e) {
			System.out.println(a + " � o maior.");
		}
		else if (b > a && b > c && b > d && b > e) {
			System.out.println(b + " � o maior.");
		}
		else if (c > b && c > a && c > d && c > e) {
			System.out.println(c + " � o maior.");
		}
		else if (d > a && d > b && d > c && d > e) {
			System.out.println(d + " � o maior.");
		}
		else if (e > a && e > b && e > c && e > d) {
			System.out.println(e + " � o maior.");
		}
		
		sc.close();
	}

}
