package exercicios_instrucoes_de_controle_1;

import java.util.Scanner;

public class QuilometragemDeCombustivel {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o número de viagens: ");
		int viagens = sc.nextInt();
		System.out.println();
		
		int quilometragemTotal = 0;
		int litrosTotal = 0;
		
		for (int i = 0; i < viagens; i++) {
			
			System.out.print("Informe a quilometragem: ");
			int quilometragem = sc.nextInt();
			
			quilometragemTotal += quilometragem;
			
			System.out.println();
			
			System.out.print("Informe a quantidade de combustível consumida na viagem: ");
			int litros = sc.nextInt();
			
			litrosTotal += litros;
			
			float avg = quilometragem / litros;  
			
			System.out.println();
			System.out.println("Dados da viagem: ");
			System.out.println("Combustível por quilômetro rodado: " + avg + " km/L");		
			System.out.println();
			System.out.println("Dados totais: ");
			System.out.println("Distância total: " + quilometragemTotal + " km");
			System.out.println("Combustível consumido: " + litrosTotal + " L");
			System.out.println();
			
			
		}

		sc.close();
	}

}
