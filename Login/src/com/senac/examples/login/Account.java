package com.senac.examples.login;

public interface Account {
	
	public boolean passwordMatches(String candidate);
	public boolean setLoggedIn (boolean state);
	public void setLocked(boolean b);

}
