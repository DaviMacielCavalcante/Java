package estruturas_de_repetição;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N, M;
		N = sc.nextInt();
		
		for (int i = N; i > 0; i -= 1) {
			M = N / i;
			if (N % i == 0) {
				System.out.println(M);
			}
		}
		
		sc.close();
	}

}
