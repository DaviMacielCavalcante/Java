package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order2;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus2;

public class Main_Prog_1 {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product p = new Product("TV", 1000.00);		
		OrderItem oi1 = new OrderItem(1, 1000.00, p);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");		
		
		System.out.println("Enter client data: ");
		System.out.print("NAME: ");
		String name = sc.nextLine();
		System.out.print("Emai: ");
		String email = sc.nextLine();
		System.out.print("Birth Date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		Client client = new Client(name, email, birthDate);
				
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		sc.nextLine();
		OrderStatus2 status = OrderStatus2.valueOf(sc.nextLine());
		
		Order2 order = new Order2(new Date(), status, client);
		
		System.out.print("How many itens to this order? ");
		int n = sc.nextInt();
		
		for (int i=0; i <n; i++) {
			System.out.println("Enter #" + (i+1) + " item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String prodName = sc.nextLine();
			System.out.print("Product price: ");
			double prodPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int prodQ = sc.nextInt();
			
			Product product = new Product(prodName, prodPrice);
			OrderItem it = new OrderItem(prodQ, prodPrice, product);
			
			order.addItem(it);
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
	}

}
