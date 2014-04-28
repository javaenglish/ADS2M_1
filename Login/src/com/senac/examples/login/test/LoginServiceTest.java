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
	
	private LoginService service;
	private Account account;
	private AccountDB accountDB;
	
	@Before
	public void setUp (){
		 account = mock(Account.class);
		
		AccountDB accountDB = mock(AccountDB.class);
		when(accountDB.find(anyString())).thenReturn(account);
		
		service = new LoginService(accountDB);
	}
	
	private void willPasswordMatch(boolean value){
		when(account.passwordMatches(anyString())).thenReturn(value);
	}
	
	@Test
	public void testObjetoContaEstaLogadoQuandoSenhaForCorreta() {
		//setting the environment
		willPasswordMatch(false);
		
		//execution of the method
		service.login("Steve", "CorrectPassword");
		
		//execution verification(asserts) 
		verify(account, times(1)).setLoggedIn(true);

	}

	@Test
	public void testeContaDeveSerSuspensaQuandoFalharTresLogins(){
		//preparacao do ambiente
		willPasswordMatch(false);
		
		//execução do teste
		for (int i=0; i < 3; i++)
			service.login("Steve", "WrongPassword");
		
		//validacao do teste
		verify(account, times(1)).setLocked(true);
	}
	
	@Test
	public void testObjetoContaEstaLogadoQuandoSenhaForErrada(){
	//preparacao do ambiente
		willPasswordMatch(false);
		//executa teste

		service.login("Steve", "WrongPassword");
		//verifica resultado
		verify(account, never()).setLoggedIn(true);
	}
	
	@Test
	public void testaFalhaDeLoginsSucessoNoTerceiroLogin(){
	
		//preparacao do ambiente
				willPasswordMatch(false);
				when(account.passwordMatches("CorrectPassword")).thenReturn(true);
				//executa teste
				service.login("Steve", "WrongPassword");
				service.login("Steve", "WrongPassword");
				service.login("Steve", "CorrectPassword");
				
				//verifica resultado
				verify(account, never()).setLoggedIn(true);
	}

	@Test
	public void testeNaoDeveBloquearSegundaContaQuandoUmaContaFalhaDuasVezesAntes() {
		willPasswordMatch(false);
		Account second = mock(Account.class);
		when(second.passwordMatches(anyString())).thenReturn(true);
		
		when(accountDB.find("Annie")).thenReturn(second);
		
		//execucao teste
		service.login("Steve", "WrongPassword");
		service.login("Steve", "WrongPassword");
		service.login("Annie", "WrongPassword");
		
		//verifica execucao
		verify(second, never()).setLocked(true);
	}

	@Test(expected= AccountLoginLimitReachedException.class)
	public void testeNaoPodeLogarQuandoJaEstaLogado() {
		willPasswordMatch(true);
		when(account.isLoggedIn()).thenReturn(true);
		service.login("Steve", "CorrectPassword");
		
	}
}
