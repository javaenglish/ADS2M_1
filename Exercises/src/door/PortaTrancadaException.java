package door;

public class PortaTrancadaException extends Exception {
	private static final long serialVersionUID = -2601056215007283087L;
	
	public PortaTrancadaException(){
		super("The door is locked");
	}
}
