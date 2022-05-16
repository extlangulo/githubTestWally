package testRegresionWally_POM;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Test_RegresionRegistro {
		
	private WebDriver driver;
	RegresionRegistro regresionRegistro;
	

	@Before 
	public void setUp() throws Exception {		
		regresionRegistro = new RegresionRegistro(driver);
		driver = regresionRegistro.chromeDriverConnection();
		regresionRegistro.visit("http://automationpractice.com/index.php");
		Thread.sleep(2000);
	}
	

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testRegistro() throws InterruptedException{
		regresionRegistro.registo();
		Thread.sleep(2000);
		regresionRegistro.authentication();
		Thread.sleep(4000);
		assertEquals("Welcome to your account. Here you can manage all of your personal information and orders.",regresionRegistro.MensajeConfirmacion());

	}

}
