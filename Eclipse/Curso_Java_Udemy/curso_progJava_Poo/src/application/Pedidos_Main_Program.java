package application;

import java.util.Date;

import entities.enums.OrderStatus;
import entitites.Pedidos;

public class Pedidos_Main_Program {

	public static void main(String[] args) {

		Pedidos order = new Pedidos(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
