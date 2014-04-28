package door;

import room.Room;

public class Door {
	
	private boolean open;
	private boolean locked;
	protected int lock;
	private Room out;
	private Room in;
	
	private void connectRoom(Room out, Room in){
		this.out = out;
		out.setDoor(this);
		this.in = in;
		in.setDoor(this);
	}
	public Door(boolean state, boolean locked, int lock) {
		this.open = state;
		this.locked = locked;
		this.lock = lock;
		this.in = null;
		this.out = null;
	}

	public boolean isOpen() {
		return open;
	}

	public void openDoor() throws PortaTrancadaException{
		if(isOpen())
			throw new PortaTrancadaException();
		this.open = true;
	}

	public void closeDoor() {
		this.open = false;
	}
	
	public boolean isLocked() {
		return locked;
	}

	public void lockDoor(Key key) {
		if (!isOpen() && lock == key.getCode())
			this.locked = true;
	}

	public void unlockDoor(Key key){
		if (lock == key.getCode())
		this.locked = false;
			
	}
}
