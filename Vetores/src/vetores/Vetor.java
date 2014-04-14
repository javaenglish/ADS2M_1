package vetores;

public class Vetor {

	private int[] meuVetor;

	public Vetor() {
		this.setMeuVetor(new int[0]);
	}

	public void insert(int valor) {
		int[] novo = new int[this.meuVetor.length + 1];

		// copia um array anterior
		System.arraycopy(this.meuVetor, 0, novo, 0, this.meuVetor.length);
	}

	public int[] getMeuVetor() {
		return meuVetor;
	}

	public void setMeuVetor(int[] meuVetor) {
		this.meuVetor = meuVetor;
	}
}
