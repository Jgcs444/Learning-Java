	package curso_programacao_1;
	import java.util.Scanner;
	
	public class Funcoes {
	
		public static void main(String[] args) {
			
				Scanner sc = new Scanner (System.in);
				
				System.out.println("Enter Three numbers:");
				
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				
				int higher = max(a,b,c);
				showResult(higher);
				
				sc.close();

			}
			
			public static int max (int x,int y,int z) {
				int aux;
				if( x>y && x>z) {
					aux = x;
				} else if (y>z) {
					aux = y;
				} else {
					aux = z;
				}
				return aux;
			}
			
			public static void showResult (int x) { 
				System.out.println("o maior valor é:" + x);
			}

		}
