package estruturas_de_repeti��o;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, A, B;
		Double D;
		N = sc.nextInt();
		
		for (int i = 0; i <= N; i += 1) {
			A = sc.nextInt();
			B = sc.nextInt();
			D =	(double) A / B;
			if ( B == 0) {
				System.out.println("Divis�o Imposs�vel");
			}
			System.out.println(D);
		}				
		sc.close();		
	}

}
