package appl;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import entities.StudentsLog;

public class Exercicio_Proposto_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<StudentsLog> a = new LinkedHashSet<>();
		Set<StudentsLog> b = new LinkedHashSet<>();
		Set<StudentsLog> c = new LinkedHashSet<>();
		
		System.out.print("How many students for course A? ");
		
		int resp = sc.nextInt();
		
			for (int j = 1; j <= resp; j++) {
				
				StudentsLog registration = new StudentsLog(sc.nextInt());
				
				a.add(registration);
				
			}
			
		System.out.print("How many students for course B? ");
			
		int ans = sc.nextInt();
			
		for (int k = 1; k <= ans; k++) {
				
				StudentsLog registration = new StudentsLog(sc.nextInt());
				
				b.add(registration);
				
		}
						
		System.out.print("How many students for course C? ");
		
		int answer = sc.nextInt();
		
		for (int l = 1; l <= answer; l++) {
			
			StudentsLog registration = new StudentsLog(sc.nextInt());
			
			c.add(registration);
			
		}	
		
		Set<StudentsLog> d = new LinkedHashSet<>();	
		d.addAll(a);
		d.addAll(b);
		d.addAll(c);
		
		System.out.print("Total students: " + d.size());		
		
		sc.close();
	}

}

