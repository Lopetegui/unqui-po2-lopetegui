package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoTemporario extends Empleado {
	
	private int cantidadDeHorasExtras;
	private LocalDate fechaDeFinDePlantaTemporaria;
	
	public EmpleadoTemporario(String nombre, String direccion, String estadoCivil, LocalDate fecha, double sueldoBasico, int cantidadDeHorasExtras, LocalDate fechaDeFinDePlantaTemporaria) {
		super(nombre, direccion, estadoCivil, fecha, sueldoBasico);
		this.cantidadDeHorasExtras = cantidadDeHorasExtras;
		this.fechaDeFinDePlantaTemporaria = fechaDeFinDePlantaTemporaria;
	}
	
	@Override
	public double calcularSueldoBruto() {
		return getSueldoBasico() + (cantidadDeHorasExtras * 40); 
	}
	
	@Override
	public double calcularRetenciones() {
		double bruto = calcularSueldoBruto();
		double sumaPorEdad = 0;
		
		if (calcularEdad() > 50) {
			sumaPorEdad = 25; 
		}
		
		double obraSocial = bruto * 0.10 + sumaPorEdad; 
		double jubilacion = bruto * 0.10 + cantidadDeHorasExtras * 5; 
		
		return obraSocial + jubilacion; 
		
	}
	
	@Override
	public void agregarConceptosA(ReciboDeHaberes recibo) {
		double sumaPorEdad = 0;
		double bruto = calcularSueldoBruto();
		
		recibo.agregarConcepto(new Concepto("Sueldo Básico", getSueldoBasico()));
		recibo.agregarConcepto(new Concepto("Horas extra", cantidadDeHorasExtras * 40));
		
		if (calcularEdad() > 50) {
			sumaPorEdad = 25; 
		}
		
		double obraSocial = bruto * 0.10 + sumaPorEdad; 
		double jubilacion = bruto * 0.10 + cantidadDeHorasExtras * 5; 
		
		recibo.agregarConcepto(new Concepto("Obra social", obraSocial));
		recibo.agregarConcepto(new Concepto("Aportes jubilatorios", jubilacion));
		
	}
		
}
