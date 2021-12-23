package entitites;

public class Students {

	public String name;
	public double n1, n2, n3;	
	public double nf, falt;
	
	public double notf() {
		return nf = n1 + n2 + n3;
	}
	public double bad() {
		return falt = 60.00 - nf;
	}	
	public String toString() {
		if ( nf > 60.00) {		 
			return "PASS";
		}	
		else {			
			return "FAILED";			
			}
		}
	}
		
	
	

