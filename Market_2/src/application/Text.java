package application;

import java.util.Scanner;

import entities.Product;

public class Text {

	public static Product info(Scanner sc) {

		String name;
		double price;
		int quantity;

		System.out.println("\nPlease enter the product name: ");
		name = sc.nextLine();
		System.out.println("Please enter the product price: ");
		price = sc.nextDouble();
		System.out.println("Please enter the quantity: ");
		quantity = sc.nextInt();

		Product product = new Product(name, price, quantity);
		return product;
	}

	public static void printInfo(Product p, String label) {
		System.out.printf("\n%s: %s; R$ %.2f; %d units; Total R$ %.2f", label, p.getName(), p.getPrice(),
				p.getQuantity(), p.Total());
	}

	public static int requestAdd(Scanner sc) {
		System.out.println("\nPlease, inform the quantity to be added to the stock: ");
		return sc.nextInt();
	}

	public static int requestRemove(Scanner sc) {
		System.out.println("\nPlease, inform the quantity to be removed from the stock: ");
		return sc.nextInt();
	}
}
