package Exercicios;
import java.util.Scanner;

public class Exercicio_2 {

// Problema: 
	// Uma operadora de telefonia cobra R$ 50.00 por um plano básico que
	//dá direito a 100 minutos de telefone. Cada minuto que exceder a
	//franquia de 100 minutos custa R$ 2.00. Fazer um programa para ler a
	//quantidade de minutos que uma pessoa consumiu, daí mostrar o valor
	//a ser pago.
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int min,dif;
		double valorT,tarifa,valorI = 50.00;
		
		
		System.out.println("Olá, por favor informe a quantidade de minutos usados: ");
		min = sc.nextInt();
		System.out.println("O total de minutos usados foi: " + min);
		
		if( min > 100) {
			dif = min - 100;
			tarifa = dif * 2.00;
			valorT = valorI + tarifa;
			System.out.printf("Com base nos minutos informados, o valor da sua conta é : R$ %.2f",valorT );
		} else {
			System.out.printf("Com base nos minutos informados, o valor da sua conta é : R$ %.2f",valorI );
		}
		
	
		

		sc.close();
	}

}