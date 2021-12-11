package exercicios_Estrutura_Condicional_Curso_Programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercícioResolvido1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double N1, N2, Nf;
		
		System.out.println("Informe a nota do primeiro semestre:");
		N1 = sc.nextDouble();
		System.out.println("Informe a nota do segundo semestre:");
		N2 = sc.nextDouble();
		Nf = N1 + N2;
		
		System.out.printf("NOTA FINAL = %.1f%n", Nf);
		if (Nf > 60) {			
			System.out.println("APROVADO");
		}
		else {			
			System.out.println("REPROVADO");
		}
		
		sc.close();
	}

}
