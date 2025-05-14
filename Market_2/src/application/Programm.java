package application;

import java.util.Scanner;

import entities.Product;

public class Programm {

	public static void main(String[] args) {

		System.out.println("Olá, bem vindo ao mercado Maria Carolina Toledo !");

		Scanner sc = new Scanner(System.in);
		Product x = Text.info(sc);

		Text.printInfo(x, "Product Data: ");

		int newQuantity = Text.requestAdd(sc);
		x.addNum(newQuantity);
		Text.printInfo(x, "Product Data: ");

		newQuantity = Text.requestRemove(sc);
		x.removeNum(newQuantity);
		Text.printInfo(x, "Product Data: ");

	}

}
