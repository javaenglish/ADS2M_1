package room;

import lamp.Lamp;
import door.Door;

public class Room {
	
	private double size;
	private String colour;
	private String kindOfRoom;
	private Lamp lamp;
	private Door door;
	
	public Room() {
		this.kindOfRoom = new String();
		this.colour = new String();
		this.size = 0;
		this.lamp = new Lamp();
	}
	
	public boolean isIluminado(){
		return lamp.isState();
	}
	
	public double getSize() {
		return size;
	}
	
	public void setSize(double size) {
		this.size = size;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String getKindOfRoom() {
		return kindOfRoom;
	}
	
	public void setKindOfRoom(String kindOfRoom) {
		this.kindOfRoom = kindOfRoom;
	}
	
	public void setDoor(Door door){
		this.door = door;
	}
	
	public Door getDoor(){
		return this.door;
	}
}
