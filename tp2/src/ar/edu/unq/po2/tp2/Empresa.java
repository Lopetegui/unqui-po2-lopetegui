package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Empresa {

	private String nombre;
	private String cuit;
	private ArrayList<Empleado> empleados;
	private ArrayList<ReciboDeHaberes> recibos;
	
	public Empresa(String nombre, String cuit) {
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = new ArrayList<Empleado>();
		this.recibos = new ArrayList<ReciboDeHaberes>();
		
	}
	
	public ArrayList<ReciboDeHaberes> getRecibos(){
		return recibos; 
	}
	
	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado); 
	}
	
	public double calcularTotalSueldosNetos(){
		double total = 0;
		
		for (Empleado emp : empleados) {
			total += emp.calcularSueldoNeto();
		}
		
		return total;
	}
	
	public double calcularTotalSueldosBrutos() {
		double total = 0;
		
		for (Empleado emp : empleados) {
			total += emp.calcularSueldoBruto();
		}
		
		return total;
	}
	
	public double calcularTotalRetenciones() {
		double total = 0;
		
		for (Empleado emp : empleados) {
			total += emp.calcularRetenciones();
		}
		
		return total;
	}
	
	public void liquidarSueldos() {
		for (Empleado emp : empleados) {
			recibos.add(generarReciboPara(emp));
		}
	}
	
	public ReciboDeHaberes generarReciboPara(Empleado empleado) {
	    ReciboDeHaberes recibo = new ReciboDeHaberes(
	        empleado.getNombre(),
	        empleado.getDireccion(),
	        LocalDate.now(),
	        empleado.calcularSueldoBruto(),
	        empleado.calcularSueldoNeto()
	    );

	    empleado.agregarConceptosA(recibo);

	    return recibo;
	}
	
} 


