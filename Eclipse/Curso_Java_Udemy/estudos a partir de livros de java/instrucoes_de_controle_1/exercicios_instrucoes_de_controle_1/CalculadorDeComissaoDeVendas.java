package exercicios_instrucoes_de_controle_1;

import java.util.Locale;
import java.util.Scanner;

public class CalculadorDeComissaoDeVendas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o total de itens vendidos: ");
		int totalVendas = sc.nextInt();
		System.out.println();
		double totalItens = 0;
		for (int i = 1; i <= totalVendas; i++) {
			System.out.print("Informe o valor do item: ");
			double preco = sc.nextDouble();
			totalItens += preco;			
		}
		double rendimento = 200 + (totalItens * 0.05);
		
		System.out.printf("O rendimento do vendedor foi de: R$%.2f", rendimento);
		
		
		sc.close();
	}

}
