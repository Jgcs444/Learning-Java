package entities;

//// Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
//válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
//possui a maior área.
//A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
// órmula de Heron

public class Triangle {

	public double a;
	public double b;
	public double c;
	
	public double area () {
		double h = (a+b+c)/2.0;
		return Math.sqrt((h-a)*(h-b)*(h-c)*h);
	}

}
