package exercicios_instrucoes_de_controle_1;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		int f = sc.nextInt();
		System.out.print(f +"! = ");
		
		for (int i = f ; i > 0; i--) {	
			if (i < f) {
				f = (f * i);
			}						
			if (i == 1) {
				System.out.print(i);
			}
			else {				
				System.out.print(i + ".");
			}
			
		}
		System.out.print(" = " + f);		
		sc.close();
	}

}
