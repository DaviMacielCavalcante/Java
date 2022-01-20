package estruturas_de_repetição;

import java.util.Scanner;

public class Teste_de_mesa7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 4;
		int y = x + 2;
		
		for (int i=0; i < x; i += 1) {
			System.out.print( x + " " + y);
			y = y + i;
		}
		
		sc.close();
	}

}
