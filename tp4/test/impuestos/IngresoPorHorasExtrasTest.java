package impuestos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoPorHorasExtrasTest {
	
	private IngresoPorHorasExtras ingreso;
	
	@BeforeEach 
	public void setUp() {
		ingreso = new IngresoPorHorasExtras(5, "Venta", 55d, 10);
	}
	
	@Test
	public void getMontoImponibleTest() {
		assertEquals(0.0, ingreso.getMontoImponible());
	}

}
