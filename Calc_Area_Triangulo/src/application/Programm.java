package application;

import java.util.Scanner;

import entities.Triangle;

public class Programm {

	public static void main(String [] args) {
		
		Triangle x,y;
		Scanner sc = new Scanner(System.in);
		double areaX,areaY;
		
		x = new Triangle();
		y = new Triangle();
		
		// Instanciado um obj do tipo Triangle em uma área de memória chamada heap, onde são criados objs dinâmicos, durante 
		// a execução.
		
		System.out.print("\nOlá, por gentileza informe um número para o lado A do primeiro triangulo : \n ");
		x.a = sc.nextDouble();
		System.out.print("\nOlá, por gentileza informe um número para o lado B do primeiro triangulo: \n ");
		x.b = sc.nextDouble();
		System.out.print("\nOlá, por gentileza informe um número para o lado C do primeiro triangulo : \n ");
		x.c = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("\nOlá, por gentileza informe um número para o lado A: ");
		y.a = sc.nextDouble();
		System.out.println("\nOlá, por gentileza informe um número para o lado B: ");
		y.b = sc.nextDouble();
		System.out.println("\nOlá, por gentileza informe um número para o lado C: ");
		y.c = sc.nextDouble();
		
		areaX = x.area();
		areaY = y.area();
		
		System.out.printf("O valor da área do Triãngulo x é %.2f: ", areaX);
		System.out.printf("\nO valor da área do Triãngulo y é %.2f: ", areaY);

		sc.close();
	}
	
}
