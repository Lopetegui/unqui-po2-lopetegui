package cajaMercado;

public class Servicio implements Producto{
	private String nombre;
	private double costoPorUnidad;
	private int unidades;
	private Agencia agencia; 
	
	public Servicio(String nombre, double costoPorUnidad, int unidades, Agencia agencia) {
		this.nombre = nombre;
		this.costoPorUnidad = costoPorUnidad;
		this.unidades = unidades;
		this.agencia = agencia; 
	}
	
	@Override
	public double getPrecio() {
		return this.costoPorUnidad * this.unidades;
	}
	
	@Override
	public void registrar() {
		Factura factura = new Factura(getPrecio());
		this.agencia.registrarPago(factura);
	}

}
