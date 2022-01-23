package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus2;

public class Order2 {

	private Date moment;
	private OrderStatus2 status;
	private Client client;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private List<OrderItem> oI = new ArrayList<>();
	
	public Order2() {		
	}	
	
	public Order2(Date moment, OrderStatus2 status, Client client) {		
		this.moment = moment;
		this.status = status;
		this.client = client;
	}	

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus2 getStatus() {
		return status;
	}

	public void setStatus(OrderStatus2 status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}	

	public void addItem(OrderItem item) {
		oI.add(item);
	}

	public void removeitem(OrderItem item) {
		oI.remove(item);
	}
	
	public Double total() {
		double totalprice = 0.0;		
		for (OrderItem c : oI) {
			 totalprice += + c.subTotal();			
		}		
		return totalprice;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : oI) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
		}
}
	

