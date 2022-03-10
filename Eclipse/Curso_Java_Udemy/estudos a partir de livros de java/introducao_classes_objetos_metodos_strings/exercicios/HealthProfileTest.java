package exercicios;

import java.util.Locale;
import java.util.Scanner;

import exercicios.entities.HealthProfile;

public class HealthProfileTest {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Idade: ");
		int idade = sc.nextInt();
		System.out.print("Sexo: ");
		sc.nextLine();
		String sexo = sc.nextLine();
		System.out.print("Altura: ");		
		double altura = sc.nextDouble();
		System.out.print("Peso: ");
		double peso = sc.nextDouble();
		
		HealthProfile h = new HealthProfile(name, idade, sexo, altura, peso);
		
		System.out.println(h.getName() + ", " + h.getSexo() + ", " + h.getIdade() + " anos, " + h.getAltura() + " metros, " + h.getPeso());
		System.out.println(h.freq());
		System.out.printf("IMC: %.2f %n", h.imc());
		
		
		System.out.println("IMC VALUES: ");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal: between 18.5 and 24.9");
		System.out.println("Overweight: between 25 and 29.9");
		System.out.println("Obese: 30 or greater");
		
		sc.close();
	}

}
