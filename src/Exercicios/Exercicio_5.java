package Exercicios;
import java.util.Scanner;

public class Exercicio_5 {
	
//	Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
//	que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
//	qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
//	Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
//	mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
	
//	de 00 a 2000 isento
//	de 2000.01 a 3000 8%
//	de 3000.01 a 4500 18%
//	acima de 4500 28%
	
//	Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
//	salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
//	de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
//	duas casas decimais.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario,dif, tarifa;
		
		System.out.println("Olá, para calcular o imposto, por gentileza informe o seu salário: R$");
		salario = sc.nextDouble();
		
		if(salario <= 2000.00) {
			System.out.println("Com base em seu salário, você está isento !");
			
		} else if (salario > 2000 && salario <= 3000.00) {
			dif = salario - 2000.00;
			tarifa = dif * 0.08;
			System.out.printf("O imposto com base em seu sálario, que equivale a R$ %.2f é: R$ %.2f",salario,tarifa);	
			
		} else if(salario > 3000 && salario <= 4500.00) {
			dif = salario - 3000;
			tarifa = (dif * 0.18) + (1000*0.08);
			System.out.printf("O imposto com base em seu sálario, que equivale a R$ %.2f é: R$ %.2f",salario,tarifa);	
		} else {
			dif = salario - 4500.00;
			tarifa = ((dif * 0.28) + (1000 * 0.08) + (1500 * 0.18));
			System.out.printf("O imposto com base em seu sálario, que equivale a R$ %.2f é: R$ %.2f",salario,tarifa);
		}
		
		sc.close();
		
	}

}
