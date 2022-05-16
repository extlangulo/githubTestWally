package testRegresionWally_POM;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Test_RegresionLogin {
		
	private WebDriver driver;
	RegresionRegistro regresionRegistro;
	RegresionLogin regresionLogin;
	

	@Before
	public void setUp() throws Exception {
		regresionRegistro = new RegresionRegistro(driver);
		driver = regresionRegistro.chromeDriverConnection();
		regresionLogin = new RegresionLogin(driver);
		regresionRegistro.visit("http://automationpractice.com/index.php");
		Thread.sleep(2000);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test
	public void testLoginExitoso() throws InterruptedException {
		regresionRegistro.registo();
		Thread.sleep(2000);
		regresionLogin.ingresarExitoso();
		Thread.sleep(9000);
		assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.",regresionRegistro.MensajeConfirmacion());
		
	}
	
	@Test
	public void testLoginNoExitoso() throws InterruptedException {
		regresionRegistro.registo();
		Thread.sleep(2000);
		regresionLogin.ingresarNoExitoso();
		Thread.sleep(9000);
		assertEquals("There is 1 error",regresionLogin.MensajeConfirmacionNoExitoso());
		
		
			
		
	}

}
