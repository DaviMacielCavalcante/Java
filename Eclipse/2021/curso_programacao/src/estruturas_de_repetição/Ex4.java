package estruturas_de_repetição;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, n;
		n = sc.nextInt();
		
		if (n >= 1 && n <= 1000) {			
			for (i = 0; i < n; i += 1) {				
				if (i % 2 != 0) {
					System.out.println(i);
				}
			}
		}		
		sc.close();
	}

}
