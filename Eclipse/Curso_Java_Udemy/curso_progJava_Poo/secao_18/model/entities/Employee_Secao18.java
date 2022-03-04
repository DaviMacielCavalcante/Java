package model.entities;

public class Employee_Secao18 implements Comparable<Employee_Secao18> {

	private String name;
	private Double salary;
	
	public Employee_Secao18(String name, Double salary) {		
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee_Secao18 o) {
		return name.compareTo(o.getName());
	}	
	
}
