package banco;

public class SolicitudPersonal extends SolicitudDeCredito {

	public SolicitudPersonal(Cliente cliente, double monto, int plazoMeses) {
        super(cliente, monto, plazoMeses);
    }

    @Override
    public boolean esAceptable() {
        return this.getCliente().sueldoNetoAnual() >= 15000
            && this.cuotaMensual() <= this.getCliente().getSueldoNetoMensual() * 0.70;
    }
}
