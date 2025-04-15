package application;

import java.util.Scanner;

import entities.Product;

public class Text {
	
	public static Product readFirstData (Scanner sc) {
		
		Product x = new Product();
		
		System.out.printf("\nEnter product data: \nName: ");
		x.name = sc.nextLine();
		System.out.print("Price: ");
		x.price = sc.nextDouble(); 
		System.out.print("Quantity in stock: ");
		x.quantity = sc.nextInt();
		
		return x;
		
	}
	
	public static int addNumb (Scanner sc) {
		System.out.printf("\nEnter the number of products to be added in stock: ");
		return sc.nextInt();
	}

}
