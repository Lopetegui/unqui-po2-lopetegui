package banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Cliente> clientes;
    private List<SolicitudDeCredito> solicitudes;

    public Banco() {
        this.clientes = new ArrayList<>();
        this.solicitudes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void agregarSolicitud(SolicitudDeCredito solicitud) {
        this.solicitudes.add(solicitud);
    }

    public double totalADesembolsar() {
        double total = 0;
        for (SolicitudDeCredito s : this.solicitudes) {
            if (s.esAceptable()) {
                total += s.getMonto();
            }
        }
        return total;
    }
}
