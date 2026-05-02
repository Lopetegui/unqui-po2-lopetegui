package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public abstract class Empleado {
	
	private String nombre;
	private String direccion;
	private String estadoCivil;
	private LocalDate fechaDeNacimiento;
	private double sueldoBasico;
	
	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaDeNacimiento, double sueldoBasico) {
			this.nombre = nombre;
			this.direccion = direccion;
			this.estadoCivil = estadoCivil;
			this.fechaDeNacimiento = fechaDeNacimiento;
			this.sueldoBasico = sueldoBasico;
	}
	
	public double getSueldoBasico() {
		return sueldoBasico;
	}


	public String getEstadoCivil() {
		return estadoCivil;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}
	
	public int calcularEdad() {
		return LocalDate.now().getYear() - fechaDeNacimiento.getYear();	
	}
	
	public double calcularSueldoNeto() {
		return this.calcularSueldoBruto() - this.calcularRetenciones(); 
	}
	
	public abstract double calcularSueldoBruto();
	public abstract double calcularRetenciones();
	public abstract void agregarConceptosA(ReciboDeHaberes recibo);
	
	
}
