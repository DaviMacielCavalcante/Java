package estruturas_de_repetição;

import java.util.Scanner;

public class ExercicioResolvido4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, s, i, min, max;
		x = sc.nextInt();
		y = sc.nextInt();
		min = Math.min(x, y);
		max = Math.max(x,  y);		
		s = 0;		
		
		for (i = min + 1; i < max; i += 1) {
			if (i % 2 != 0) {
				s = s + i;
			}
		}
		System.out.println(s);
		sc.close();
	}

}
