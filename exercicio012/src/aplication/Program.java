package aplication;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entities.Client;
import entities.OrdemItem;
import entities.OrdemStatus;
import entities.Order;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		Client cc = new Client();
		Scanner sc = new Scanner(System.in);
		IO.println("Enter client data: ");
		IO.print("Name: ");
		String name = sc.next();
		cc.setName(name);
		IO.print("Email: ");
		String email = sc.next();
		cc.setEmail(email);
		IO.print("Birth date: (dd/mm/yyyy)");
		String birth = sc.next();
		LocalDate date = LocalDate.parse(birth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		cc.setBirthDate(date);
		
		Order od = new Order();
		
		IO.println("Enter Order Data: ");
		IO.print("Status: ");
		String stats = sc.next();
		od.setStatus(OrdemStatus.valueOf(stats));
		IO.print("How many itens to this order? ");
		int itens = sc.nextInt();
		OrdemItem odi = new OrdemItem();
		for (int i = 0; i < itens; i++) {
			
			IO.println(String.format("Enter #%d item data:", i+1));
			
			Product item = new Product();
			IO.print("Product Name: ");
			String pName = sc.next();
			item.setName(pName);
			
			IO.print("Product Price: ");
			Double pPrice = sc.nextDouble();
			item.setPrice(pPrice);
			
			odi.addItem(item);
			
			IO.print("Quantity: ");
			int qtt = sc.nextInt();
			odi.setQuantity(qtt);
		}
		
		IO.println("ORDER SUMMARY:");
		IO.println("Order moment: " + od.getMoment());
		IO.println("Order status: " + od.getStatus());
		IO.println("client name: " + cc.getName());
		IO.println("client email: " + cc.getEmail());
		IO.println("client Birth Date: " + cc.getBirthDate());
		IO.println("Order itens:");
		IO.println(odi);
		IO.print("Total price: " + od.total());
	}

}
