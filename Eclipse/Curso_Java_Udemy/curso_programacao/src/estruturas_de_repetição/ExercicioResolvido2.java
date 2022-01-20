package estruturas_de_repetição;

import java.util.Scanner;

public class ExercicioResolvido2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, s, c;
		double m;
		s = 0;
		c = 0;
		
		x = sc.nextInt();
		
		if ( x < 0) {
			System.out.println("Impossível Calcular");
		}
		while ( x > 0) {
			s = s + x;
			c = c + 1;
			x = sc.nextInt();
		}
		if (c != 0) {
			m = (double) s / c ;
			System.out.printf("%.2f%n", m);
		}				
		sc.close();
	}

}
