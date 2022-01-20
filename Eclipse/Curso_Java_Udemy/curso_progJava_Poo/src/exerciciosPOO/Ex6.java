package exerciciosPOO;

import java.util.Scanner;

import entitites.Rooms;

public class Ex6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();		
		Rooms[] vect = new Rooms[10];
		
		for ( int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Rent #" + (i + 1) + ": ");
			System.out.print("NAME: ");
			String name = sc.nextLine();			
			System.out.print("Email: ");
			String email = sc.nextLine();			
			System.out.print("Room: ");
			int room = sc.nextInt();			
			vect[room] = new Rooms(name, email, room);
			System.out.println();
		}
		
		
		System.out.println("Busy rooms: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
