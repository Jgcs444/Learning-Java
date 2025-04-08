package application;

import java.util.Scanner;

import entities.Triangle;

public class Text {

	public static Triangle lerTriangulo (Scanner sc, String nome) {
		
		Triangle t = new Triangle();
		
		// Está sendo criado um objeto, com base no molde da classe Triangle, onde a váriavel t é usada para referenciar 
		// esse objeto.
		// O objeto em si é o que é criado com new Triangle(). Ele vive na memória;
		// Nós não vemos o obj em si, apenas a referência a ele ( Pelo menos em java);
		// Um objeto nada mais é que a personificação "palpavel" advinda de um molde, uma classe; Ex: Molde -> Produto, Obj -> 
		// Macarrão;
		// O t é apenas uma váriavel que guarda a referẽncia para esse objeto;
		// Usar o operador new significa que a memória está sendo alocada para um novo objeto;
		// Triangle após o new chama o construtor da classe Triangle() que inicializa o objeto;
		// Um constructor é um método especial usado para incializar os atributos do objeto.
		
		
		System.out.printf("\nInforme o valor A do trinângulo %s: ", nome);
		t.a = sc.nextDouble();
		System.out.printf("\nInforme o valor B do trinângulo %s: ", nome);
		t.b = sc.nextDouble();
		System.out.printf("\nInforme o valor C do trinângulo %s: ", nome);
		t.c = sc.nextDouble();
		
		return t;
	}

}
