package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;
	
	//By textbox_search = By.id("lst-ib");	
	By textbox_search = By.name("q");
	By button_search = By.name("btnK");
	
	public GoogleSearchPageObjects(WebDriver driver) {
		this.driver = driver;
	} //GoogleSearchPageObjects "constructor"
	
	public void setTextInSearchBox(String text) {
		driver.findElement(textbox_search).sendKeys(text);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} //setTextInSearchBox "function"
	
	public void clickSearchButton() {
		driver.findElement(button_search).sendKeys(Keys.RETURN);
	} //clickSearchButton "function"
	
	

}
