package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		googleSearch();		
	}	
	public static void googleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");	
		driver = new ChromeDriver();
		
		//goto google.com 	
		driver.get("https://google.com");
		try {
		//enter text in search box
		//driver.findElement(By.name("q")).sendKeys("Automate Step by Step");
		Thread.sleep(1000);
		
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		
		//click on search button
		//driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		Thread.sleep(1000);
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		//GoogleSearchPage.button_search(driver).click();	
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		//close browser
		driver.close();	
		System.out.println("Test completed successfully");					
	}
}