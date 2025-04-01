package aplication;

import java.util.Scanner;

import entities.Triangle;

public class Text {
	
	public static Triangle lerTriangulo ( Scanner sc, String valor) {
		Triangle t = new Triangle();
		
		System.out.printf("Olá, por gentileza informe o valor A do triângulo %s:", valor);
		t.a = sc.nextDouble();
		System.out.printf("Olá, por gentileza informe o valor B do triângulo %s:", valor);
		t.b = sc.nextDouble();
		System.out.printf("Olá, por gentileza informe o valor C do triângulo %s:", valor);
		t.c = sc.nextDouble();
		
		return t;
	}

}
