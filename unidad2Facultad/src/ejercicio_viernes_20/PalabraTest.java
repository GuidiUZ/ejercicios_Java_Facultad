package ejercicio_viernes_20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalabraTest {

	@Test
	public void invertirTest() {
		Palabra palabrita = new Palabra();
		
		assertEquals("aloh", palabrita.invertirPalabra("hola"));
	}
	
	
	@Test
	public void palindromoTest() {
		Palabra palabrita = new Palabra();
		
		assertTrue(palabrita.esPalindromo("1456541"));
	}

}
