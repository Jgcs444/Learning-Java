package Exercicios;
import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {
		
		//Ler um número inteiro N e calcular todos os seus divisores.
		
		int num,i;
		String resp;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			
			System.out.println("Por favor, informe um número para saber todos os seus divisores: ");
			num = sc.nextInt();
			sc.nextLine();
			
			System.out.printf("\nOs divisores de %d são: \n",num);
			
			for(i=1; i<=num; i++) {
				if (num % i == 0) {
					System.out.printf("%d%n",i);
				}
			}
			
			System.out.println("\nGostaria de repetir ?");
			resp = sc.nextLine();
			
		} while (!resp.equalsIgnoreCase("Não"));
		
		sc.close();
	}

}
