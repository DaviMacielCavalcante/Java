package exercicios.entities;

public class Employee {

	private String name;
	private String lastName;
	private double salary;
	
	public Employee() {
		
	}

	public Employee(String name, String lastName, double salary) {
		
		this.name = name;
		this.lastName = lastName;
		if (salary < 0) {
			this.salary = 0.00;
		}
		else {
			this.salary = salary;
		}		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double increaseSalary(double tax) {
		return salary = salary + (tax * salary);
	}
	
	public double anualSalary() {
		return 12 * this.salary;
	}
}
