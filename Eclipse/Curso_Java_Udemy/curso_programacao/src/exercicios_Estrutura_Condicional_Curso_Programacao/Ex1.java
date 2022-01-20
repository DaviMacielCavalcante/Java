package exercicios_Estrutura_Condicional_Curso_Programacao;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Num;
		
		Num = sc.nextInt();
		
		if (Num < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NÃO NEGATIVO");
		}

		sc.close();
	}

}
