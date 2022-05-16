package testRegresionWally_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegresionLogin extends Base {
	
	By maiLogin = By.id("email");
	By maiPass = By.id("passwd");
	By botonSignIn = By.id("SubmitLogin");
	By MensajeConfirmacionNoExitoso = By.cssSelector("#center_column > div.alert.alert-danger > p");	                       

	
	public RegresionLogin(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void ingresarExitoso() throws InterruptedException  {
		Scroll();
		type("lorenzo1782@gmail.com", maiLogin);
		type("12345", maiPass);
		Thread.sleep(2000);
		click(botonSignIn);
	}
	public void ingresarNoExitoso() throws InterruptedException  {
		Scroll();
		type("lorenzo1782@gmail.com", maiLogin);
		type("12346", maiPass);
		Thread.sleep(2000);
		click(botonSignIn);
	}

	public String MensajeConfirmacionNoExitoso() {
		return getText(MensajeConfirmacionNoExitoso);
	}	

}
