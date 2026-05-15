package cajaMercadoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cajaMercado.Caja;
import cajaMercado.Producto;
import cajaMercado.ProductoCooperativa;
import cajaMercado.ProductoTradicional;


class CajaTest {

	@Test
	void testRegistrarProductoTradicional() {
		Caja caja = new Caja();
		Producto p = new ProductoTradicional("Arroz", 100.0, 10);
		
		caja.registrar(p);

		assertEquals(100.0, caja.getTotal()); 
	}
	
	@Test
	void testRegistrarProductoCooperativa() {
		Caja caja = new Caja();
		Producto p = new ProductoCooperativa("Leche", 100.0, 10);
		
		caja.registrar(p);

		assertEquals(90.0, caja.getTotal()); 
	}

	@Test
	void registrarVariosProductos() {
		Caja caja = new Caja();
		Producto tradicional = new ProductoTradicional("Arroz", 100.0, 10);
		Producto cooperativa = new ProductoCooperativa("Leche", 100.0, 10); 
		
		caja.registrar(tradicional);
		caja.registrar(cooperativa);
		
		assertEquals(190.0, caja.getTotal());
	}
	
	@Test
	void testDecrementarStockAlRegistrar() {
		ProductoTradicional p = new ProductoTradicional("Arroz", 100.0, 10);
		Caja caja = new Caja();
		
		caja.registrar(p);
		
		assertEquals(9, p.getStock()); 
	}
}
