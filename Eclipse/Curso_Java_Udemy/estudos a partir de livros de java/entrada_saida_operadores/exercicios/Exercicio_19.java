package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_19 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Popula��o mundial atual:");
		int p = sc.nextInt();
		double t1 = 0.9;
		int v1 = (int) (p * t1);
		int p1 = p + v1;		
		int p2 = p1 + v1;		
		int p3 = p2 + v1;		
		int p4 = p3 + v1;		
		int p5 = p4 + v1;
		System.out.println("Popula��o estimada para 2023: " + p1 + " bilh�es ");
		System.out.println("Popula��o estimada para 2024: " + p2 + " bilh�es ");
		System.out.println("Popula��o estimada para 2025: " + p3 + " bilh�es ");
		System.out.println("Popula��o estimada para 2026: " + p4 + " bilh�es ");
		System.out.println("Popula��o estimada para 2027: " + p5 + " bilh�es ");
		
		sc.close();
	}

}
