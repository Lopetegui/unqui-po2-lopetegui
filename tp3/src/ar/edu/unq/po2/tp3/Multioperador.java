package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	
	private ArrayList<Integer> numbers;
	
	public Multioperador() {
		numbers = new ArrayList<>(); 
	}
	
	public void addNumber(Integer number) {
		numbers.add(number); 
	}
	
	public int suma() {
		int resultado = 0;
		
		for (Integer num : numbers) {
			resultado += num;
		}
		
		return resultado;
	}
	
	public int multiplicacion() {
		int resultado = 1;
		
		for (Integer num : numbers) {
			resultado *= num;
		}
		
		return resultado; 
	}
	
	public int resta() {
		if (numbers.isEmpty()) {
			return 0;
		}
		
		int resultado = numbers.get(0);
		
		for (int i = 1; i < numbers.size(); i++) {
			resultado -= numbers.get(i);
		}
		
		return resultado; 
	}
}

