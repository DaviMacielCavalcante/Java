package application;

import java.io.File;
import java.util.Scanner;

public class Inf_caminho_arquivo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String fPath = sc.nextLine();
		
		File path = new File(fPath);
		
		System.out.println("getName: " + path.getName());

		sc.close();
	}

}
