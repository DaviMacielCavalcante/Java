package exercicios_instrucoes_de_controle_1;

import java.util.Locale;
import java.util.Scanner;

public class CalculadorDeLimiteDeCredito {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numberAccount;
		double saldo, itensTotal, creditoDisponivel, creditoLimite;
		
		System.out.print("Número da conta: ");
		numberAccount = sc.nextInt();
		System.out.print("Saldo: ");
		saldo = sc.nextDouble();
		System.out.print("Valor total dos itens: ");
		itensTotal = sc.nextDouble();
		System.out.print("Total de créditos mensal: ");
		creditoDisponivel = sc.nextDouble();
		System.out.print("Limite de crédito: ");
		creditoLimite = sc.nextDouble();
		
		double novoSaldo = saldo + itensTotal - creditoDisponivel;
		
		System.out.print("Conta: " + numberAccount);
		
		if (novoSaldo > creditoLimite) {			
			System.out.println("Limite de crédito excedido!");
		}
		else {
			System.out.println("Dá-lhe mana!");
		}
		System.out.println();
		
		sc.close();
	}

}
