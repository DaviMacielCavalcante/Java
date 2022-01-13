package exerciciosPOO;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		sc.close();
	}

}
