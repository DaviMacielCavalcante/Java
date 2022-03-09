package exemplos;

import java.util.Scanner;

public class Exemplo_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter first integer: ");
		int n1 = sc.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = sc.nextInt();
		
		int sum = n1 + n2;
		System.out.printf("Sum is %d%n", sum);
		
		sc.close();
	}
	
}
