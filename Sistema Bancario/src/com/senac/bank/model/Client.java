package com.senac.bank.model;


import com.senac.bank.model.Account;

public class Client {
	
	String name;
	String cpf;
	String phone;
	String account;
	

	public Client(String name, String cpf,
			String phone, String account) {
		this.name = name;
		this.cpf = cpf;
		this.phone = phone;
		this.account = account;
	}
	
	public Client(String addName, Account createAccount) {
	
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
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}
	
	

}
