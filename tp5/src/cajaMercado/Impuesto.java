package cajaMercado;

public class Impuesto implements Producto{
	private String nombre;
	private double tasa;
	private Agencia agencia;
	
	public Impuesto(String nombre, double tasa, Agencia agencia) {
		this.nombre = nombre;
		this.tasa = tasa;
		this.agencia = agencia;
	}
	
	@Override
	public double getPrecio() {
		return this.tasa; 
	}
	
	@Override 
	public void registrar() {
		Factura factura = new Factura(getPrecio());
		this.agencia.registrarPago(factura);
	}

}
