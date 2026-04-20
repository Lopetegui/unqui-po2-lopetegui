package ar.edu.unq.po2.tp3;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
		this(0, 0); 
	}
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void moveTo(int x, int y) {
		this.x = x;
		this.y = y; 
	}
	
	public Point add(Point otro) {
		return new Point(this.x + otro.x, this.y + otro.y);
	}

}
