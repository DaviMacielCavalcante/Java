package Exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entitites.Products_Ex_1;

public class Ex_1 {

	public static void main(String[] args) {
		
		List<Products_Ex_1> products = new ArrayList<>();
		String path = "C:\\teste\\criado\\source file.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			
			while (line != null) {	
				
				String[] vect = line.split(",");
				
				String name = vect[0];
				Double price = Double.parseDouble(vect[1]);
				Integer quantity = Integer.parseInt(vect[2]);
				
				Products_Ex_1 p = new Products_Ex_1(name, quantity, price);
				products.add(p);
				
				line = br.readLine();
			}
			System.out.println("PRODUCTS:");
			for (Products_Ex_1 p : products){
				System.out.println(p);
			}
			
		}
		catch (IOException e){
			System.out.println("Error: " + e.getMessage());
		}
	}

}
