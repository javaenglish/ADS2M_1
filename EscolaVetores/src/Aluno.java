
public class Aluno {
	private String cpf;
	private String nome;
	private Curso curso = new Curso();
	
	public Aluno() {
	}

	public Aluno(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public boolean checaCpf(String cpf){
		if (cpf.length()==11)
			return true;
			else
				return false;
	}
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		if (cpf.length()== 11)
			this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public boolean checkName(String nome){
		if (nome.length()>=4 && nome.length() <=40)
			return true;
		else
			return false;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
