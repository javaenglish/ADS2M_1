package com.senac.jogo.deserto.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.senac.jogo.deserto.Truck;

public class TesteJogoTravessiaDeserto {

	private Truck truck;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testeCriarCaminhaoInicializaComCargaSeis() {
		Truck truck = new Truck();
		assertEquals(6, truck.getCapacity());
	}
	@Test
	public void 

}
