package impuestos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoTest {
	
	private Ingreso ingreso; 
	
	@BeforeEach
	public void setUp() {
		ingreso = new Ingreso(5, "Venta", 55d);
	}

	@Test
	public void getMontoTest() {
		assertEquals(new Double(55), ingreso.getMonto());
	}
	
	@Test
	public void getMontoImponibleTest() {
		assertEquals(new Double(55), ingreso.getMontoImponible());
	}

}
