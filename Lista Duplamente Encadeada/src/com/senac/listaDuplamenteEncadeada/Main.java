package com.senac.listaDuplamenteEncadeada;

public class Main {

	ListaDuplamenteEncadeada lista;
	public Main()
	{
	lista=new ListaDuplamenteEncadeada();
	}

	public void executa()
	{
		for (int i=1 ; i<=5 ; i++)
			lista.addToTheEnd(i);
		System.out.println("Lista inserindo no final");
		lista.exibeLista();
		System.out.println("\n\n");

	System.out.println("Lista inserindo no inicio (Tipo Pilha)");
	lista.addToTheBeginning(50);
	lista.addToTheBeginning(40);
	lista.addToTheBeginning(30);
	lista.exibeLista();

	//Removendo alguns elementos (30,1,5)
	lista.removeLista(30);
	lista.removeLista(1);
	lista.removeLista(5);
	//Lista após remover alguns dos elementos (30,1,5)
	System.out.println("\n\nDepois de Remover os elementos (30,1,5)");
	lista.exibeLista();
	}

	public static void main(String args[])
	{
	Main a = new Main();
	a.executa();
	}
}
