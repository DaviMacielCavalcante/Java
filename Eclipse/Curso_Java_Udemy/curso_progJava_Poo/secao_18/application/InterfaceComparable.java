package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Employee_Secao18;

public class InterfaceComparable {

	public static void main(String[] args) {
		
		List<Employee_Secao18> list = new ArrayList<>();
		
		String path = "C:\\teste\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String employeeCsv = br.readLine();
			
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				list.add(new Employee_Secao18(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}
			Collections.sort(list);
		
			for (Employee_Secao18 s : list) {
				System.out.println(s.getName() + ", " + s.getSalary());
			}
		} 
		catch (IOException e) {
		System.out.println("Error: " + e.getMessage());
		}

	}

}
