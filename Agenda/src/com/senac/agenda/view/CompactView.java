package com.senac.agenda.view;

import static java.lang.System.*;

public class CompactView extends ContatoView {

	@Override
	public void printContato(String nome, String telefone) {
		out.printf("Contato: %s - %s", nome, telefone);
	}

}