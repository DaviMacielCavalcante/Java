package com.loiane.estruturadados.vetor;

public class Vetor {
	
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho =0;
	}
	
	/*m�todo adiciona elementos, mas precisa
	 * percorrer todo o vetor para procurar uma
	 * posi��o nula
	*/
	/*public void adiciona(String elemento) {
		for (int i=0; i < this.elementos.length ; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/
	
	/*m�todo adiciona elementos, mas n�o precisa
	 * percorrer todo o vetor para procurar uma
	 * posi��o nula
	 * Por�m, este m�todo gera uma exce��o.
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
	
	//Este m�todo retorna se foi poss�vel realizar a opera��o sem gerar exce��o	 	 
		
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

