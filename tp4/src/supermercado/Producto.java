package supermercado;

public class Producto {
	
	private String nombre;
	private Double precio;
	private boolean precioCuidado;
	
	public Producto(String nombre, Double precio, boolean precioCuidado){
		this.nombre = nombre;
		this.precio = precio;
		this.precioCuidado = precioCuidado; 
	}
	
	public Producto(String nombre, Double precio){
		this(nombre, precio, false);
	}

	public String getNombre() {
		return nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public boolean esPrecioCuidado() {
		return precioCuidado;
	}
	
	public void aumentarPrecio(double monto) {
		this.precio += monto;
	}
	
	
}
