
public class Curso {
	private int codigo;
	private String nome;
	
	public Curso() {
	}
	
	public Curso(int codigo, String nome) {
		this.codigo =codigo;
		this.nome = nome;
	}
	
	public boolean checaCodigo(int codigo){
		if (codigo>=1&&codigo<=5)
			return true;
		else
			return false;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		if (codigo >0)
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome.length()>=4)
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", nome=" + nome + "]";
	}
	
}
