package exercicios_instrucoes_de_controle_1;

import java.util.Scanner;

public class DoisNumerosMaiores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int maior = 0;
		int smaior = 0;
		for (int i = 1; i <=10; i++) {
			System.out.print("Informe um n�mero: ");
			int number = sc.nextInt();
			sc.nextLine();			
			if (number > maior) {				
				maior = number;					
			}
			else if (number > smaior){
				smaior = number;
			}
		}
		System.out.println("O maior n�mero foi: " + maior);
		System.out.print("O segundo maior n�mero foi: " + smaior);
		sc.close();

	}

}
