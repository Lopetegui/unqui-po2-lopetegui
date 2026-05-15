package cajaMercado;

public class ProductoCooperativa implements Producto{
	
	private String nombre;
	private double precioBase;
	private int stock;
	
	public ProductoCooperativa(String nombre, double precioBase, int stock) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.stock = stock;
	}
	
	@Override
	public double getPrecio() {
		return this.precioBase * 0.90;
	}
	
	@Override
	public void decrementarStock() {
		this.stock--; 
	}
	
	public int getStock() {
		return this.stock; 
	}
}
