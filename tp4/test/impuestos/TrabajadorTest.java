package impuestos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {
	
	private Ingreso sueldo;
	private Ingreso bono;
	private IngresoPorHorasExtras horasExtras;
	private Trabajador trabajador;

	@BeforeEach
	public void setUp() {
		sueldo = new Ingreso(1, "Sueldo", 1000d);
		bono = new Ingreso(1, "Bono", 500d);
		horasExtras = new IngresoPorHorasExtras(1, "Horas extras", 200d, 5);
		trabajador = new Trabajador();
		
		trabajador.agregarIngreso(sueldo);
		trabajador.agregarIngreso(bono);
		trabajador.agregarIngreso(horasExtras);
	}
	
	@Test
	public void testTotalPercibido() {
		assertEquals(1700d, trabajador.getTotalPercibido());
	}

	@Test
	public void testMontoImponible() {
		assertEquals(1500d, trabajador.getMontoImponible());
	}
	
	@Test
	public void testImpuestoAPagar() {
		assertEquals(30d, trabajador.getImpuestoAPagar());
	}
}
