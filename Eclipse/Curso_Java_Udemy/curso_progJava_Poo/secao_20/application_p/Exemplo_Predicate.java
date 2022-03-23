package application_p;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entitites_secao_20.ProductSecao20;

public class Exemplo_Predicate {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);		
		List<ProductSecao20> list = new ArrayList<>();
		
		list.add(new ProductSecao20("TV", 900.0));
		list.add(new ProductSecao20("Mouse", 50.00));		
		list.add(new ProductSecao20("Tablet", 350.50));	
		list.add(new ProductSecao20("HD Case", 80.90));
		
		list.removeIf( p -> p.getPrice() >= 100);
		
		for (ProductSecao20 p : list) {
			System.out.println(p);
		}

	}

}
