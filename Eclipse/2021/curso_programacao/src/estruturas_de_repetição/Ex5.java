package estruturas_de_repetição;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		int x, In, Out, N;
		N = sc.nextInt();
		In = 0;
		Out = 0;
		
		for (int i = 0; i < N; i += 1) {
			x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				In = In + 1;
			}
			else {
				Out = Out + 1;
			}
		}	
		System.out.println(In + "in");
		System.out.println(Out + "out");
		sc.close();
	}

}
