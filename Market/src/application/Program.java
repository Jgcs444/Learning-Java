package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Product x = Text.readFirstData(sc);
		
		double total = x.valor_T();
		
		System.out.printf("\nProduct data: %s; R$ %.2f; %d units; Total R$ %.2f", x.name, x.price, x.quantity, total);
		
		int newQuantity = Text.addNumb(sc);
		x.addNewQuantity(newQuantity);
		total = x.valor_T();
		
		System.out.printf("\nUpdated data: %s; R$ %.2f; %d units; Total R$ %.2f", x.name, x.price, x.quantity, total);
		
		
		sc.close();
		
	}

}
