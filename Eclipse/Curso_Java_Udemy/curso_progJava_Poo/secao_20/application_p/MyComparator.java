package application_p;

import java.util.Comparator;

import entitites_secao_20.ProductSecao20;

public class MyComparator implements Comparator<ProductSecao20> {

	@Override
	public int compare(ProductSecao20 p1, ProductSecao20 p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
