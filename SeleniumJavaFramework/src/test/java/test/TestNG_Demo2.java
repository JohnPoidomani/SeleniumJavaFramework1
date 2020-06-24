package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Demo2 {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() { //First function - Setup
	
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\drivers\\chromedriver\\chromedriver.exe");	
		driver = new ChromeDriver();	
	}

	@Test
	public void googleSearch2() { //Second function - Actual test	
		
		//goto google.com 	
		driver.get("https://google.com");

		//enter text in search box
		driver.findElement(By.name("q")).sendKeys("Automate Step by Step");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//click on search button
		driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		}
	
		@Test
		public void googleSearch3() { //Second function - Actual test	
			
			//goto google.com 	
			driver.get("https://google.com");

			//enter text in search box
			driver.findElement(By.name("q")).sendKeys("Automate Step by Step");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//click on search button
			driver.findElement(By.name("btnK")).click();
			//driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);

	}	
		@AfterTest
		public void tearDownTest() { //Third function - Runs at the end when test is over
	
		//close browser
		driver.close();
		driver.quit();
		System.out.println("Test completed successfully");					
		}
}