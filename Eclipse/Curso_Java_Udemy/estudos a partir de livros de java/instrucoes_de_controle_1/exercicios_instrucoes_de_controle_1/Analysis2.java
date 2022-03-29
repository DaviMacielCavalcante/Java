package exercicios_instrucoes_de_controle_1;

import java.util.Scanner;

public class Analysis2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int passes = 0;
		int failures = 0;		
		boolean loop = false;		
		
		while (loop == false) {
			System.out.print("Enter result ( 1 = pass, 2 = fail): ");
			int result = sc.nextInt();
			if (result != 1 && result != 2) {
				loop = false;
			}
			else {
				loop = true;
			}
			if(result == 1) {
				passes += 1;
			}
			else if (result == 2) {
				failures += 1;
			}	
		}
		
		
		System.out.printf("Passes: %d%nFailed: %d%n", passes, failures);
		
		if (passes > 8) {
			System.out.println("Bonus to instructor!");
		}
		
		
		sc.close();
	}

}
