package estruturas_de_repetição;

import java.util.Scanner;

public class ExercicioResolvido1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != y) {
						
			if (x > y) {
				System.out.println("Descrescente");
			}
			else {
				System.out.println("Crescente");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		sc.close();
	}

}
