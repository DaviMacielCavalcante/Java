package estruturas_de_repetição;

import java.util.Locale;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		double a, b, c, Mp;
		N = sc.nextInt();
		
		for (int i = 0; i < N; i +=1) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			
			Mp = ((a * 2) + (b * 3) + (c * 5)) / 10;
			System.out.printf("%.1f%n", Mp);
		}
		
		sc.close();
	}

}
