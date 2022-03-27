package application_p;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import entitites_secao_20.EmployeeSecao20;

public class Exercicio_de_Fixacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			List<EmployeeSecao20> list = new ArrayList<>();
			
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new EmployeeSecao20(fields[0], fields [1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.print("Enter salary: ");
			Double salary = sc.nextDouble();
			
			System.out.printf("Email of people whose salary is more than %.2f:\n", salary);
			List<String> novaList = list.stream()
					.filter(e -> e.getSalary() > salary)
					.map(e -> e.getEmail())
					.sorted((sal1, sal2) -> sal1.toUpperCase().compareTo(sal2.toUpperCase()))
					.collect(Collectors.toList());
			
			novaList.forEach(System.out::println);
			sc.nextLine();
			System.out.print("Enter the initial letter of the name you want the sum of salarys: ");
			char letter = sc.nextLine().toUpperCase().charAt(0);
			
			
			Double sumSalary = list.stream()
					.filter(e -> e.getName().toUpperCase().charAt(0) == letter)
					.map(e -> e.getSalary())
					.reduce(0.0, (x, y) -> x+y);
			
			System.out.printf("Sum of salary whose name starts with %s : %.2f", letter, sumSalary);
		}
		catch (IOException e){
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
