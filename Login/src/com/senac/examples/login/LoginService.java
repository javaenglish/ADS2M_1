package com.senac.examples.login;

public class LoginService {
	
	private AccountDB accountDB;
	private Account previousAccount;

	private int failedAttempts;
	public LoginService(AccountDB accountDB){
		this.accountDB = accountDB;
	}
	
	public void login(String userName, String password) throws AccountLoginLimitReachedException{
		Account account = accountDB.find(userName);
		
		if (account.isLoggedIn()) {
			throw new AccountLoginLimitReachedException();
		}
		if (account.passwordMatches(password))
			account.setLoggedIn(true);
		else {
			if(account.equals(previousAccount)) {
				failedAttempts++;
			} else {
				failedAttempts = 1;
				previousAccount = account;
			}
			
		} 
			
		if (failedAttempts == 3)
		account.setLocked(true);
	}
}
