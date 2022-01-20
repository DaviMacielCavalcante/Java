package exercicios_Estrutura_Condicional_Curso_Programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercícioResolvido2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, Delt, X1, X2;
		
		System.out.println("ax^2 + bx + c = 0");
		System.out.println("Informe os valores de a, b e c (respectivamente:");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		Delt = Math.pow(B, 2) - 4 * A * C;
		X1 = (-B + Math.sqrt(Delt)) / (2 * A); 
		X2 = (-B - Math.sqrt(Delt)) / (2 * A);
		
		if (Delt < 0 || A==0) {
			System.out.println("Impossível Calcular");
		}
		else {
			System.out.printf("X1 = %.5f%n", X1);
			System.out.printf("X2 = %.5f%n", X2);
		}
		
		sc.close();
	}

}
