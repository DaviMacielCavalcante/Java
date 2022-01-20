package estruturas_de_repetição;

public class Teste_de_mesa12 {

	public static void main(String[] args) {
		
		int x, y;
		x = 8;
		y = 3;
		
		for (int i = 0; y < x; i += 1) {
			x = x - 2;
			y = y + 1;
			System.out.println(i);
		}
	}

}
