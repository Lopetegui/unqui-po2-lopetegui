package banco;

public class SolicitudHipotecaria extends SolicitudDeCredito {

	  private PropiedadInmobiliaria garantia;

	    public SolicitudHipotecaria(Cliente cliente, double monto, int plazoMeses, PropiedadInmobiliaria garantia) {
	        super(cliente, monto, plazoMeses);
	        this.garantia = garantia;
	    }

	    @Override
	    public boolean esAceptable() {
	        boolean cuotaOk = this.cuotaMensual() <= this.getCliente().getSueldoNetoMensual() * 0.50;
	        boolean montoOk = this.getMonto() <= this.garantia.getValorFiscal() * 0.70;
	        boolean edadOk  = this.getCliente().getEdad() + (this.plazoMeses() / 12) <= 65;
	        return cuotaOk && montoOk && edadOk;
	    }

	    private int plazoMeses() {
	        return (int)(this.getMonto() / this.cuotaMensual());
	    }

}
