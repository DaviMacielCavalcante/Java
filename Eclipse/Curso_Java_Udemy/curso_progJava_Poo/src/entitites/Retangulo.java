package entitites;

public class Retangulo {

	
	public double compr;
	public double alt;
	
	
	public double area() {
		return compr * alt;
	}
	public double diag() {
		return Math.sqrt(Math.pow(compr, 2) + Math.pow(alt, 2));
	}
	public double peri() {
		return compr * 2 + alt * 2;
	}
	
	public String toSring() {
			return "AREA = "
				+ String.format(" %.2f%n", area())
				+ "PERIMETER = "
				+ String.format(" %.2f%n", peri())
				+ "DIAGONAL = "
				+ String.format(" %.2f%n", diag());				
	}
}
