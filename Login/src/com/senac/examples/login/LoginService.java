package com.senac.examples.login;

public class LoginService {
	
	private AccountDB accountDB;
	private int failedAttempts;
	public LoginService(AccountDB accountDB){
		this.accountDB = accountDB;
	}
	
	public void login(String userName, String password){
		Account account = accountDB.find(userName);
		account.setLoggedIn(true);
		
		
		if (failedAttempts == 3)
		account.setLocked(true);
	}
}
