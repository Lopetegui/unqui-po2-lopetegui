package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoContratado extends Empleado {
	
	private String numeroContrato;
	private String medioDePago;
	
	public EmpleadoContratado(String nombre, String direccion, String estadoCivil, LocalDate fechaNacimiento, double sueldoBasico, String numeroContrato, String medioDePago ) {
		super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
		this.numeroContrato = numeroContrato;
		this.medioDePago = medioDePago;
	}

	@Override
	public double calcularSueldoBruto() {
		return getSueldoBasico();
	}

	@Override
	public double calcularRetenciones() {
		return 50;
	}

	@Override
	public void agregarConceptosA(ReciboDeHaberes recibo) {
		recibo.agregarConcepto(new Concepto("Sueldo Básico", getSueldoBasico()));
		recibo.agregarConcepto(new Concepto("Gastos administrativos contractuales", 50));

	}

}
