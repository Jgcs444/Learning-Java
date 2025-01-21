package Exercicios;

public class Exercicio_1 {

	public static void main(String[] args) {
		// Calcular a área de um trapezio 
		
		// Em que a área é calculada da seguinte forma: a= (b+B)*h/2
		
		double[] valores = {6.5,5.0,8.0};
		
		double b = valores[0];
		double h = valores [1];
		double B = valores [2];
		
		double area = ((b+B)*h)/2;
		
		System.out.printf("%.2f\n",area);
		

	}

}
