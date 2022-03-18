package com.loiane.estruturadados.vetor;

public class Vetor {
	
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho =0;
	}
	
	/*método adiciona elementos, mas precisa
	 * percorrer todo o vetor para procurar uma
	 * posição nula
	*/
	/*public void adiciona(String elemento) {
		for (int i=0; i < this.elementos.length ; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/
	
	/*método adiciona elementos, mas não precisa
	 * percorrer todo o vetor para procurar uma
	 * posição nula
	 * Porém, este método gera uma exceção.
	*/
	
	/*public void adiciona(String elemento) throws Exception {
		
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}
		else {
			throw new Exception("Vetor cheio!");
		}
		
	}*/
	
	//Este método retorna se foi possível realizar a operação sem gerar exceção	 	 
		
	public boolean adiciona(String elemento) {		
			if (this.tamanho < this.elementos.length) {
				this.elementos[this.tamanho] = elemento;
				this.tamanho++;
				return true;
			}
			return false;
		}
	

	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for (int i = 0; i<this.tamanho -1; i++ ) {
			s.append(elementos[i]);
			s.append(",");
		}
		
		if (this.tamanho > 0) {
			s.append(elementos[this.tamanho-1]);			
		}
		s.append("]");
		
		return s.toString();
	}
	
	
	
}

