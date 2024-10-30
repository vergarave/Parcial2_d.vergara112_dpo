package test;

import logica.Calculadora;
import logica.Parcial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ParcialTest {
	
	private Parcial parcial = new Parcial();
	
	@BeforeEach
	public void setUp() {
		this.parcial = new Parcial();
	}

	@Test
	public void testAEsCero() {
		assertThrows(Exception.class, () -> this.parcial.calcularRaices(0,0,0));	
	}
	
	@Test
	public void testDiscriminanteNegativo() {
		assertThrows(Exception.class, () -> this.parcial.calcularRaices(2,3,3));
	}
	
	@Test
	public void testDiscriminanteNegativo() {
		
	}

}
