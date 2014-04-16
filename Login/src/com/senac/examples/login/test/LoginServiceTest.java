package com.senac.examples.login.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginServiceTest {

	@Test
	public void testObjetoContaEstaLogadoQuandoSenhaForIgual() {
		//setting the environment
		Account account = mock(Account.class);
		when(account.passwordMatches(anyString())).thenReturn(true);
		
		AccountDB accountDB = mock(AccountDB.class);
		when(accountDB.find(anyString())).thenReturn(account);
		
		//execution of the method
		LoginService service = new LoginService(accountDB);
		
		service.login("Steve", "CorrectPassword");
		
		//execution verification(asserts) 
		verify(account, times(1)).setLoggedIn(true);

	}

}
