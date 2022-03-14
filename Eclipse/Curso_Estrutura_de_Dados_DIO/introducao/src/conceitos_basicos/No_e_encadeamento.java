package conceitos_basicos;

public class No_e_encadeamento {
	
	private String conteudo;	
	private No_e_encadeamento proxNo;
	
	public No_e_encadeamento(String conteudo) {
		this.proxNo = null;
		this.conteudo = conteudo;		
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public No_e_encadeamento getProxNo() {
		return proxNo;
	}

	public void setProxNo(No_e_encadeamento proxNo) {
		this.proxNo = proxNo;
	}

	@Override
	public String toString() {
		return "No_e_encadeamento [conteudo=" + conteudo + "]";
	}
	
	
}
