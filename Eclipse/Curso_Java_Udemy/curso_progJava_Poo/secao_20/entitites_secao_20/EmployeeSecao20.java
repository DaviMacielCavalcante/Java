package entitites_secao_20;

public class EmployeeSecao20 {

	private String name;
	private String email;
	private Double salary;
	
	public EmployeeSecao20() {
		
	}
	
	public EmployeeSecao20(String name, String email, Double salary) {		
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "EmployeeSecao20 [name=" + name + ", email=" + email + ", salary=" + salary + "]";
	}
	
	
}
