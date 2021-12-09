package Exercicios_Estrutura_Sequencial_curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		double R, A, X;
		
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Informe o raio do círculo:");
		R = entry.nextDouble();
		A = 3.14159 * Math.pow(R, 2.0);
		System.out.printf("O valor da área é: %.4f%n", A);
		
		entry.close();
	}

}
