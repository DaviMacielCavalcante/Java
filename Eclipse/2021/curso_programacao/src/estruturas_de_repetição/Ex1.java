package estruturas_de_repetição;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		x = sc.nextInt();
		
		while ( x != 2002) {
			if (x != 2002) {
				System.out.println("Senha Inválida");
			}			
			x = sc.nextInt();
		}
		if ( x == 2002) {
			System.out.println("Acesso Permitido");
		}
		sc.close();
	}

}
