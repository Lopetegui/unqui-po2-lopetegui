package ar.edu.unq.po2.tp3;

public class Rectangulo {
	
	private Point origen;
	private int ancho;
	private int alto;
	
	public Rectangulo(Point origen, int ancho, int alto) {
		
		// Precondición: ancho > 0 && alto >0
		
		this.origen = origen;
		this.ancho = ancho;
		this.alto = alto; 		
	}
}

