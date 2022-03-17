package appl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			Map<String, Integer> vl = new HashMap<>(); 
			
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Integer votes = Integer.parseInt(fields[1]);
				
				if (vl.containsKey(name)) {
					int votesSoFar = vl.get(name);
					vl.put(name, votes + votesSoFar);
				}
				else {
					vl.put(name, votes);
				}	
				
				line = br.readLine();
				
			}
			
			for (String name : vl.keySet()) {
				System.out.println(name + ":" + vl.get(name));
			}
			
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
