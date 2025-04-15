package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Product x = Text.readFirstData(sc);

		Text.printProductdata(x, "Product data: ");

		int newQuantity = Text.addNumb(sc);
		x.addNewQuantity(newQuantity);
		Text.printProductdata(x, "Updated data: ");

		int deleteQuantity = Text.delNumb(sc);
		x.removeQuantity(deleteQuantity);
		Text.printProductdata(x, "Updated data: ");

		sc.close();

	}

}
