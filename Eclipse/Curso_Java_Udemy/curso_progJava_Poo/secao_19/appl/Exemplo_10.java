package appl;

import java.util.HashSet;
import java.util.Set;
import entities.Product_secao_19;

public class Exemplo_10 {

	public static void main(String[] args) {
		
		Set<Product_secao_19> set = new HashSet<>();
		
		set.add(new Product_secao_19("TV", 900.0));
		set.add(new Product_secao_19("Notebook", 1200.0));
		set.add(new Product_secao_19("Tablet", 400.0));
		
		Product_secao_19 prod = new Product_secao_19("Notebook", 1200.0);
		
		System.out.println(set.contains(prod));

	}

}
