package Exercicios;
import java.util.Scanner;
public class Refazendo_exercicio_7 {

	public static void main(String[] args) {
		
		int i,num;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, informe o número: ");
		num = sc.nextInt();
		
		for (i=1; i<num+1; i++) {
			System.out.printf("%-4d %-4d %-4d%n", i, i*i, i*i*i);
		}
		
		sc.close();

	}

}
