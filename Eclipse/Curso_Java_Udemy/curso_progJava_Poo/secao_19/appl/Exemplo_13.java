package appl;

import java.util.HashMap;
import java.util.Map;

import entities.Products_Map;

public class Exemplo_13 {

	public static void main(String[] args) {

		Map<Products_Map, Double> stock = new HashMap<>();
		
		Products_Map p1 = new Products_Map("Tv", 900.00);
		Products_Map p2 = new Products_Map("Nootebook", 1200.00);
		Products_Map p3 = new Products_Map("Tablet", 400.00);
		
		stock.put(p1, 10000.00);
		stock.put(p2, 20000.00);
		stock.put(p3, 15000.00);
		
		Products_Map ps = new Products_Map("Tv", 900.00);
		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
		System.out.println(stock);
	}

}
