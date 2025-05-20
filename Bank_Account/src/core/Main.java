package core;

import java.util.Scanner;

import entities.User;

public class Main {

	public static void main(String[] args) {

		System.out.println("Welcome to Kronos Bank ! \n");

		double added, removed;
		Scanner sc = new Scanner(System.in);
		User x = Text.collectInfo(sc);

		Text.printInfo(x);
		added = Text.insertNewvalue(sc);
		x.insertValue(added);

		Text.printInfo(x);

		removed = Text.removeWithdraw(sc);
		x.withdrwal(removed);

		Text.printInfo(x);

		sc.close();
	}

}
