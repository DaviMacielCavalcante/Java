package exercicios_Estrutura_Condicional_Curso_Programacao;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int ent, sai, dur;
		ent = sc.nextInt();
		sai = sc.nextInt();
		
		if (ent < sai) {
			dur = sai - ent;
		}
		else {
			dur = 24 - ent + sai;
		}
		
		System.out.println("O JOGO DUROU " + dur + " HORA(S)");
		
		sc.close();
	}

}
