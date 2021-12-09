package Exercicios_Estrutura_Sequencial_curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);		
		double L, C, A, Preco, PrecoMetro;		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a largura do terreno: ");
		L = input.nextDouble();
		System.out.println("Informe o comprimento do terreno: ");
		C = input.nextDouble();
		System.out.println("Informe o preço do metro quadrado: ");
		Preco = input.nextDouble();
		
		A = L * C;
		PrecoMetro = Preco * A;
		
		System.out.printf("AREA = %.2f%n", A);
		System.out.printf("PREÇO = %.2f%n", PrecoMetro);
		
		

		input.close();
	}

}
