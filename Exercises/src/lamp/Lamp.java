package lamp;

public class Lamp {
	
	public boolean state;	
	
	public void ligar(){
		state = true;
		
	}	
	
	public void desligar(){
		state = false;
	}
	
	public boolean isState() {
		return state;
	}
}
