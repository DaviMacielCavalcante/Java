package exercicios;

import java.util.Scanner;

public class Exercicio_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o primeiro n�mero: ");
		int x = sc.nextInt();
		System.out.print("Informe o segundo n�mero: ");
		int y = sc.nextInt();
		
		if (x > y) {
			System.out.println("O primeiro n�mero � maior.");
		}
		else if (x < y) {
			System.out.println("O segundo n�mero � maior.");
		}
		else {
			System.out.println("Os n�mero s�o iguais");
		}
		
		int sum = x + y;
		int mult = x * y;
		int dif = x - y;
		int div = x / y;
		int med = (int) (x + y) / 2;
		System.out.println(sum + " " + med + " " + mult + " " + dif + " " + div);
		
		sc.close();


	}

}
