package estruturas_de_repetição;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, F, Fat;
		N = sc.nextInt();
		Fat = 0;
		F = 0;
		
		for (int i = 1; i < N; i += 1) {
			F = N * i;
			Fat = Fat + F;			
		}
		System.out.println(Fat);
		sc.close();
	}

}
