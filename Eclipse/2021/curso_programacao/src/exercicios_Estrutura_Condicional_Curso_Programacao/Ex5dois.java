package exercicios_Estrutura_Condicional_Curso_Programacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex5dois {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int Q, C;
		double x, Vf;
		
		System.out.println("Informe o código do produto:");
		C = sc.nextInt();
		System.out.println("Informe a quantidade desejada:");
		Q = sc.nextInt();
		
		switch (C){
			case 1 :
				x = 4.00;
				Vf = (double) Q * x;
				System.out.printf("Total: R$ %.2f", Vf);
				break;
			case 2 :
				x = 4.50;
				Vf = (double) Q * x;
				System.out.printf("Total: R$ %.2f", Vf);
				break;
			case 3 :
				x = 5.00;
				Vf = (double) Q * x;
				System.out.printf("Total: R$ %.2f", Vf);
				break;
			case 4 :
				x = 2.00;
				Vf = (double) Q * x;
				System.out.printf("Total: R$ %.2f", Vf);
				break;
			case 5 :
				x = 1.50;
				Vf = (double) Q * x;
				System.out.printf("Total: R$ %.2f", Vf);
			default:
				System.out.println("CÓDIGO INVÁLIDO");
				break;
		}		
		sc.close();
	}

}
