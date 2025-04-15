package application;

import java.util.Scanner;

import entities.Product;

public class Text {

	public static Product readFirstData(Scanner cs) {

		Product x = new Product();

		System.out.printf("\nEnter product data: \nName: ");
		x.name = cs.nextLine();
		System.out.print("Price: ");
		x.price = cs.nextDouble();
		System.out.print("Quantity in stock: ");
		x.quantity = cs.nextInt();

		return x;

	}

	public static int addNumb(Scanner sc) {
		System.out.printf("\nEnter the number of products to be added in stock: ");
		return sc.nextInt();
	}

	public static int delNumb(Scanner sc) {
		System.out.printf("\nEnter the number of products to be removed in stock: ");
		return sc.nextInt();
	}

	public static void printProductdata(Product p, String label) {
		System.out.printf("\n%s: %s; R$ %.2f; %d units; Total R$ %.2f", label, p.name, p.price, p.quantity,
				p.totalValueInStock());
	}

}
