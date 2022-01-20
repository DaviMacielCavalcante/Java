package util;

public class CurrencyConverter {

	public static double IOF = 0.06;
	
	public static double result (double valorDolar, double dolarQuant) {		
		double vf = valorDolar * dolarQuant;
		return vf = vf + (vf * IOF); 
	}
}
