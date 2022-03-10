package exercicios;

import exercicios.entities.HeartRates;

public class HeartRatesTeste {

	public static void main(String[] args) {

		HeartRates h = new HeartRates("Davi", 4, 7, 1997);
		
		System.out.println(h.freq());

	}

}
