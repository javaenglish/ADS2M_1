package com.senac.gerenciador.model;

public enum Cargo {

	ESTAGIARIO("Estagiario", 500.00),
	DESENVOLVEDOR_JUNIOR("Analista de Desenvolvimento Junior", 850.00),
	DESENVOLDEDOR_PLENO("Analiste de Desenvolvimento Pleno", 1250.00),
	DESENVOLVEDOR_SENIOR("Analista de Desenvolvimento Senior", 1500.00),
	GERENTE_PROJETO("Gerente de Projeto", 2500.00),
	GERENTE_EXECUTIVO("Gerente de Pessoas", 0.00);
	
	private String titulo;
	private double salarioMinimo;
	
	private Cargo(String titulo, double salarioMinimo) {
		this.titulo = titulo;
		this.salarioMinimo = salarioMinimo;
	}
	
	
	public String getTitulo() {
		return titulo;
	}

	public double getSalarioMinimo() {
		return salarioMinimo;
	}
	
}
