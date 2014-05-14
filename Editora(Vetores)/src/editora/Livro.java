package editora;

public class Livro {
	private String autor;
	private int numeroDePaginas;
	private String editora;
	private String titulo;
	
	public Livro() {
		
	}
	
	public Livro(String autor, int numeroDePaginas, String editora, String titulo) {
		if (autor.length() > 0 && autor.length() > 5)
			this.autor = autor;
		if (numeroDePaginas >0)
			this.numeroDePaginas = numeroDePaginas;
		this.editora = editora;
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getNumeroDePaginas() {
		return numeroDePaginas;
	}

	public String getEditora() {
		return editora;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setNumeroDePaginas(int numeroDePaginas) {
		this.numeroDePaginas = numeroDePaginas;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", numeroDePaginas=" + numeroDePaginas
				+ ", editora=" + editora + ", titulo=" + titulo + "]";
	}

}
