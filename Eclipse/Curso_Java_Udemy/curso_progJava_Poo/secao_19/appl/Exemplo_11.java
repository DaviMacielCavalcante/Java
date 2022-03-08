package appl;

import java.util.Set;
import java.util.TreeSet;

import entities.Product_secao_19;

public class Exemplo_11 {

	public static void main(String[] args) {
		
		Set<Product_secao_19> set = new TreeSet<>();
		
		set.add(new Product_secao_19("TV", 900.0));
		set.add(new Product_secao_19("Notebook", 1200.0));
		set.add(new Product_secao_19("Tablet", 400.0));
		
		for (Product_secao_19 p : set) {
			System.out.println(p);
		}

	}

}
