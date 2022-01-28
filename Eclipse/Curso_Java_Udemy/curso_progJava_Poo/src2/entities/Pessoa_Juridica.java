package entities;

public class Pessoa_Juridica extends Pessoa {

	private Integer numEmp;
	
	public Pessoa_Juridica() {
		super();
	}

	public Pessoa_Juridica(String name, Double rendaAnual, Integer numEmp) {
		super(name, rendaAnual);
		this.numEmp = numEmp;
	}

	public Integer getNumEmp() {
		return numEmp;
	}

	public void setNumEmp(Integer numEmp) {
		this.numEmp = numEmp;
	}
	
	@Override
	public Double imposto() {
		double imp = 0;
		if (numEmp > 10) {
			imp += rendaAnual * 0.14; 
		}
		else if (numEmp < 10) {
			imp += rendaAnual * 0.16;
		}			
		return imp;
	}
	
}
