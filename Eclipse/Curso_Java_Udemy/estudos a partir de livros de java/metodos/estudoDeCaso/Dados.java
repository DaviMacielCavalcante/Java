package estudoDeCaso;

import java.security.SecureRandom;

public class Dados {

	public static void main(String[] args) {

		SecureRandom randomNumbers = new SecureRandom();		

		// faz o loop 20 vezes
		for (int counter = 1; counter <= 20; counter++) {
			int face = 1 + randomNumbers.nextInt(6);
			System.out.printf("%d ", face); // exibe o valor gerado
			if (counter % 5 == 0)
				System.out.println();
		}

	}

}
