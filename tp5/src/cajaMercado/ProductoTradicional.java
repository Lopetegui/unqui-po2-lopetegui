package cajaMercado;

public class ProductoTradicional implements Producto {
	
	private String nombre;
	private double precioBase;
	private int stock;
	
	public ProductoTradicional(String nombre, double precioBase, int stock) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.stock = stock;
	}
	
	@Override 
	public double getPrecio() {
		return this.precioBase; 
	}
	
	@Override
	public void decrementarStock() {
		this.stock--; 
	}

}
