package Exercicios;
import java.util.Scanner;

public class Exercicio_3 {

	//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
	
	public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Olá, por favor informe um número:");
		num = sc.nextInt();
		
		if ( num < 0) {
			System.out.println("o número: " + num + " é negativo");
		} else {
			System.out.println("o número:" + num + "é positivo");
		}
		
		sc.close();
		

	}

}
