package Exercicios;

import java.util.Scanner;

////Crie uma função que receba um número inteiro e retorne seu fatorial.
//💡 Exemplo: fatorial(5) → Retorna 120

public class Exercicio_9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int valor_u;
		String choice;

		do {
			System.out.println("Por favor, informe um número:");
			valor_u = sc.nextInt();
			sc.nextLine();
			int func_fact = fatorial(valor_u);
			texto(func_fact);
			System.out.println("Deseja informar um novo valor ?");
			choice = sc.nextLine();
		} while (!choice.equalsIgnoreCase("Não"));

		sc.close();

	}

	public static int fatorial(int x) {
		int aux = 1;
		for (int i = x; i >= 1; i--) {
			aux *= i;
		}
		return aux;
	}

	public static void texto(int y) {
		System.out.println(y);
	}

}
