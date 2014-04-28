package com.senac.examples.login;

public interface Account {
	
	public boolean passwordMatches(String candidate);
	public void setLoggedIn (boolean state);
	public void setLocked(boolean b);
	public boolean isLoggedIn();

}
