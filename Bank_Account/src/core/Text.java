package core;

import java.util.Scanner;

import entities.User;

public class Text {

	public static User collectInfo(Scanner sc) {

		int acc_number;
		String user_name, choice;
		double valor_dep_inicial;

		System.out.println("Please, provide your account number: ");
		acc_number = sc.nextInt();
		sc.nextLine();
		System.out.println("Please, provide your Name: ");
		user_name = sc.nextLine();
		System.out.println("Do you intend to add a inicial value for deposit ?");
		choice = sc.nextLine();
		if (!choice.equalsIgnoreCase("No")) {
			System.out.println("Please, provide the value for incial deposit: ");
			valor_dep_inicial = sc.nextDouble();
			User user = new User(acc_number, user_name, valor_dep_inicial);
			return user;
		} else {
			User user = new User(acc_number, user_name);
			return user;

		}

	}

	public static void printInfo(User p) {
		System.out.printf("\nAccount Number: %d; User name: %s; Account value: $ %.2f", p.getAcc_Number(),
				p.getUser_name(), p.getValor_dep_inicial());
	}

	public static double insertNewvalue(Scanner sc) {
		System.out.println("\nPlease insert the new vallue to be added to your account $: ");
		return sc.nextDouble();
	}

	public static double removeWithdraw(Scanner sc) {
		System.out.println("\n Remembering that for every withdraw, there is a $5,00 tax !");
		System.out.println("\nPlease insert the withdraw vallue $: ");
		return sc.nextDouble();

	}
}
