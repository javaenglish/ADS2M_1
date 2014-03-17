package com.senac.agenda.controller;

import com.senac.agenda.model.Pessoa;
import com.senac.agenda.view.ContatoView;

public class PessoaController {

	private Pessoa contato;

	public void criarContato()
	{
		contato = new Pessoa();
		contato.setNome("Rafael");
		contato.setTelefone("555-1234");
	}

	public void exibirContato( ContatoView view )
	{
		view.printContato(contato.getNome(), contato.getTelefone());
	}

}