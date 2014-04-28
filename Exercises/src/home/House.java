package home;

import room.Room;
import door.Door;

public class House {
	
	Vetor<Room> rooms;
	Vetor<Door> doors;
	
	public House(){
		rooms = new Vetor<Room>();
		doors = new Vetor<Door>();
	}
	public void addRoom (Room room){
		rooms.add(room);
	}

	public void addDoor(Door door){
		this.doors.add(door);
	}

	public void addConnectionRooms(Door door, Room out, Room in){
		door.connectRoom(out, in);
		addDoor(door);
		addRoom(out);
		
	}
}
