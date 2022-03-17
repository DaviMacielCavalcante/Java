package application_p;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entitites_secao_20.ProductSecao20;

public class Exemplo_1 {

	public static void main(String[] args) {
		
		List<ProductSecao20> list = new ArrayList<>();
		
		list.add(new ProductSecao20("TV", 900.0));
		list.add(new ProductSecao20("Notebook", 1200.0));
		list.add(new ProductSecao20("Tablet", 400.0));						
		
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for (ProductSecao20 p : list) {
			System.out.println(p);
		}

	}

}
