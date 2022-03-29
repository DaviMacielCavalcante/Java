package exercicios_instrucoes_de_controle_1;

import java.util.Locale;
import java.util.Scanner;

public class CalculadorDeSalarios {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o número de empregados: ");
		int emp = sc.nextInt();
		
		
		
		for (int i = 1; i <= emp ; i++) {
			double salB = 0;
			System.out.print("Informe as horas trabalhadas: ");
			int horasT= sc.nextInt();
			System.out.print("Inform o salário-hora: ");
			double salH = sc.nextDouble();
			if (horasT > 40) {
				double horaE = (((horasT - 40) * salH) * 1.5);
				salB += (horasT * salH) + horaE;
				System.out.printf("O salário bruto é de: R$%.2f%n", salB);
			}
			else if( horasT < 40) {
				salB += (horasT * salH);
				System.out.printf("O salário bruto é de: R$%.2f%n", salB);
			}
			else {
				System.out.println("Erro no Sistema");
			}
			
		}
		
		sc.close();
	}

}
