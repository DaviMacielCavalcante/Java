package topicos_basicos_java;

import java.util.Scanner;

public class FuncoesSintaxe {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe três números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a, b, c);
		
		showResult(maior);
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if ( x >y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Maior = " + value);
	}
	
}
