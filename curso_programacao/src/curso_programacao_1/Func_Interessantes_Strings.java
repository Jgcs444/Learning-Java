package curso_programacao_1;

public class Func_Interessantes_Strings {

	public static void main(String[] args) {
		
		// Funções para:
//		- Formatar: toLowerCase(), toUpperCase, trim() ( remover espaços)
//		- Recortar: substring(inicio), substring(inicio,fim)
//		- Substituit: replace(char,char), Replace(string,string)
//		- Buscar: IndexOf, LasIndexOf
//		- str.Split("") Separar uma string com base no que for informado
		
		String palavra = "abcde ABCDE FGHIJ abc DEFG   -      ";
		String frase = "I'm Veagence";
		
		String[] vect = frase.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		
		System.out.println(palavra.toLowerCase());
		System.out.println(palavra.toUpperCase());
		System.out.println(palavra.trim());
		System.out.println(palavra.substring(4));
		System.out.println(palavra.substring(1,4));
		System.out.println(palavra.replace('a','x'));
		System.out.println(palavra.replace("abcde","olá"));
		System.out.println(palavra.indexOf("D"));
		System.out.println(palavra.lastIndexOf("a"));
		
		System.out.println(word1);
		System.out.println(word2);

		

	}

}
