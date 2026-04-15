package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	
	private ArrayList<Integer> numbers;

	public Counter() {
		numbers = new ArrayList<Integer>();
	}
	
	public void addNumber(int number) {
		numbers.add(number); 
	}
	
	public int getEvenOcurrences(){
		int count = 0; 
		
		for (Integer num : numbers) {
			if (num % 2 == 0) {
				count++; 
			}
		}
		
		return count; 
	}
	
}


