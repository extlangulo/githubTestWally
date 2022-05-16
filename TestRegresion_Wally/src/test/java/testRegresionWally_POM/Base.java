package testRegresionWally_POM;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	private WebDriver driver;
	
	public Base(WebDriver driver) {
		this.driver = driver;		
	}
	
	public WebDriver chromeDriverConnection() {

		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
			
	}
	
	//Buscar el elemento del locator
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	//Obtener texto
	public String getText(WebElement element) {		
		return element.getText();
	}
			
	//
	public String getText(By locator) {		
		return driver.findElement(locator).getText();
	}
	
	//Para escribir
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	//Realizar clic
	public void click(By locator) {		
		driver.findElement(locator).click();
	}
	
	public void visit(String url) {
		driver.get(url);
	}
	
	public void Scroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
	}
	
	public void ScrollYelloy() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
	}
	
}
