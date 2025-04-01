package application;

import java.util.Scanner;

import entities.Triangle;

public class Programm {

	public static void main(String [] args) {
		
		Triangle x,y;
		Scanner sc = new Scanner(System.in);
		double p,areaX,areaY;
		
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
		
		p = (x.a + x.b + x.c) / 2.0;
		areaX = Math.sqrt(p*(p-x.a)*(p-x.b)*(p-x.c));
		System.out.printf("O valor da área do Triãngulo x é %.2f: ", areaX);

		
		p = (y.a + y.b + y.c) / 2.0;
		areaY = Math.sqrt(p*(p-y.a)*(p-y.b)*(p-y.c));
		System.out.printf("O valor da área do Triãngulo x é: %.2f", areaY);

		sc.close();
	}
	
}
