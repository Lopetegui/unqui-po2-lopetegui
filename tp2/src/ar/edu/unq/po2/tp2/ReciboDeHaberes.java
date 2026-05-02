package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;

public class ReciboDeHaberes {
	
	private String nombreEmpleado;
	private String direccion;
	private LocalDate fechaEmision;
	private double sueldoBruto;
	private double sueldoNeto;
	private ArrayList<Concepto> desgloceConceptual;
	
	public ReciboDeHaberes(String nombreEmpleado, String direccion, LocalDate fechaEmision, double sueldoBruto, double sueldoNeto) {
		this.nombreEmpleado = nombreEmpleado;
		this.direccion = direccion;
		this.fechaEmision = fechaEmision;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
		desgloceConceptual = new ArrayList<Concepto>();
		
	}
	
	public void agregarConcepto(Concepto concepto) {
		desgloceConceptual.add(concepto); 
	}

}
