package application;

import java.util.Scanner;

import entities.Triangle;

public class Programm {

	public static void main(String [] args) {
		
		
		Scanner sc = new Scanner(System.in);
		double areaX,areaY;
		Triangle x = Text.lerTriangulo(sc, "X");
		Triangle y = Text.lerTriangulo(sc, "Y");;
		
		// Instanciado um obj do tipo Triangle em uma área de memória chamada heap, onde são criados objs dinâmicos, durante 
		// a execução.
		
		areaX = x.area();
		areaY = y.area();
		
		System.out.printf("O valor da área do Triãngulo x é: %.2f ", areaX);
		System.out.printf("\nO valor da área do Triãngulo y é: %.2f ", areaY);

		sc.close();
	}
	
}
