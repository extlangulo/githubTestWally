package testRegresionWally_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegresionBuscarArticulo extends Base {
	
	By clicDresses = By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a");
	By clicYellow = By.id("layered_id_attribute_group_16");	
	
	public RegresionBuscarArticulo(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public void buscar() throws InterruptedException  {

				
		ScrollYelloy();
		Thread.sleep(2000);
		click(clicDresses);
		ScrollYelloy();
		click(clicYellow);
		Thread.sleep(4000);
	
	}
	

}
