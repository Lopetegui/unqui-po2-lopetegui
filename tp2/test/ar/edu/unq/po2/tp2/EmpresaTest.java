package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

class EmpresaTest {

	@Test
	public void testCalculoTotalSueldosNetosYLiquidacion() {
		
		Empresa empresa = new Empresa("Empresa Test", "20-12345678-9");
				
		Empleado emp1 = new EmpleadoPermanente(
				"Matias", "Calle 1", "casado",
				LocalDate.of(1980, 5, 10),
				1000, 2, 5
				);
		
		Empleado emp2 = new EmpleadoTemporario(
				"Ana", "Calle 2", "soltero",
				LocalDate.of(1995, 3, 20),
				800, 10, LocalDate.of(2016, 12, 31)
				);
		
		Empleado emp3 = new EmpleadoContratado(
				"Pedro", "Calle 3", "soltero",
				LocalDate.of(1990, 1, 1),
				1200, "C123", "Transferencia"
				);
		
		empresa.agregarEmpleado(emp1);
		empresa.agregarEmpleado(emp2);
		empresa.agregarEmpleado(emp3);

		// I) Calculo total neto
		double totalNeto = empresa.calcularTotalSueldosNetos();
		assertTrue(totalNeto > 0);
		
		// II) Liquidacion
		empresa.liquidarSueldos();
		
		assertEquals(3, empresa.getRecibos().size()); 
		
		}

}
