package Exercicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitites.Products_Ex_1;

public class Ex_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		List<Products_Ex_1> products = new ArrayList<>();
		String path = "C:\\teste\\criado\\source file.txt";
		
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();			
		
		boolean success = new File(strPath + "\\out").mkdir();
		System.out.println("Creation of new folder: " + success);		
		
		String dPath = "C:\\teste\\criado\\out\\summary.csv.txt";
		
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
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(dPath, true))) {
				for (Products_Ex_1 lines1 : products) {
					bw.write(lines1.getName() + "," + String.format("%.2f", lines1.fPrice()));
					bw.newLine();					
				}
			}			
			catch (IOException e) {
				e.printStackTrace();;
			}
		}
		catch (IOException e){
			System.out.println("Error: " + e.getMessage());
		}	
		
		sc.close();
	}
}
