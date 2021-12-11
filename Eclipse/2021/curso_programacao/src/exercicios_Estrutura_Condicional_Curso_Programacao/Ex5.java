package exercicios_Estrutura_Condicional_Curso_Programacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int Q;
		double C, Vf;
		
		System.out.println("Informe o código do produto:");
		C = sc.nextDouble();
		System.out.println("Informe a quantidade desejada:");
		Q = sc.nextInt();
		
		if (C == 1) {
			C = 4.00;
			Vf =(double) Q * C;
			System.out.printf("Total: R$ %.2f", Vf);
		}
			else if (C == 2) {
				C = 4.50;
				Vf =(double) Q * C;
				System.out.printf("Total: R$ %.2f", Vf);
			}
			else if (C == 3) {
				C = 5.00;
				Vf =(double) Q * C;
				System.out.printf("Total: R$ %.2f", Vf);					
				}
			else if (C == 4) {
				C = 2.00;
				Vf =(double) Q * C;
				System.out.printf("Total: R$ %.2f", Vf);
					}
			else if (C == 5) {
				C = 1.50;
				Vf =(double) Q * C;
			System.out.printf("Total: R$ %.2f", Vf);
					}		
		sc.close();
	}
}
