package estruturas_de_repetição;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
			int N, Q, C;			
			N= sc.nextInt();
			
			for (int i = 1; i <=N; i += 1) {
				Q = (int) Math.pow(i, 2);
				C = (int) Math.pow(i, 3);
				System.out.printf("%d %d %d %n", i, Q, C);				
			}
			
		
		sc.close();
	}

}
