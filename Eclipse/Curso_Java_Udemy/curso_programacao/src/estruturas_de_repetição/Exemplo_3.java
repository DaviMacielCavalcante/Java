package estruturas_de_repetição;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double c, f;
		char resp;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			c = sc.nextDouble();
			f = ((9 * c) / 5) + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			System.out.print("Deseja repetir? [S/N]");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		sc.close();
	}

}
