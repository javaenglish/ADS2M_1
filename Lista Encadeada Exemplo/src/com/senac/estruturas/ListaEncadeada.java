package com.senac.estruturas;

public class ListaEncadeada<T extends Comparable<T>> {
	private Nodo<T> head;
	@SuppressWarnings("unused")
	private Nodo<T> tail;
	
	
	public void remove (T valor){
		Nodo<T> nodo = procura(valor);
		nodo.remove();
		if (nodo == head)
			head = head.getNext();
	}
	
	public void insere(Nodo<T>novo ) {
		if ( head == null){
			head = novo;
		
		} else {
			head.insere(novo);
			
		}
	}
	
	public Nodo<T> procura(T valor) {
		if ( head == null)
			return null;
		else
			return head.procura(valor);		
	}
}
