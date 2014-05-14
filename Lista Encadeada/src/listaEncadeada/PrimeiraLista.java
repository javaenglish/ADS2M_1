package listaEncadeada;

public class PrimeiraLista {
	
	Nodo n = new Nodo();
	private int valor;
	private String ant;
	private boolean vazia;
	
	
	public Nodo getN() {
		return n;
	}

	public void setN(Nodo n) {
		this.n = n;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public String getAnt() {
		return ant;
	}

	public void setAnt(String ant) {
		this.ant = ant;
	}

	public boolean isVazia() {
		return vazia;
	}

	public void setVazia(boolean vazia) {
		this.vazia = vazia;
	}
}
