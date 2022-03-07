package appl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.ProductSecao19;
import services.CalculationService;

public class Exemplo_2 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		List<ProductSecao19> list = new ArrayList<>();
		
		String path = "C:\\teste\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while (line != null) {
				
				String[] field = line.split(",");
				
				list.add(new ProductSecao19(field[0], Double.parseDouble(field[1])));
				line = br.readLine();
			}
			
			ProductSecao19 x = CalculationService.max(list);
			System.out.print("Most expensive: ");
			System.out.println(x);
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
			
			
	}

}


