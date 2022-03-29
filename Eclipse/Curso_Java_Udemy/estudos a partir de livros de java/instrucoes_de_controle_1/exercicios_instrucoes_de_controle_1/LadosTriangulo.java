package exercicios_instrucoes_de_controle_1;

import java.util.Scanner;

public class LadosTriangulo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro lado: ");
		int l1 = sc.nextInt();
		System.out.print("Informe o segundo lado: ");
		int l2 = sc.nextInt();
		System.out.print("Informe o terceiro lado: ");
		int l3 = sc.nextInt();
		
		if (l1 < l2 + l3 && l2 < l1 + l3 &&  l3 < l2 + l1) {
			System.out.println("É um triângulo");			
		}
		else {
			System.out.println("Não é um triângulo");
		}
		
		sc.close();
	}

}
