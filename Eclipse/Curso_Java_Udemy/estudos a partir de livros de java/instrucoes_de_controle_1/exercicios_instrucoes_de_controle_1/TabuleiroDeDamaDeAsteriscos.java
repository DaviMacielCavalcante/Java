package exercicios_instrucoes_de_controle_1;

public class TabuleiroDeDamaDeAsteriscos {

	public static void main(String[] args) {
		
		for (int a = 0; a < 4; a++) {
			for (int i = 1; i <= 7; i++) {
				System.out.print("* ");				
			}
			System.out.println();
			System.out.print(" ");
			for (int j = 1; j <= 7; j++) {				
				System.out.print("* ");				
			}
			System.out.println();
		}
			
	}
}
