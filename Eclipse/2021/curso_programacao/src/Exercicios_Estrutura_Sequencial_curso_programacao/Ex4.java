package Exercicios_Estrutura_Sequencial_curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		int num, h;
		double Ph, S;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu número:");
		num = sc.nextInt();
		System.out.println("Informe quantas horas trabalhou:");
		h = sc.nextInt();
		System.out.println("Informe o valor que recebe por hora:");
		Ph = sc.nextDouble();
		S = (double) Ph * h;
		System.out.println("NUMBER = " + num);
		System.out.printf("Seu salário é de: U$ %.2f%n", S);
		
		sc.close();
	}

}
