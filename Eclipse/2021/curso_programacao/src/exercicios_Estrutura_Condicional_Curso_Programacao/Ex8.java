package exercicios_Estrutura_Condicional_Curso_Programacao;

import java.util.Locale;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double Sal = sc.nextDouble();
		double	Isal;
		
		if (Sal >= 0.00 && Sal <= 2000.00) {
			System.out.println("Insento");
		}
			else if (Sal >= 2000.01 && Sal <= 3000.00) {
				Isal = Sal * 0.08;
				System.out.printf("R$ %.2f", Isal);
			}
			else if (Sal >= 3000.01 && Sal <= 4500.00) {
				Isal = Sal * 0.18;
				System.out.printf("R$ %.2f", Isal);
			}
			else if (Sal > 4500) {
				Isal = Sal * 0.28;
				System.out.printf("R$ %.2f", Isal);
			}
		
		sc.close();
	}

}
