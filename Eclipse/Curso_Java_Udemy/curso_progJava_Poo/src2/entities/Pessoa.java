package entities;

public abstract class Pessoa {

	protected String name;
	protected Double rendaAnual;
	
	public Pessoa() {
		
	}

	public Pessoa(String name, Double rendaAnual) {
		super();
		this.name = name;
		this.rendaAnual = rendaAnual;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public void setRendaAnual(Double rendaAnual) {
		this.rendaAnual = rendaAnual;
	}	
	
	public Double imposto() {
		double imp = 0;
		imp += rendaAnual * 0.35;
		return imp;
	}
}
