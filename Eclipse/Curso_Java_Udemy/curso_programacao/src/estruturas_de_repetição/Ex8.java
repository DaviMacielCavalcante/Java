package estruturas_de_repetição;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, F;
		N = sc.nextInt();		
		F = 1;	
		
		for (int i = 1; i <= N; i +=1 ) {			
			F = F * i;					
		}
		System.out.println(F);
		sc.close();
	}
}
