package door;

import door.Key;

public class Door {
	
	private boolean open;
	private boolean locked;
	protected int lock;
	
	
	public Door(boolean state, boolean locked, int lock) {
		this.open = state;
		this.locked = locked;
		this.lock = lock;
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
