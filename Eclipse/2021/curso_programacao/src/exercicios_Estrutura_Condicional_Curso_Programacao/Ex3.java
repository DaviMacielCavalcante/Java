package exercicios_Estrutura_Condicional_Curso_Programacao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b;
				
		a = sc.nextInt();
		b = sc.nextInt();
		
		if ( a < b ) {			
			if ( b % a == 0) { 
				System.out.println("SÃO MÚLTIPLOS");
			}
			else if ( b % a == 1) {
				System.out.println("NÃO SÃO MÚLTIPLOS");
			}
		}
		
		if ( a > b ) {
			
			if ( a % b == 0) {
				System.out.println("SÃO MÚLTIPLOS");
			}
			else {
				System.out.println("NÃO SÃO MÚLTIPLOS");
			}
		}

		sc.close();
	}

}
