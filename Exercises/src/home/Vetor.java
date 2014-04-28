package home;

public class Vetor<T> {

	private Object[] dados;
	private int numObjetos;
	
	public Vetor(){
		numObjetos = 0;
		dados = new Object[numObjetos];
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index){
		return (T) dados [index];
	}
	
	public void add(T obj){
		if (numObjetos == dados.length)
			aumentarDados();
		dados[numObjetos] = obj;
		numObjetos++;
	}
	
	private void aumentarDados(){
		Object[] novo = new Object [dados.length + 1];
				System.arraycopy(this.dados, 0, novo, 0, dados.length);
				dados = novo;
	}
}
