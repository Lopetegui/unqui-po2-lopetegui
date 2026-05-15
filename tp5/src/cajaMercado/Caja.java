package cajaMercado;

public class Caja {
	
	private double total;
	
	public Caja() {
		this.total = 0;
	}
	
	public void registrar(Producto producto) {
		this.total += producto.getPrecio();
		producto.registrar();
	}
	
	public double getTotal() {
		return this.total; 
	}
}
