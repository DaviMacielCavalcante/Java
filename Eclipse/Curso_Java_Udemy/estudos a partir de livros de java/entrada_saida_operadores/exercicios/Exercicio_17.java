package exercicios;

import java.util.Scanner;

public class Exercicio_17 {

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
		
		int sump = 0;
		
		int sumn = 0;
		
		int sumz = 0;
		
		if (a < 0) {
			sumn += 1;
		}
		
		
		if (a > 0) {
			sump += 1;
		}
		
		if (a == 0) {
			sumz += 1;
		}
		
		if (b < 0) {
			sumn += 1;
		}
		
		
		if (b > 0) {
			sump += 1;
		}
		
		if (b == 0) {
			sumz += 1;
		}
		
		if (c < 0) {
			sumn += 1;
		}
		
		
		if (c > 0) {
			sump += 1;
		}
		
		if (c == 0) {
			sumz += 1;
		}
		
		if (d < 0) {
			sumn += 1;
		}
		
		
		if (d > 0) {
			sump += 1;
		}
		
		if (d == 0) {
			sumz += 1;
		}
		
		if (e < 0) {
			sumn += 1;
		}
		
		
		if (e > 0) {
			sump += 1;
		}
		
		if (e == 0) {
			sumz += 1;
		}
		
		System.out.println("Foram inseridos " + sump + " n�mero(s) positivo(s), " + sumn + " n�mero(s) negativo(s) e " + sumz + " zero(s)");
		
		sc.close();
	}

}
