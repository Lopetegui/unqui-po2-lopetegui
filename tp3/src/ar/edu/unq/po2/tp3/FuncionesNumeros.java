package ar.edu.unq.po2.tp3;

public class FuncionesNumeros {

	public int cantidadDeDigitosPares(int numero) {
		if (numero == 0) {
			return 1; 
		}
		
		int count = 0; 
		while ( numero > 0) {
			int digito = numero % 10;
			numero = numero / 10;
			if (digito % 2 == 0) {
				count++;
			}
		}
		return count; 
}
	
	public int numeroConMasDigitosPares(int [] numeros){
		int maxCantidad = -1;
		int numeroMax = numeros [0]; 
		
		for (int num : numeros) {
			int cantidad = cantidadDeDigitosPares(num); 
			if (cantidad > maxCantidad) {
				maxCantidad = cantidad;
				numeroMax = num; 
			}
		}
		return numeroMax; 
	}
	
	public int mayorMultiploComun(int x, int y) {
		if (x == 0 || y == 0) {
			return -1; 
		}
		for (int i = 1000; i >= 0; i--) {
			if (i % x == 0 && i % y == 0) {
				return i;
			}
		}
		return -1;
	}

}

