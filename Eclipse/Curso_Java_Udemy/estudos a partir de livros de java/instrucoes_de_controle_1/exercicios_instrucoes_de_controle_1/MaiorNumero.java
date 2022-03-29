package exercicios_instrucoes_de_controle_1;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int maior = 0;
		for (int i = 1; i <=10; i++) {
			System.out.print("Informe um número: ");
			int number = sc.nextInt();
			sc.nextLine();			
			if (number > maior) {
				maior = number;
			}			
		}
		System.out.print("O maior número foi: " + maior);
		sc.close();
	}

}
