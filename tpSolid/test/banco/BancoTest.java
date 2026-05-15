package banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BancoTest {

	// Cliente

    @Test
    public void testSueldoNetoAnual() {
        Cliente cliente = new Cliente("Juan", "Perez", "Calle 1", 30, 2000.0);
        assertEquals(24000.0, cliente.sueldoNetoAnual());
    }

    // SolicitudPersonal 

    @Test
    public void testSolicitudPersonalEsAceptable() {
        Cliente cliente = new Cliente("Juan", "Perez", "Calle 1", 30, 2000.0);
        SolicitudPersonal s = new SolicitudPersonal(cliente, 5000.0, 10);
        assertTrue(s.esAceptable());
    }

    @Test
    public void testSolicitudPersonalRechazadaPorIngresoAnual() {
        Cliente cliente = new Cliente("Ana", "Lopez", "Calle 2", 30, 1000.0);
        SolicitudPersonal s = new SolicitudPersonal(cliente, 5000.0, 10);
        assertFalse(s.esAceptable());
    }

    @Test
    public void testSolicitudPersonalRechazadaPorCuota() {
        Cliente cliente = new Cliente("Juan", "Perez", "Calle 1", 30, 2000.0);
        SolicitudPersonal s = new SolicitudPersonal(cliente, 10000.0, 5);
        assertFalse(s.esAceptable());
    }

    // SolicitudHipotecaria

    @Test
    public void testSolicitudHipotecariaEsAceptable() {
        Cliente cliente = new Cliente("Juan", "Perez", "Calle 1", 30, 2000.0);
        PropiedadInmobiliaria prop = new PropiedadInmobiliaria("Casa", "Calle 3", 10000.0);
        SolicitudHipotecaria s = new SolicitudHipotecaria(cliente, 5000.0, 120, prop);
        assertTrue(s.esAceptable());
    }

    @Test
    public void testSolicitudHipotecariaRechazadaPorCuota() {
        Cliente cliente = new Cliente("Juan", "Perez", "Calle 1", 30, 2000.0);
        PropiedadInmobiliaria prop = new PropiedadInmobiliaria("Casa", "Calle 3", 10000.0);
        SolicitudHipotecaria s = new SolicitudHipotecaria(cliente, 11000.0, 10, prop);
        assertFalse(s.esAceptable());
    }

    @Test
    public void testSolicitudHipotecariaRechazadaPorMonto() {
        Cliente cliente = new Cliente("Juan", "Perez", "Calle 1", 30, 2000.0);
        PropiedadInmobiliaria prop = new PropiedadInmobiliaria("Casa", "Calle 3", 10000.0);
        SolicitudHipotecaria s = new SolicitudHipotecaria(cliente, 8000.0, 120, prop);
        assertFalse(s.esAceptable());
    }

    @Test
    public void testSolicitudHipotecariaRechazadaPorEdad() {
        Cliente cliente = new Cliente("Juan", "Perez", "Calle 1", 60, 2000.0);
        PropiedadInmobiliaria prop = new PropiedadInmobiliaria("Casa", "Calle 3", 10000.0);
        SolicitudHipotecaria s = new SolicitudHipotecaria(cliente, 5000.0, 120, prop);
        assertFalse(s.esAceptable());
    }

    //	Banco 

    @Test
    public void testTotalADesembolsarSoloAceptables() {
        Banco banco = new Banco();
        Cliente cliente = new Cliente("Juan", "Perez", "Calle 1", 30, 2000.0);

        // aceptable: monto 5000
        SolicitudPersonal aceptable = new SolicitudPersonal(cliente, 5000.0, 10);
        // rechazada: sueldo anual insuficiente
        SolicitudPersonal rechazada = new SolicitudPersonal(
            new Cliente("Ana", "Lopez", "Calle 2", 30, 1000.0), 5000.0, 10);

        banco.agregarSolicitud(aceptable);
        banco.agregarSolicitud(rechazada);

        assertEquals(5000.0, banco.totalADesembolsar());
    }

    @Test
    public void testTotalADesembolsarSinSolicitudes() {
        Banco banco = new Banco();
        assertEquals(0.0, banco.totalADesembolsar());
    }


}
