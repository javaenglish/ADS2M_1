package com.senac.gerenciador.model.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.senac.gerenciador.model.Cargo;
import com.senac.gerenciador.model.Funcionario;

public class FuncionarioTest {
	
	private Funcionario estagiario;

	@Test
	public void testMatriculaValida() throws Exception {
		Funcionario func = new Funcionario(Cargo.ESTAGIARIO, Cargo.ESTAGIARIO.getSalarioMinimo());
		//
		assertTrue(func.getMatricula()>0);
	}

	@Test
	public void testNaoExistemDuasMatriculasiguais() throws Exception{
		Funcionario f = new Funcionario(Cargo.ESTAGIARIO, Cargo.ESTAGIARIO.getSalarioMinimo());
		Funcionario f1 = new Funcionario(Cargo.ESTAGIARIO, Cargo.ESTAGIARIO.getSalarioMinimo());
		Funcionario f2 = new Funcionario(Cargo.ESTAGIARIO, Cargo.ESTAGIARIO.getSalarioMinimo());
		
		assertFalse(f.getMatricula() == f1.getMatricula());
		assertFalse(f1.getMatricula() == f2.getMatricula());
		assertFalse(f2.getMatricula() == f.getMatricula());
		
	}
	
	@Test(expected=java.lang.Exception.class)
	public void testNaoPermiteCriarObjetoComSalarioInvalido() throws Exception {
		new Funcionario(Cargo.ESTAGIARIO, Cargo.ESTAGIARIO.getSalarioMinimo());
}
	
	@Test
	public void testaSalarioDentroDaLei() throws Exception {
		Funcionario func = new Funcionario(Cargo.ESTAGIARIO, Cargo.ESTAGIARIO.getSalarioMinimo());
		assertTrue(func.getSalario() >= func.getCargo().getSalarioMinimo());
	}
	
}
