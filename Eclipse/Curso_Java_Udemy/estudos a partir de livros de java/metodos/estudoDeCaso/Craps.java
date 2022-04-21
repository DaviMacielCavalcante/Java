package estudoDeCaso;

import java.security.SecureRandom;

import enums.Status;

public class Craps {

	public static final SecureRandom randomNumbers = new SecureRandom();
	
	private static final int SNAKE_EYES = 2;
	private static final int TREY = 3;
	private static final int SEVEN = 7;
	private static final int YO_LEVEN = 11;
	private static final int BOX_CARS = 12;

	public static void main(String[] args) {

	// constantes que representam lançamentos comuns dos dados
	

	// joga uma partida de craps

	int myPoint = 0; // pontos se não ganhar ou perder na 1ª rolagem
	Status gameStatus; // pode conter CONTINUE, WON ou LOST
	int sumOfDice = rollDice(); // primeira rolagem dos dados
	// determina o estado do jogo e a pontuação com base no primeiro lançamento
	switch(sumOfDice) {
			case SEVEN: case YO_LEVEN: 
				gameStatus = Status.WON;
				break;
			case SNAKE_EYES: case TREY: case BOX_CARS: 
			gameStatus = Status.LOST;
			break;
			default: // não ganhou nem perdeu, portanto registra a pontuação
				gameStatus = Status.CONTINUE; // jogo não terminouÿ
				myPoint = sumOfDice; // informa a pontuação 
				System.out.printf("Point is %d%n", myPoint);
				break;
		}

	// enquanto o jogo não estiver completo
	while(gameStatus==Status.CONTINUE)
	{// nem WON nem LOST
		sumOfDice = rollDice(); // lança os dados novamente
		// determina o estado do jogo
		if (sumOfDice == myPoint) // vitória por pontuação
			gameStatus = Status.WON;
		else if (sumOfDice == SEVEN) // perde obtendo 7 antes de atingir a pontuação
			gameStatus = Status.LOST;
	}

	// exibe uma mensagem ganhou ou perdeu
	if(gameStatus==Status.WON)System.out.println("Player wins");else System.out.println("Player loses");
	
	// lança os dados, calcula a soma e exibe os resultados

	}

	public static int rollDice() {
		// seleciona valores aleatórios do dado
		int die1 = 1 + randomNumbers.nextInt(6); // primeiro lançamento do dado
		int die2 = 1 + randomNumbers.nextInt(6); // segundo lançamento do dado
		int sum = die1 + die2; // soma dos valores dos dados

		// exibe os resultados desse lançamento
		System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);

		return sum;
	}

}
