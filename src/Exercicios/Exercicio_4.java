package Exercicios;
import java.util.Scanner;


public class Exercicio_4 {

	//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
	
	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Olá, por favor informe um número:");
		num = sc.nextInt();
		
		if (num%2 == 0 ) {
			System.out.println("O número " + num + " é par");
		} else {
			System.out.println("O número " + num + " é impar");
		}
		
		sc.close();

	}

}
