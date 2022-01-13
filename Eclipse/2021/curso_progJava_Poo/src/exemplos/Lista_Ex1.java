package exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista_Ex1 {

	public static void main(String[] args) {

		List <String> list = new ArrayList<>();
		
		list.add("Grimaldus");
		list.add("Nero");
		list.add("Priamus");
		list.add("André");
		list.add("Kado");
		list.add(2, "Mechanicus");
		
		System.out.println(list.size());
				
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------------------");
		list.remove(3);
		list.removeIf(x -> x.charAt(0) == 'M');
		System.out.println(list.size());
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("--------------------------------");
		System.out.println("Index of Kado: " + list.indexOf("Kado"));
		list.removeIf(x -> x.charAt(0) == 'M');
		System.out.println("--------------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("--------------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
		System.out.println(name);
		String name2 = list.stream().filter(x -> x.charAt(0) == 'X').findFirst().orElse(null);
		System.out.println(name2);
	}

}
