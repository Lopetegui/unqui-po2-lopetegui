package openClosedPrinciple.caso1;

import java.util.ArrayList;
import java.util.List; 

public class ServidorPop implements IReceptor, IEmisor {
	
	public List<Correo> recibirNuevos(String nombreUsuario, String passUsuario){
		List<Correo> retorno = new ArrayList<Correo>();
		// Verificar autenticidad del usuario.
		// Obtener emails nuevos del usuario
		// Asignar a retorno la lista de los nuevos e-mails.
		return retorno;
	}
	
	public void conectar(String nombreUsuario, String passusuario) {
		// Verifica que el usuario sea válido y establece la conexión.
	}
	
	public void enviar(Correo correo) {
		// Realiza lo necesario para enviar el correo.
	}
	
	
}
