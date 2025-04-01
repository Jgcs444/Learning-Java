package curso_programacao_1;

import java.util.Locale;

public class saida_de_dados {

	public static void main(String[] args) {
		
		// Para escrever algo na tela um texto qualquer 
		
		// System.out.printf("Teste") - Realiza a impressão na tela sem que haja quebra de linhas
		
		// System.out.println("Teste") - Realiza a impressão na tela com quebra de linha
		
		// printf - mostra a saída de dados formatada de acordo com o que for designado. Ex:
		
		double valor = 10.45632;
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f\n", valor); // Printando em formato americano.

	}

}
