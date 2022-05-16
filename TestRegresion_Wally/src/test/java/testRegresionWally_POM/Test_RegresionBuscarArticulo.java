package testRegresionWally_POM;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Test_RegresionBuscarArticulo {

	private WebDriver driver;
	RegresionRegistro regresionRegistro;
	RegresionBuscarArticulo regresionBuscarArticulo;
	String s;

	@Before
	public void setUp() throws Exception {
		regresionRegistro = new RegresionRegistro(driver);
		driver = regresionRegistro.chromeDriverConnection();
		regresionBuscarArticulo = new RegresionBuscarArticulo(driver);
		regresionRegistro.visit("http://automationpractice.com/index.php");
		Thread.sleep(6000);

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test()throws InterruptedException {
		
		regresionBuscarArticulo.buscar();
		Thread.sleep(3000);
		WebElement p=driver.findElement(By.xpath("//span[text() = \"There are 3 products.\"]"));
	    s  = p.getText();
	    System.out.println("conteo   " + s);		
	
	}

}
