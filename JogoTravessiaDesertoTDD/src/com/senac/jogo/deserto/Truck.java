package com.senac.jogo.deserto;

import com.senac.jogo.deserto.MaxCapacityException;

public class Truck {

	private int capacity = 0;
	private int movement;
	
	public Truck(){
		this.capacity = 6;
		this.movement = 0;
	}
	public int getCapacity() {
		return capacity;
	}
	
	public int getMovement() {
		return movement;
	}
	
	public void takeGasOut(){
		if (capacity >0)
			capacity--;
	}
	
	public void addGas(){
		if (capacity < 6)
			capacity++;
	}
	
	public void fullGas () throws MaxCapacityException{
		if (capacity  == 6 )
			throw new MaxCapacityException();
	}
}
