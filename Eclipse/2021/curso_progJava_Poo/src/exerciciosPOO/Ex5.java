package exerciciosPOO;

import java.util.Locale;
import java.util.Scanner;

import entitites.ContaBancaria;

public class Ex5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		
		System.out.print("Enter account number: ");
		int accNumb = sc.nextInt();			
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();		
		ContaBancaria Cb = new ContaBancaria(name, accNumb);		
		System.out.print("Is there an initial deposit (y/n)? ");		
		char ans = sc.next().charAt(0);		
		if (ans == 'y'){			
			System.out.print("Enter initial deposit value: ");
			double accSal = sc.nextDouble();
			Cb.setAccSal(accSal);		
		}				
		Cb.setAccNumb(accNumb);		
		System.out.println();		
		System.out.println("Account data: ");
		System.out.println(Cb);				
		System.out.print("Enter a deposit value: ");
		double accSal = sc.nextDouble();
		Cb.depoSal(accSal);
		System.out.println("Updated account data: ");
		System.out.println(Cb);		
		System.out.print("Enter a withdraw value: ");
		double retSal = sc.nextDouble();
		Cb.saqSal(retSal);
		System.out.println("Updated account data: ");
		System.out.println(Cb);
		
		sc.close();
	}

}
