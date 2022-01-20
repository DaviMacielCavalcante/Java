package exercicios_Estrutura_Sequencial_curso_programacao;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		int A, B, C, D, R;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor:");
		A = sc.nextInt();
		System.out.println("Informe o segundo valor:");
		B = sc.nextInt();
		System.out.println("Informe o terceiro valor:");
		C = sc.nextInt();
		System.out.println("Informe o quarto valor:");
		D = sc.nextInt();
		R = (A * B - C * D);
		System.out.println ("DIFERENÇA =" + R);
			
		
		sc.close();
	}

}
