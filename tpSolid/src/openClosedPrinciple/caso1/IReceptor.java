package openClosedPrinciple.caso1;

import java.util.List;

public interface IReceptor {
	
	public void conectar(String nombreUsuario, String passUsuario);
	
	public List<Correo> recibirNuevos(String user, String pass); 

}
