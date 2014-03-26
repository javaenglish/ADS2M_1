package com.senac.bank.model;

import com.senac.agenda.model.Pessoa;

public class Client extends Pessoa{
	
	String name;
	String cpf;
	String phone;
	
	public Client(String nome, String telefone) {
		super(nome, telefone);
	}
	
	public String getName() {
		return name;
	}
	public void setNome(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getPhone() {
		return phone;
	}
	public void setTelefone(String phone) {
		this.phone = phone;
	}

}
