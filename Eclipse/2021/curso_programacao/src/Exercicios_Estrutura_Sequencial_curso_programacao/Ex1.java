package Exercicios_Estrutura_Sequencial_curso_programacao;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		double A, B, R;
		
		Scanner n = new Scanner(System.in);		
		
		System.out.println("INFORME O PRIMEIRO VALOR:");
		A = n.nextDouble();
		System.out.println("INFORME O SEGUNDO VALOR:");
		B = n.nextDouble();
		R = A + B;
		System.out.println("SOMA =" + R);
		
		n.close();
	}

}
