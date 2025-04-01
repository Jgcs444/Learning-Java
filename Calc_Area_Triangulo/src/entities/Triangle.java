package entities;

public class Triangle {
	
	public double a;
	public double b;
	public double c;
	
	public double area () {
		// O double é o tipo de dado que o método vai retornar, caso não precise retornar nada, usa-se o void
		// area o nome da função/método;
		
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));

	
	}

}
