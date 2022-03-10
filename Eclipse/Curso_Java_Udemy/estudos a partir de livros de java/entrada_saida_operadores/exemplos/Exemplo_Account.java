package exemplos;

public class Exemplo_Account {

	private String name;
	private double balance;	
	
	public Exemplo_Account() {
		
	}
	
	public Exemplo_Account(String name, Double balance) {
		this.name = name;
		if (balance > 0.0) {
			this.balance = balance;
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void deposit(double depositAmount) {
		if (depositAmount > 0.0) {
			balance += depositAmount;
		}
	}
	
	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("O valor de saque execede o saldo da conta");
		}
		else {
			balance -= amount;
		}		
	}
}
