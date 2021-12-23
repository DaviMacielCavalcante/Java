package exerciciosPOO;

import java.util.Locale;
import java.util.Scanner;

import entitites.Students;

public class Ex3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Students alun = new Students();
		alun.name = sc.next();
		alun.n1 = sc.nextDouble();
		alun.n2 = sc.nextDouble();
		alun.n3 = sc.nextDouble();
		
		alun.notf();
		System.out.printf("FINAL GRADE: %.2f%n", alun.nf);
		System.out.println(alun);
		if (alun.nf < 60.00) {	
			alun.bad();
			System.out.printf("MISSING %.2f POINTS", alun.falt);
		}		
		sc.close();
	}

}
