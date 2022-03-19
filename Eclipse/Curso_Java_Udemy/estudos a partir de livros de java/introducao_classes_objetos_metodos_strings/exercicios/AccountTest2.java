package exercicios;

import java.util.Locale;
import java.util.Scanner;

import exemplos.Exemplo_Account;
import exercicios.entities.Exemplo_Account2;

public class AccountTest2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Exemplo_Account2 myAcc = new Exemplo_Account2("Jane Green", 50.0);
		Exemplo_Account2 myAcc1 = new Exemplo_Account2("John Blue", -7.53); 
		
		System.out.printf("%s balance: $%.2f%n", myAcc.getName(), myAcc.getBalance());
		System.out.printf("%s balance: $%.2f%n", myAcc1.getName(), myAcc1.getBalance());
		
		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = sc.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		myAcc.deposit(depositAmount);
		
		
		displayAccount(myAcc);
		displayAccount(myAcc1);
		
		System.out.print("Enter deposit amount for account2: ");
		depositAmount = sc.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		myAcc1.deposit(depositAmount);
		
		displayAccount(myAcc);
		displayAccount(myAcc1);
		
		System.out.print("Informe o valor de saque: ");
		double amount = sc.nextDouble();
		myAcc.withdraw(amount);
		
		System.out.printf("Novo saldo: $%.2f", myAcc.getBalance());
					
		sc.close();
	}

	public static void displayAccount(Exemplo_Account2 account) {
		System.out.printf("%s balance: $%.2f %n", account.getName(), account.getBalance());
	}
}
