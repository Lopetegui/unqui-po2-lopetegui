package supermercado;

public class ProductoPrimeraNecesidad extends Producto {
	
	private double descuento;
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, boolean precioCuidado, double descuento) {
		// Nota: no se valida el rango del descuento (0 a 1). 
		super(nombre, precio, precioCuidado);
		this.descuento = descuento;
	}
	
	public ProductoPrimeraNecesidad(String nombre, Double precio, boolean precioCuidado) {
		this(nombre, precio, precioCuidado, 0.1); 
	}
	
	
	@Override
	public Double getPrecio() {
		return super.getPrecio() * (1 - descuento);
	}
	
}
