package impuestos;

import java.util.ArrayList;

public class Trabajador {
	
	private ArrayList<Ingreso> ingresos;
	
	public Trabajador() {
		this.ingresos = new ArrayList<Ingreso>(); 
		
	}
	
	public void agregarIngreso(Ingreso ingreso) {
		ingresos.add(ingreso); 
	}
	
	public Double getTotalPercibido() {
		Double total = 0.0;
		
		for (Ingreso i : ingresos) {
			total += i.getMonto(); 
		}
		
		return total;
	}
	
	public Double getMontoImponible() {
		Double total = 0.0;
		
		for (Ingreso i : ingresos) {
			total += i.getMontoImponible(); 
		}
		
		return total;
	}
	
	public Double getImpuestoAPagar() {
		return getMontoImponible() * 0.02; 
	}
}
