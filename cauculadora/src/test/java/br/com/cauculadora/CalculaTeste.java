package br.com.cauculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculaTeste {

	Calcula calcula;
	
	@Test
	public void testSoma() {
		calcula = new Calcula();
		Double resultado;
		resultado = calcula.soma(10.0, 20.0);
		assertEquals(Double.valueOf(30.0), resultado);
	}

	@Test
	public void testSubtral() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiplica() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

}
