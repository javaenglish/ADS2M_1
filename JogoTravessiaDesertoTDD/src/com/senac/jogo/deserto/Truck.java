package com.senac.jogo.deserto;

import com.senac.jogo.deserto.MaxCapacityException;

public class Truck {

	private int capacity = 6;
	private int movement;
	public int getCapacity() {
		return capacity;
	}
	
	public void fillGas () throws MaxCapacityException{
		if (capacity  == 6 )
			throw new MaxCapacityException();
			
		}
}
