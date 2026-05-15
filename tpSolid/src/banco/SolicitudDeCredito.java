package banco;

public abstract class SolicitudDeCredito {

	private Cliente cliente;
	private double monto;
	private int plazoMeses;
	
	public SolicitudDeCredito(Cliente cliente, double monto, int plazoMeses) {
        this.cliente = cliente;
        this.monto = monto;
        this.plazoMeses = plazoMeses;
    }

    public double cuotaMensual() {
        return this.monto / this.plazoMeses;
    }

    public abstract boolean esAceptable();

    public Cliente getCliente() {
        return cliente;
    }

    public double getMonto() {
        return monto;
    } 
	
}
