package exercicios_instrucoes_de_controle_1;

import java.math.BigDecimal;
import java.util.Locale;

public class CrescimentoDemograficoMundial {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		BigDecimal popM = new BigDecimal(8000000000d);
		BigDecimal cres= new BigDecimal(0.011);
		for (int a = 0; a < 1; a++) {
			System.out.print("Ano||" + "População Mundial" + "||População adicional em relação ao ano anterior\n");
			for (int i = 1; i <=75; i++) {
				if (i < 10) {
					System.out.print("0" +i + "  ");
				}
				else {
					System.out.print(i + "  ");
				}				
				BigDecimal tax =popM.multiply(cres);				
				popM = popM.add(tax);
				System.out.printf("   %.0f", popM);
				System.out.printf("        %.0f\n", tax);
			}
		}

		
		
		
	}

}
