package unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Cuadrado;
import ar.edu.unq.po2.tp3.Point;

class CuadradoTest {
	
	private Cuadrado cuadrado;
	
	@BeforeEach
	
	void setUp() {
		cuadrado = new Cuadrado(new Point(0,0), 5);
	}

	@Test 
	void testArea() {
		assertEquals(25, cuadrado.area());
	}
	
	@Test
	void testPerimetro() {
		assertEquals(20, cuadrado.perimetro());
	}
	
	@Test
	void testNoEsHorizontal() {
		assertFalse(cuadrado.esHorizontal());
	}
	
	@Test
	void testNoEsVertical() {
		assertFalse(cuadrado.esVertical());
	}

}
