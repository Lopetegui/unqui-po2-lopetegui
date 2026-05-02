package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {

	private int cantidadDeHijos;
	private int antiguedad;
	
	public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, LocalDate fecha, double sueldoBasico, int cantidadDeHijos, int antiguedad){
		super(nombre, direccion, estadoCivil, fecha, sueldoBasico);
		this.cantidadDeHijos = cantidadDeHijos;
		this.antiguedad = antiguedad; 
	}
	
	@Override
	public double calcularSueldoBruto() {
		double adicionalPorEstadoCivil = 0;
		
		if ("casado".equals(getEstadoCivil())) {
			adicionalPorEstadoCivil = 100;
		}
		
		return getSueldoBasico() + (150 * cantidadDeHijos) + (50 * antiguedad) + adicionalPorEstadoCivil;
				
	}
	
	@Override
	public double calcularRetenciones() {
		double bruto = calcularSueldoBruto();
		double obraSocial = bruto * 0.10 + cantidadDeHijos * 20;
		double jubilacion = bruto * 0.15;
		
		return obraSocial + jubilacion; 
	}
	
	@Override
	public void agregarConceptosA(ReciboDeHaberes recibo) {
		double bruto = calcularSueldoBruto();
		double obraSocial = bruto * 0.10 + cantidadDeHijos * 20; 
		double jubilacion = bruto * 0.15;
		
		recibo.agregarConcepto(new Concepto("Sueldo Básico", getSueldoBasico()));
		recibo.agregarConcepto(new Concepto("Asignación por hijo", cantidadDeHijos * 150));
		recibo.agregarConcepto(new Concepto("Antiguedad", antiguedad * 50));
		
		if ("casado".equals(getEstadoCivil())) {
			recibo.agregarConcepto(new Concepto("Asignación por cónyuge", 100));
		}
		
		recibo.agregarConcepto(new Concepto("Obra social", obraSocial));
		recibo.agregarConcepto(new Concepto("Aportes jubilatorios", jubilacion));
		
	}
	
}
