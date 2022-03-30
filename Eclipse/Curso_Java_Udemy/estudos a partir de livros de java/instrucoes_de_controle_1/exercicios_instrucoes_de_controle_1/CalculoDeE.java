package exercicios_instrucoes_de_controle_1;

import java.util.Scanner;

public class CalculoDeE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o número de termos: ");
		int f = sc.nextInt();
		System.out.print("e = 1 ");
		int fat = f;
		double e = 1;
		
		for (int j = fat; j > 0; j--) {			
			for (int i = fat; i > 0; i--) {					
				if (i < j ) {					
					f = (f * i);					
				}				
			}
			
			if (j == 1) {
				System.out.print("+ 1/" + j + "! ");
				
			} else {
				System.out.print("+ 1/" + j + "! ");
			}
			e += ((double) 1 / (double) f);
			f = j - 1;			
		}
		System.out.printf("= %.2f", e);
		sc.close();

	}

}
