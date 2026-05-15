package cajaMercadoTest;

import cajaMercado.Agencia;
import cajaMercado.Factura;

public class AgenciaMock implements Agencia{
	private Factura ultimaFactura;
	
	@Override
	public void registrarPago(Factura factura) {
		this.ultimaFactura = factura;
	}
	
	public Factura getUltimaFactura() {
		return this.ultimaFactura; 
	}
}
