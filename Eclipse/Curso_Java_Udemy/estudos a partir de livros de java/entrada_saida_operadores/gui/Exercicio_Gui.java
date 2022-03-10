package gui;

import javax.swing.JOptionPane;

public class Exercicio_Gui {

	public static void main(String[] args) {

		String n1 = JOptionPane.showInputDialog("Informe o primeiro número: ");
		
		String n2 = JOptionPane.showInputDialog("Informe o segundo número: ");
		
		Integer number1= Integer.parseInt(n1);
		
		Integer number2= Integer.parseInt(n2);
		
		
		int sum = number1 + number2;
		
		String message = String.format("O resultado é: %d", sum);
		JOptionPane.showMessageDialog(null, message);

	}

}
