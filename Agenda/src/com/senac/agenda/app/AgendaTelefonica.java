package com.senac.agenda.app;

import com.senac.agenda.controller.PessoaController;
import com.senac.agenda.view.CompactView;
import com.senac.agenda.view.ExtendedView;

public class AgendaTelefonica {

	public static void main(String[] args) {
		PessoaController controller = new PessoaController();
		controller.criarContato();

		controller.exibirContato(new ExtendedView());
		controller.exibirContato(new CompactView());
	}

}