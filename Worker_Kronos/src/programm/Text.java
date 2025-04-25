package programm;

import java.util.Scanner;

import entities.Worker;

public class Text {
	
	
	/*
	 * public static void printInfo(Worker x) {
	 * System.out.printf("\nEmployee: %s; $%.2f", x.name, x.netSalary()); }
	 */

	public static double questionUser(Scanner sc) {
		System.out.println("\nWhich percentage to increase salary ?");
		return sc.nextDouble();
	}
}
