package aplication;

import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Triangle x = Text.lerTriangulo (sc, "X");
		Triangle y = Text.lerTriangulo (sc, "Y");
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("\n\nO valor da área do primeiro triângulo é: %.2f", areaX);
		System.out.printf("\n\nO valor da área do segundo triângulo é: %.2f", areaY);
		
		sc.close();

	}

}
