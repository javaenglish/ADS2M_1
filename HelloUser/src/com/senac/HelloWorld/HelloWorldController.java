package com.senac.HelloWorld;

public class HelloWorldController 
{
	public static void main(String[] args) 
	{
		HelloWorldView hello = new HelloWorldView();
		hello.printMessage(criarMensagem().getTexto());
	}
	
	public static HelloWorldModel criarMensagem(){
		HelloWorldModel hello = new HelloWorldModel();
		HelloWorldView view = new HelloWorldView();
		
		
		hello.setTexto( view.digitaDados() );
		
		return hello;
	}

}
