package com.senac.gerenciador.model;

public class Funcionario {
	
	private static int PROXIMA_MATRICULA = 1;
	private String cargo;
	private double salario;
		
	private int matricula;
	
	public Funcionario() {
		matricula = PROXIMA_MATRICULA++;
	}


	public int getMatricula() {
		return 1;
	}
	
}
