package personasMascotas;

import java.time.LocalDate;

public class Persona implements Nombrable {
	private String nombre;
	private LocalDate fechaNacimiento; 
		
	public Persona(String nombre, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento; 
	}
	
	@Override
	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento; 
	}
	
	public int getEdad() {
		return LocalDate.now().getYear() - this.fechaNacimiento.getYear(); 
	}
	
	public boolean menorQue(Persona otraPersona) {
		return this.getEdad() < otraPersona.getEdad(); 
	}

}
