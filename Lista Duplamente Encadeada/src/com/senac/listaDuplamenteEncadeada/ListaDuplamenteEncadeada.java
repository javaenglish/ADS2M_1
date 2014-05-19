package com.senac.listaDuplamenteEncadeada;

public class ListaDuplamenteEncadeada {

	private Node inicio;
	private Node fim;

	//construtor
	public ListaDuplamenteEncadeada()
	{
		startList();
	}

	public void startList()
	{
		inicio=null;
		fim=null;
	}

	//insere somente no final
	public void addToTheEnd(int info){
		Node caixa = new Node(inicio,null,info);
			if (inicio==null)//se lista estiver vazia
					inicio = fim = caixa;
			else{
	//seta prox do Node do fim para receber caixa
				fim.setProx(caixa);
				fim = caixa;
			}
	}

	//insere somente no comeco
	public void addToTheBeginning(int info){
		Node caixa = new Node(null,inicio,info);
			if (inicio==null)//se lista estiver vazia
					inicio = fim = caixa;
			else{
	//seta ant do No do inicio para receber caixa
				inicio.setAnt(caixa);
				inicio = caixa;
			}
	}

	public void exibeLista()
	{
		Node aux;
		aux=inicio;
	
	while (aux!=null)
	{
		System.out.println(aux.getInfo());
			aux=aux.getProx();
		}
	}

	public Node Busca_Exaustiva(int elemento)
	{
		Node p=inicio;
		while ((p!=null) && (p.getInfo()!=elemento))
	{
			p=p.getProx();
	}
		if ((p!=null) && (p.getInfo()==elemento))
			return p;
		else return null;
	}

	//5 casos a considerar para remover
	public void removeLista(int elemento)
	{
		Node pos;
		pos=Busca_Exaustiva(elemento);
			if (pos!=null)//1- se existe o No a ser deletado
	{
			if (inicio!=fim)//2- se só existe um Nó na lista
	{
			if (pos==inicio)//3- se o Nó esta no começo
	{
				inicio=pos.getProx();
				pos.getProx().setAnt(null);
	} else
		if (pos==fim)//4- se o Nó esta no fim
			{
				fim=pos.getAnt();
				pos.getAnt().setProx(null);
	} else//5- se o no esta no meio
	{
		pos.getAnt().setProx(pos.getProx());
		pos.getProx().setAnt(pos.getAnt());
	}
			pos.setAnt(null);
			pos.setProx(null);
	} else {
		inicio=null;
		fim=null;
		}
	}else
		System.out.println("Elemento nao encontrado");
	}
}