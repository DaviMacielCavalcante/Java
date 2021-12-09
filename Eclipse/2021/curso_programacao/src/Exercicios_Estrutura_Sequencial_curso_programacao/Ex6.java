package Exercicios_Estrutura_Sequencial_curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double A, B, C;
		double Ar, AT, Circ, Q2, R;
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		sc.nextLine();
		
		Ar = (A * C) / 2.0;
		Circ = 3.14159 * Math.pow(C, 2.0);
		AT = (A + B) * C / 2.0;
		Q2 = Math.pow(B, 2);
		R = A * B;
				
		System.out.printf("TRIÂNGULO = %.3f%n", Ar);
		System.out.printf("CÍRCULO = %.3f%n", Circ);
		System.out.printf("TRAPÉZIO = %.3f%n", AT);
		System.out.printf("QUADRADO = %.3f%n", Q2);
		System.out.printf("RETÂNGULO = %.3f%n", R);
		
		sc.close();
	}

}
