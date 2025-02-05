package Exercicios;
import java.util.Scanner;

public class Exericicio_7 {

	public static void main(String[] args) {
//		Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//		começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//		exemplo.
		
		int num, quadrado, cubo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por gentileza, informe o número desejado:");
		num = sc.nextInt();
		
		for(int i=1; i<num+1; i++) {
			quadrado = (int) Math.pow(i, 2);
			cubo = (int) Math.pow(i, 3);
			
//			No caso de %-4d, temos:
//
//			    % → Indica que é um especificador de formato.
//			    - → Alinha o valor à esquerda (sem ele, o alinhamento é à direita).
//			    4 → Define a largura mínima de 4 caracteres para o número.
//			    d → Especifica que o valor é um número inteiro (int, short, long, etc.).
//			
			
			System.out.printf("%-4d %-4d %-4d%n", i, quadrado, cubo);
		} 
		
		
		sc.close();
		
	}

}
