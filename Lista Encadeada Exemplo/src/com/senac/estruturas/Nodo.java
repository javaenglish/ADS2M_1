package com.senac.estruturas;

public class Nodo<T extends Comparable<T>> {
	private T valor;
	private Nodo<T> prox;
	private Nodo<T> ant;
	
	public Nodo(T valor) {
		this.valor = valor;
		this.prox = null;
	}
	
	public Nodo<T> procura (T valor){
		if (valor == this.valor)
			return this;
		else
			if(prox == null)
				return null;
			else
				return prox.procura(valor);
	}
		
	public void insere(Nodo<T> novo) {
		if (novo.valor.compareTo(this.valor) > 0)
			prox.insere(novo);
		else {
			novo.ant = this.ant;
			novo.prox = this;
			this.ant.prox = novo;
			this.ant = novo;
		}
	}

	public Nodo<T> getNext() {
		return prox;
	}
	
	public void remove() {
		if (ant != null)
			ant.prox = this.prox;
		if(prox != null)
			prox.ant = this.ant;
	}
}
