package exercicios_instrucoes_de_controle_1;

import java.util.Scanner;

public class EquivalenteDecimalDeBinario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Informe um número: ");
		int num = sc.nextInt();
		
		int n1 = (int) num / 1000;
		int n2 = (int)(num / 100) - (n1 * 10);
		int n3 = (int)(num / 10) - (n1 * 100) - (n2 * 10);		
		int n4 =(int) num  - (n1 * 1000) - (n2 * 100) - (n3 * 10);
		int n5 = (int)(n1 * 8) + (n2 * 4) + (n3 * 2) + (n4 * 1);
		
		System.out.println("O equivalente decimal do binário informado é: " + n5);
		
		sc.close();
	}

}
