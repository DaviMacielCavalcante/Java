package exercicios_Estrutura_Condicional_Curso_Programacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x, y;
		
		x = sc.nextDouble();
		y = sc.nextDouble();
		if (x > 0 && x<= 5) {
			if (y > 0 && y <=5) {
				System.out.println("Q1");
			}
			else if (y < 0 && y >= -5) {
				System.out.println("Q4");
			}
			else if (y == 0) {
				System.out.println("Eixo X");
			}
		}
		if (x < 0 && x >= -5) {
			if(y > 0 && y <=5) {
				System.out.println("Q2");
			}
			else if (y < 0 && y >= -5) {
				System.out.println("Q3");
			}
		}
		if (x== 0) {
			if (y > 0 && y <=5) {
				System.out.println("Eixo Y");	
			}
			else if (y < 0 && y >= -5) {
				System.out.println("Eixo Y");
			}
		}
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
		
		sc.close();
	}

}
