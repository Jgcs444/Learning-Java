package curso_programacao_1;

public class Condicional_Ternaria {

	public static void main(String[] args) {
		
		//Estrutura opcional ao if e else quando se deseja decidir um valor com base em uma condição
		
		//Sintaxe
		
		// ? é um operador ternário usado para tomar decisões curtas e rápidas;
		//( condição ) ? valor_se_verdadeiro : valor_se_falso

		//Ex:
			
			//(2>4) ? 50:80;
			
			double preco = 34.5;
			double desc = (preco < 10) ? preco*0.05:preco*0.2;
			
			System.out.printf("O valor total é: R$ %.2f",desc) ;
		
	}

}
