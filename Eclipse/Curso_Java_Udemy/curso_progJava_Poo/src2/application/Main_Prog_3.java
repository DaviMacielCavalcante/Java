package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Products3;
import entities.UsedProduct;

public class Main_Prog_3 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Products3> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			if (ch == 'c') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				Products3 commom = new Products3(name, price);
				list.add(commom);
			}
			else if (ch == 'i') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				System.out.print("Customs fee: ");
				double customs = sc.nextDouble();
				Products3 imported = new ImportedProduct(name, price, customs);
				list.add(imported);
			}
			else if (ch == 'u') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Price: ");
				double price = sc.nextDouble();
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date mDate = sdf.parse(sc.next());
				Products3 used = new UsedProduct(name, price, mDate);
				list.add(used);
			}
		}
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Products3 x: list) {
			System.out.println(x.priceTag());
		}
		
		sc.close();
	}

}
