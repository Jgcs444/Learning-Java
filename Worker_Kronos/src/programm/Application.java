package programm;

import java.util.Scanner;

import entities.Worker;

public class Application {

	public static void main(String[] args) {

		Worker amorDaMinhaVida = new Worker();

		Scanner sc = new Scanner(System.in);
		double percentage;

		Text.printInfo(amorDaMinhaVida);
		percentage = Text.questionUser(sc);

		amorDaMinhaVida.increaseSalary(percentage);

		Text.printInfo(amorDaMinhaVida);

	}

}
