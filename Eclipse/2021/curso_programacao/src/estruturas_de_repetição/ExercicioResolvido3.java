package estruturas_de_repetição;

import java.util.Scanner;

public class ExercicioResolvido3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, i, R;
		N = sc.nextInt();
		
		for (i = 1; i <= 10; i += 1) {
			R = i * N;
			System.out.println(i + "x" + N + "=" + R);			
		}		
		sc.close();
	}

}
