package gui;

import javax.swing.JOptionPane;

public class Exercicio_Gui {

	public static void main(String[] args) {

		String n1 = JOptionPane.showInputDialog("Informe o primeiro n�mero: ");
		
		String n2 = JOptionPane.showInputDialog("Informe o segundo n�mero: ");
		
		Integer number1= Integer.parseInt(n1);
		
		Integer number2= Integer.parseInt(n2);
		
		
		int sum = number1 + number2;
		
		String message = String.format("O resultado �: %d", sum);
		JOptionPane.showMessageDialog(null, message);

	}

}
