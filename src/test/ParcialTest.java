package test;

import logica.Parcial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
	public void testRaicesReales() throws Exception {
		double[] raices = this.parcial.calcularRaices(1,-5,6);
		
		assertEquals(3, raices[0]);
		assertEquals(2, raices[1]);
		
		raices = this.parcial.calcularRaices(1,0,-9);
		assertEquals(3, raices[0]);
		assertEquals(-3, raices[1]);
		
		
		
		
	}
	
}
