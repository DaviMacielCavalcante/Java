package exercicios_Estrutura_Sequencial_curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		int Cp1, Cp2, Np1, Np2;
		double V1, V2, T;
		
		Scanner sc = new Scanner(System.in);
		
		Cp1 = sc.nextInt();
		Np1 = sc.nextInt();
		V1 = sc.nextDouble();
		sc.nextLine();
		Cp2 = sc.nextInt();
		Np2 = sc.nextInt();
		V2 = sc.nextDouble();
		T = Np1 * V1 + Np2 * V2; 
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", T);
		
		sc.close();
	}

}
