package impuestos;

public class Ingreso {
	
	private int mes;
	private String concepto;
	private Double monto; 
	
	public Ingreso(int mes, String concepto, Double monto) {
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto; 
	}
	
	public Double getMonto() {
		return this.monto; 
	}
	
	public Double getMontoImponible(){
		return getMonto(); 
	}
}
