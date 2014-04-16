package com.senac.examples.login.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.senac.examples.login.Account;
import com.senac.examples.login.AccountDB;
import com.senac.examples.login.LoginService;
import org.junit.runners.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class LoginServiceTest {
	
	private Account account;
	private AccountDB accountDB;
	
	@Before
	public void setUp (){
		 account = mock(Account.class);
		
		AccountDB accountDB = mock(AccountDB.class);
		when(accountDB.find(anyString())).thenReturn(account);
	}
	private void willPasswordMatch(boolean value){
		when(account.passwordMatches(anyString())).thenReturn(value);
	}
	@Test
	public void testObjetoContaEstaLogadoQuandoSenhaForCorreta() {
		//setting the environment
		willPasswordMatch(false);
		
		//execution of the method
		LoginService service = new LoginService(accountDB);
		
		service.login("Steve", "CorrectPassword");
		
		//execution verification(asserts) 
		verify(account, times(1)).setLoggedIn(true);

	}

	@Test
	public void testeContaDeveSerSuspensaQuandoFalharTresLogins(){
		//preparacao do ambiente
		account = mock(Account.class);
				
		accountDB = mock(AccountDB.class);
		when(accountDB.find(anyString())).thenReturn(account);
		
		//execução do teste
		LoginService service = new LoginService(accountDB);
		for (int i=0; i < 3; i++)
			service.login("Steve", "WrongPassword");
		
		//validacao do teste
		verify(account, times(1)).setLocked(true);
	}
	
	@Test
	public void testObjetoContaEstaLogadoQuandoSenhaForErrada(){
		when(account.passwordMatches(anyString())).thenReturn(false);	
	//preparacao do ambiente
		willPasswordMatch(false);
		//executa teste
		LoginService service = new LoginService(accountDB);
		service.login("Steve", "WrongPassword");
		//verifica resultado
		verify(account, never()).setLoggedIn(true);
	}
}
