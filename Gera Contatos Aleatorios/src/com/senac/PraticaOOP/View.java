package com.senac.PraticaOOP;

import java.util.Scanner;

public class View 
{
 		//imprime uma mensagem na tela.
		//par�metro String mensagem � a mensagem que ser� imprimida.
		public void imprimeLinha(String mensagem)
		{
			System.out.println(mensagem);
		}
		
		//imprime o contato na tela em uma linha.
		//par�metro String nome nome do contato, String endereco � o endere�o do contato, 
		//e String telefones[] � um vetor que armazena tr�s telefones do contato.
		public void imprimeContato(String nome, String endereco, String telefones[])
		{
			System.out.printf("Nome: %s - Endere�o: %s - Celular: %s - Residencial %s - Comercial: %s" , nome, endereco,
																				telefones[0], telefones [1], telefones[2]);
		}
		
		//recebe um valor digitado pelo usu�rio.
		//retorna String linha � o valor digitado pelo usu�rio.
		public String recebeLinha()
		{
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			String linha = input.nextLine();
			
			return linha;
		}
		
		//recebe um endere�o
		//retorna String endereco texto digitado pelo usu�rio.
		public String recebeEndereco()
		{
			String endereco;
			
			imprimeLinha( "Digite o endereco: " );
			endereco = recebeLinha();
			
			return endereco;
		}
		
		//recebe um nome.
		//retorna String nome texto digitado pelo usu�rio.
		public String recebeNome()
		{
			String nome;
			
			imprimeLinha( "Digite o nome: " );
			nome = recebeLinha();
			
			return nome;
		}
		
		//recebe tr�s n�meros de telefone: celular, residencial e comercial.
		//retorna String[] telefone vetor com tr�s strings de telefone.
		public String[] recebeTelefones()
		{
			String telefone[] = new String [3];
			
			imprimeLinha( "Digite o telefone celular: " );
			telefone [0] =  recebeLinha().replace(" ", "").trim();
			
			imprimeLinha( "Digite o telefone residencial: " );
			telefone [1] = recebeLinha().replace(" ", "").trim();
			
			imprimeLinha( "Digite o telefone comercial: " );
			telefone [2] = recebeLinha().replace(" ", "").trim();
			
			return telefone;
		}
		
		//recebe um n�mero de telefone,
		//par�metro a mensagem descrevendo o tipo do telefone: 
		//celular, residencial ou comercial.		
		public String recebeTelefone(String tipoTelefone)
		{
			imprimeLinha("Digite o telefone "+ tipoTelefone);
			String telefone = recebeLinha().replace( "" ,  "" ).trim();
			
			return telefone;
		}
}
