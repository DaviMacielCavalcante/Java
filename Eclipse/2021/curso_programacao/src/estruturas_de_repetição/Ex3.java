package estruturas_de_repetição;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, Alc, Gas, Dies;
		x = sc.nextInt();
		Alc = 0;
		Gas = 0;
		Dies = 0;
		
		while ( x != 4) {
			switch (x) {
				case 1:
					Alc = Alc + 1;
					break;
				case 2:
					Gas = Gas + 1;
					break;
				case 3:
					Dies = Dies + 1;
					break;
				default:
					
					break;
			}
			x = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Álcool: " + Alc);
		System.out.println("Gasolina: " + Gas);
		System.out.println("Diesel: " + Dies);
		sc.close();
	}

}
