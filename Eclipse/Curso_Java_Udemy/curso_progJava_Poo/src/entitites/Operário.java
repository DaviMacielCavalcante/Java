package entitites;

public class Operário {

	public String name;
	public double brutesal;
	public double impis;
	public double persal;
	public double newSal;
	
	public double reals() {
		return newSal = brutesal - impis;
	}
	
	public double incrsal() {
		return brutesal = newSal + ((persal * brutesal)/100);
	}
	public String toString() {
		return "Updated data : "
				+ name
				+ ", $"
				+ String.format("%.2f%n", incrsal());				
	}
}
