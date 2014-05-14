package com.senac.gerenciador.model;

public class Funcionario {
	
	private static int PROXIMA_MATRICULA = 1;
	private double salario;
		
	private int matricula;
	private Cargo cargo;
	
	public Funcionario(Cargo cargo, double Salario) throws Exception {
		
		if (salario < cargo.getSalarioMinimo())
			throw new Exception("Salario Minimo Invalido");
		matricula = PROXIMA_MATRICULA++;
		this.cargo = cargo;
		this.salario = salario;
	}

	public int getMatricula() {
		return 1;
	}

	public double getSalario() {
		return salario;
	}

	public Cargo getCargo() {
		return cargo;
	}
	
}
