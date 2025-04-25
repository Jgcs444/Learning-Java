package application;

import java.util.Scanner;

import entities.Product;

public class Text {

	public static Product readFirstData(Scanner cs) {

		System.out.printf("\nEnter product data: \nName: ");
		String name = cs.nextLine();
		System.out.print("Price: ");
		double price = cs.nextDouble();
		System.out.print("Quantity in stock: ");
		int quantity = cs.nextInt();
		
		Product product = new Product(name, price, quantity);

		return product;

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

	// Por que tudo aqui é static ?
	// 1 - Não são criados objetos da classe Text;
	// 2 - Os métodos são utilitários - recebem tudop que precisam;
	
}
