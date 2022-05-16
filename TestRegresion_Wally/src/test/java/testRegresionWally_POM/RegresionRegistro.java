package testRegresionWally_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegresionRegistro extends Base{	
	
	By clicLogueo = By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a");
	By emailCreate = By.cssSelector("#email_create");
	By botonCreate = By.cssSelector("#SubmitCreate > span");
	By radioSr = By.cssSelector("#id_gender1");
	By nomCreate = By.cssSelector("#customer_firstname");
	By apellCreate = By.cssSelector("#customer_lastname");
	By passwCreate = By.id("passwd");
	By clicDia = By.cssSelector("#days");
	By clicNumDia = By.cssSelector("#days > option:nth-child(2)");
	By clicMes = By.cssSelector("#months");
	By clicMesNom = By.cssSelector("#months > option:nth-child(13)");
	By clicAnio = By.id("years");
	By clicAnioNom = By.cssSelector("#years > option:nth-child(24)");
	By direccion = By.id("address1");
	By CiuDirec = By.id("city");
	By clicEstaDirec = By.id("id_state");
	By clicEstaDirecNom = By.cssSelector("#id_state > option:nth-child(8)");
	By CodPostDirec = By.cssSelector("#postcode");
	By infoDirecc = By.id("other");
	By movilDecc = By.id("phone_mobile");
	By AsigDirecc = By.id("alias");
	By RegisDirec = By.cssSelector("#submitAccount > span");
	By MensajeConfirmacion = By.cssSelector("#center_column > p");
		
	public RegresionRegistro(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		
	}

	
	public void ingresarRegistro() throws InterruptedException  {
		Thread.sleep(1000);
		click(clicLogueo);
		Thread.sleep(2000);	
	
	}
	
	public void registo() throws InterruptedException {
		Thread.sleep(3000);
		ingresarRegistro();
	}
	
	public void authentication() throws InterruptedException  {
		Scroll();
		type("lorenzo1782@gmail.com", emailCreate);
		click(botonCreate);
		Thread.sleep(4000);
		click(radioSr);
		type("Lorenzo Anibal", nomCreate);
		Thread.sleep(1000);
		type("Anguo Flores", apellCreate);
		Thread.sleep(1000);
		type("12345", passwCreate);
		Thread.sleep(1000);
		click(clicDia);
		Thread.sleep(1000);
		click(clicNumDia);
		Thread.sleep(1000);
		click(clicMes);
		Thread.sleep(1000);
		click(clicMesNom);
		Thread.sleep(1000);
		click(clicAnio);
		Thread.sleep(1000);
		click(clicAnioNom);
		Thread.sleep(1000);
		type("Calle San Antonio", direccion);
		type("Lima", CiuDirec);
		click(clicEstaDirec);
		click(clicEstaDirecNom);
		type("20207", CodPostDirec);
		type("987600913", infoDirecc);
		type("987600913", movilDecc);
		type("Alt. San antonio", AsigDirecc);
		Thread.sleep(2000);
		click(RegisDirec);
		Thread.sleep(8000);
		
	}
	public String MensajeConfirmacion() {
		return getText(MensajeConfirmacion);
	}

	
}
