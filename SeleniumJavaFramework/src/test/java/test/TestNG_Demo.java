package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFile;
import demo.Log4jDemo;

public class TestNG_Demo {
	
	WebDriver driver = null;
	public static String browserName=null;
	private static Logger Logger = LogManager.getLogger(Log4jDemo.class);//Added
	
	@BeforeTest
	public void setUpTest() { //First function - Setup
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		PropertiesFile.getProperties();
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");	
			driver = new ChromeDriver();		
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		Logger.info("Browser started");//Added

	}

	@Test
	public void googleSearch() { //Second function - Actual test	
		
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
		//driver.quit();
		System.out.println("Test completed successfully");
		PropertiesFile.setProperties();
		}
}