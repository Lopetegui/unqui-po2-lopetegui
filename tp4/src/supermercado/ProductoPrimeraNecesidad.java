package supermercado;

public class ProductoPrimeraNecesidad extends Producto {
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, boolean precioCuidado) {
		super(nombre, precio, precioCuidado);
	}
	
	@Override
	public Double getPrecio() {
		return super.getPrecio() * 0.9;
	}
	
}
