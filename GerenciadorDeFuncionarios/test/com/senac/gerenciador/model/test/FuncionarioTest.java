package com.senac.gerenciador.model.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.senac.gerenciador.model.Funcionario;

public class FuncionarioTest {

	@Test
	public void testMatriculaValida() {
		Funcionario func = new Funcionario();
		//
		assertTrue(func.getMatricula()>0);
	}

	@Test
	public void testNaoExistemDuasMatriculasiguais(){
		Funcionario f = new Funcionario();
		Funcionario	f1 = new Funcionario();
		Funcionario f2 = new Funcionario();
		
		assertFalse(f.getMatricula() == f2.getMatricula());
		assertFalse(f1.getMatricula() == f2.getMatricula());
		assertFalse(f2.getMatricula() == f.getMatricula());
		
	}
	
	
}
