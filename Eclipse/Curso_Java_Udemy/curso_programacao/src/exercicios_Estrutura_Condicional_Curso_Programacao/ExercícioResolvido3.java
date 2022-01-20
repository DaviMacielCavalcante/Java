package exercicios_Estrutura_Condicional_Curso_Programacao;

import java.util.Scanner;

public class ExercícioResolvido3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		if (A < B && B < C) {
			System.out.println("MENOR = " + A);
		}
		else if (B < C) {
			System.out.println("MENOR = " + B);
		}
		else {
			System.out.println("MENOR = " + C);
		}
		
		sc.close();
	}

}
