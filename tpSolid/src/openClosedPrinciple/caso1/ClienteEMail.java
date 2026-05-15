package openClosedPrinciple.caso1;

import java.util.ArrayList;

public class ClienteEMail {
	
	private IReceptor receptor;
	private IEmisor emisor;
	private String nombreUsuario;
	private String passUsuario;
	private ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;
	
	public ClienteEMail(IReceptor receptor, IEmisor emisor, String nombreUsuario, String pass) {
		this.receptor = receptor;
		this.emisor = emisor; 
		this.nombreUsuario = nombreUsuario;
		this.passUsuario = pass;
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
		this.conectar();
	}
	
	public void conectar() {
		this.receptor.conectar(this.nombreUsuario, this.passUsuario);
	}
	
	public void borrarCorreo(Correo correo) {
		this.inbox.remove(correo);
		this.borrados.remove(correo);
	}
	
	public int contarBorrados() {
		return this.borrados.size();
	}
	
	public int contarInbox() {
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo) {
		this.borrados.remove(correo); 
	}
	
	public void recibirNuevos() {
		this.receptor.recibirNuevos(this.nombreUsuario, this.passUsuario); 
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo) {
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.emisor.enviar(correo); 
	}

}
