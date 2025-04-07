package application;

import java.util.Scanner;

import entities.Triangle;

public class Text {

	public static Triangle lerTriangulo (Scanner sc, String nome) {
		
		Triangle t = new Triangle();
		
		System.out.printf("\nInforme o valor A do trinângulo %s: ", nome);
		t.a = sc.nextDouble();
		System.out.printf("\nInforme o valor B do trinângulo %s: ", nome);
		t.b = sc.nextDouble();
		System.out.printf("\nInforme o valor C do trinângulo %s: ", nome);
		t.c = sc.nextDouble();
		
		return t;
	}

}
