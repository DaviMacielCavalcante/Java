package exercicios_instrucoes_de_controle_1;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int num = sc.nextInt();
		
		int n1 = num /10000;
		int n2 = (num /1000) - (n1 * 10) ;
		int n3 = (num /100) - (n1 * 100) - (n2 * 10);
		int n4 = (num /10) - (n1 * 1000) - (n2 * 100) - (n3*10);
		int n5 = num - (n1 * 10000) - (n2 * 1000) - (n3*100) - (n4*10);
		
		if (n1 == n5) {
			if (n2 == n4) {
				System.out.println("O número é um palíndromo");
			}
			else {
				System.out.println("O número não é um palíndromo");
			}
		}
		else {
			System.out.println("O número não é um palíndromo");
		}
		
		
		sc.close();
	}
	

}
