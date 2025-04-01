package Exercicios;

import java.util.Scanner;

public class Exercicio_6 {

	public static void main(String[] args) {

//		Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
//		Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o
//		programa.

		// F = (9c/5) + 32;

		Scanner sc = new Scanner(System.in);
		double c, conve;
		String choice = null;
		
		do {
			System.out.println("\n Por favor informe a temperatura em graus Celsius para que seja feita a conversão:");
			c = sc.nextDouble();
			sc.nextLine();
			conve = (9 * c / 5) + 32;
			System.out.printf("\n O valor convertido equivale a: %.2f \n", conve);
			System.out.printf("\n Deseja repetir ?");
			choice = sc.nextLine();
			
			// Obs muito importante, Em java strings não devem ser comparadas com != ou ==, pois isso compara referência de 
			//memória e não os valores das strings em si. A comparação correta deve ser feita com .equals() 
			//u .iqualsIgnoreCase()
			// String pool = é uma área imutável da memory heap onde o java armazena strings imutáveis
			// para econimizar memória e melhorar a performace.

		} while (!choice.equalsIgnoreCase("Não"));
		
		sc.close();

	}

}
