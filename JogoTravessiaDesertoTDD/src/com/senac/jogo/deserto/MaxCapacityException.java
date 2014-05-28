package com.senac.jogo.deserto;

public class MaxCapacityException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8770901069714829568L;
	
	public MaxCapacityException(){
		super("Truck is fully loaded");
	}

}
