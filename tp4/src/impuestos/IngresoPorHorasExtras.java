package impuestos;

public class IngresoPorHorasExtras extends Ingreso {

	private int cantidadDeHorasExtras; 
	
	public IngresoPorHorasExtras(int mes, String concepto, Double monto, int cantidadDeHorasExtras) {
		super(mes,concepto, monto);
		this.cantidadDeHorasExtras = cantidadDeHorasExtras; 
	}
	
	@Override
	public Double getMontoImponible() {
		return 0.0; 
	}
}
