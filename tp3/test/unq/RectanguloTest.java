package unq;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;
import ar.edu.unq.po2.tp3.Rectangulo;

class RectanguloTest {
	
	private Rectangulo rectHorizontal;
	private Rectangulo rectVertical;
	
	@BeforeEach 
	public void setUp() {
	    rectHorizontal = new Rectangulo(new Point(0,0), 10, 5);
	    rectVertical = new Rectangulo(new Point(0,0), 5, 10);
	}

	@Test
	public void testArea() {
		assertEquals(50, rectHorizontal.area());
	}
	
	@Test
	public void testPerimetro() {
		assertEquals(30, rectHorizontal.perimetro());
	}
	
	@Test
	public void testEsHorizontal() {
		assertTrue(rectHorizontal.esHorizontal());
	}
	
	@Test
	public void testEsVertical() {
		assertTrue(rectVertical.esVertical());
	}

}
