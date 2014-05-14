package editora;

public class Revista {
	private String categoria;
	private int numeroDePaginas;
	private String titulo;
	private int edicao;	
	
	public Revista() {
	}

	public Revista(String categoria, int numeroDePaginas, String titulo, int edicao) {
		if (this.categoria.length() > 0 && this.categoria.length() > 5)
			this.categoria = categoria;
		if (this.numeroDePaginas > 0)
			this.numeroDePaginas = numeroDePaginas;
		this.titulo = titulo;
		this.edicao = edicao;
	}

	public String getCategoria() {
		return categoria;
	}

	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public int getEdicao() {
		return edicao;
	}

	public void setCategoria(String categoria) {
		if(categoria.length()>4)
		this.categoria = categoria;
	}

	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	@Override
	public String toString() {
		return "Revista [categoria=" + categoria + ", numeroDePaginas="
				+ numeroDePaginas + ", titulo=" + titulo + ", edicao=" + edicao
				+ "]";
	}

}
