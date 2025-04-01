package curso_programacao_1;

public class Main {

	public static void main(String[] args) {
		
		// Public - Quer dizer que o método é público, ou seja, a função pode ser chamado de fora da classe. 
		// A JVM precisa acessar esse método, então ele precisa ser público.
		// static - Quer dizer que o método não depende de uma instância da classe para ser executada. A JVM chama ela 
		// sem criar um objeto dessa classe. É como ler a receita de um bolo sem precisar fazer o bolo em si.
		// void - O método não retorna nada
		// main - O nome padrão que a JVM procura. Tem que ser exatamente main
		// String [] args - Um array de argumentos, que podem ser passados pela linha de comando ( tipo java MinhaClasse
		//argumento1 argumento2).args Nem sempre se usa, mas tem que estar ali. O args é apenas uma convenção, poderia 
		// ter qualquer outro nome, desde que atenda o padrão, onde o método chama main, seja public static, 
		// retorna void ( não necessariamente), 
		// e recebe um array de String como pâramentro.
		
		System.out.println("Olá mundo, testando");

	}

}
