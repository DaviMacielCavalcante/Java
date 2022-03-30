package exercicios_instrucoes_de_controle_1;

import java.util.Scanner;

public class PrivacidadeComCriptografia {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um número: ");
		int num = sc.nextInt();
		
		int n1 = (int) num / 1000;
		int n2 = (int)(num / 100) - (n1 * 10);
		int n3 = (int)(num / 10) - (n1 * 100) - (n2 * 10);		
		int n4 =(int) num  - (n1 * 1000) - (n2 * 100) - (n3 * 10);
		
		int n5 = (n1 + 7) / 10;
		
		int n6 = n3;
		int n7 = n4;
		int n8 = n5;
		int n9 = n2;
		
		System.out.println(n6 + "" + n7 + "" + n8 + "" + n9);

		sc.close();
	}

}
