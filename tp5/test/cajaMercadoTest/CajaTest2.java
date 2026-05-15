package cajaMercadoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cajaMercado.Caja;
import cajaMercado.Impuesto;
import cajaMercado.Producto;
import cajaMercado.Servicio;

class CajaTest2 {

	@Test
	void testRegistrarServicio() {
		AgenciaMock agencia = new AgenciaMock();
		Caja caja = new Caja();
		Producto s = new Servicio("Luz", 50.0, 10, agencia); 
		
		caja.registrar(s);
		
		assertEquals(500.0, caja.getTotal()); 
	}
	
	@Test
	void testRegistrarImpuesto() {
		AgenciaMock agencia = new AgenciaMock();
		Caja caja = new Caja();
		Producto i = new Impuesto("IVA", 200.0, agencia);
		
		caja.registrar(i);
		
		assertEquals(200.0, caja.getTotal()); 
	}
	
	@Test
	void testServicioNotificaAgencia() {
		AgenciaMock agencia = new AgenciaMock();
		Caja caja = new Caja();
		Producto s = new Servicio("Luz", 50.0, 10, agencia); 
		
		caja.registrar(s);
		
		assertEquals(500.0, agencia.getUltimaFactura().getMonto()); 
	}
	
	@Test
	void testImpuestoNotificaAgencia() {
		AgenciaMock agencia = new AgenciaMock();
		Caja caja = new Caja();
		Producto i = new Impuesto("IVA", 200.0, agencia); 
		
		caja.registrar(i);
		
		assertEquals(200.0, agencia.getUltimaFactura().getMonto()); 
	}
}
