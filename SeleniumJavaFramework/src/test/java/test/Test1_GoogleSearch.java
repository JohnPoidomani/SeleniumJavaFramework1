package test;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		googleSearch();		
	}	
	public static void googleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		//goto google.com 	
		driver.get("https://google.com");
		try {
		//enter text in search box
		driver.findElement(By.name("q")).sendKeys("Automate Step by Step");
		Thread.sleep(1000);
		//click on search button
		driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		//close browser
		driver.close();	
		System.out.println("Test completed successfully");					
	}
}