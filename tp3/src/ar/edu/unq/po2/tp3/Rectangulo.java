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
	
	public int area(){
		return this.ancho * this.alto; 
	}
	
	public int perimetro() {
		return 2*(this.ancho + this.alto);
	}
	
	public boolean esHorizontal() {
		return this.ancho > this.alto;
	}
	
	public boolean esVertical(){
		return this.alto > this.ancho;
	}
}

