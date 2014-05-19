package com.senac.listaDuplamenteEncadeada;

public class Node {

	private Node ant, prox;
	private int info;
	
	//construtor
	public Node(Node ant, Node prox,int info)
	{
		this.ant = ant;
		this.prox = prox;
		this.info = info;
	}
	
	public Node getAnt() 
	{ 
		return ant; 
	}
	
	public Node getProx()
	{ 
		return prox; 
	}
	
	public void setAnt(Node ant) 
	{ 
		this.ant = ant;
	}
	
	public void setProx(Node prox) 
	{ 
		this.prox = prox;
	}
	
	public int getInfo() 
	{
		return info; 
	}
	
	public void setInfo(int elemento)
	{
		this.info=elemento; 
	
	}
}
