package conceitos_basicos;

public class No_e_encadeamento<T> {
	
	private T conteudo;	
	private No_e_encadeamento<T> proxNo;
	
	public No_e_encadeamento(T conteudo) {
		this.proxNo = null;
		this.conteudo = conteudo;		
	}

	public T getConteudo() {
		return conteudo;
	}

	public void setConteudo(T conteudo) {
		this.conteudo = conteudo;
	}

	public No_e_encadeamento<T> getProxNo() {
		return proxNo;
	}

	public void setProxNo(No_e_encadeamento<T> proxNo) {
		this.proxNo = proxNo;
	}

	@Override
	public String toString() {
		return "No_e_encadeamento [conteudo=" + conteudo + "]";
	}
	
	
}
