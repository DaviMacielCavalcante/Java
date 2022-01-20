package exerciciosPOO;

import java.util.Locale;
import java.util.Scanner;

import entitites.Retangulo;

public class Ex1 {

	public static void main(String[] args) { 
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo();
		System.out.println("Enter rectangle width and heigh: ");
		ret.compr = sc.nextDouble();
		ret.alt = sc.nextDouble();
		System.out.println(ret.toSring());
		
		sc.close();
	}
	
}
