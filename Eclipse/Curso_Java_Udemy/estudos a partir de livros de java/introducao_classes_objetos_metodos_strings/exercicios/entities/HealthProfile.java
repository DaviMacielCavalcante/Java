package exercicios.entities;

public class HealthProfile {

	private String name;
	private int idade;
	private String sexo;
	private double altura;
	private double peso;
	
	
	public HealthProfile(String name, int idade, String sexo, double altura, double peso) {		
		this.name = name;
		this.idade = idade;
		this.sexo = sexo;
		this.altura = altura;
		this.peso = peso;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double imc() {
		return peso / (altura * altura);
	}
	
	public String freq() {		 
		int frequencia = 220 - idade;	
		double freqmax = frequencia * 0.85;
		return frequencia + " de frequência cardíaca máxima e " + freqmax +  " de frequência cardíaca alvo";		
	}
	
}
