package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage {
	
	private static WebElement element = null;
	
	public static WebElement textbox_search(WebDriver driver) { //textbox_search function
		
		element = driver.findElement(By.name("q"));
		return element;		
	}
	
	public static WebElement button_search(WebDriver driver) { //button_search function
		
		element = driver.findElement(By.name("btnK"));
		//element = driver.findElement(By.className("gNO89b"));
		return element;		
	}

}