package entities;

public class Pessoa_Fisica extends Pessoa {

	private Double gastosSaude;
	
	public Pessoa_Fisica() {
		super();
	}

	public Pessoa_Fisica(String name, Double rendaAnual, Double gastosSaude) {
		super(name, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	@Override
	public Double imposto() {
		double imp = 0;
		if (rendaAnual < 20000.00 && gastosSaude > 0) {
			imp += rendaAnual * 0.15 - gastosSaude * 0.5; 
		}
		else if (rendaAnual > 20000.00 && gastosSaude > 0) {
			imp += rendaAnual * 0.25 - gastosSaude * 0.5;
		}
		else if  (rendaAnual < 20000.00 && gastosSaude == 0){
			imp += rendaAnual * 0.15;
		}
		else if  (rendaAnual < 20000.00 && gastosSaude == 0){
			imp += rendaAnual * 0.15;
		}		
		return imp;
	}
	
}
