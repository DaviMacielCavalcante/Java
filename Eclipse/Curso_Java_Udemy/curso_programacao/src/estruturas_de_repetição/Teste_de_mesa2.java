package estruturas_de_repeti��o;

public class Teste_de_mesa2 {

	public static void main(String[] args) {

		int x, y;
		x = 2;
		y = 10;
		
		System.out.println("Ol�");
		
		while ( x < y) {
			System.out.println(x + "-" + y);
			x = x * 2;
			y = y + 1;
		}
	}

}
