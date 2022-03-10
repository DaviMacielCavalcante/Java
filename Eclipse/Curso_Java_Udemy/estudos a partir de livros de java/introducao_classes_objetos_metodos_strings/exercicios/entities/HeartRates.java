package exercicios.entities;

public class HeartRates {

	private String name;
	private int dia;
	private int mes;
	private int ano;
	
	
	public HeartRates(String name, int dia, int mes, int ano) {		
		this.name = name;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public int getMes() {
		return mes;
	}


	public void setMes(int mes) {
		this.mes = mes;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String freq() {
		int idade = 2022 - ano; 
		int frequencia = 220 - idade;	
		double freqmax = frequencia * 0.85;
		return  idade +" anos, " + frequencia + " de frequência cardíaca máxima e " + freqmax +  " de frequência cardíaca alvo";		
	}
	
}
